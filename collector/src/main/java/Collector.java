
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimerTask;

import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfEntityMetricCSV;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfMetricSeriesCSV;
import com.vmware.vim25.PerfProviderSummary;
import com.vmware.vim25.PerfQuerySpec;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.PerformanceManager;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

public class Collector extends TimerTask{

	static String[] counters = { "cpu.usagemhz.none","cpu.usagemhz.average","cpu.usagemhz.minimum","cpu.usagemhz.maximum", "mem.usage.none","mem.usage.average","mem.usage.minimum","mem.usage.maximum",
		"disk.usage.none","disk.usage.average","disk.usage.minimum","disk.usage.maximum", "net.usage.none","net.usage.average","net.usage.minimum","net.usage.maximum", "sys.heartbeat.summation" };
	static PerformanceManager perfMgr;
	static HashMap<Integer, PerfCounterInfo> countersinfoMap;
	static HashMap<String, Integer> countersIdMap;
	static PerfMetricId[] pmis;
	static String HOSTNAME = null;
	static String vCenterIP = "https://130.65.132.109/sdk";
	static final String USER = "administrator";
	static final String PW = "12!@qwQW";
	static String VMNAME;
	static boolean isHost = false;
	static StringBuilder fullStat = new StringBuilder("");
	static ServiceInstance SERVICE_INSTANCE;
	static DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	String FILENAME;
	public Collector(String VmName,String filePath)
	{
		VMNAME=VmName;
		FILENAME=filePath;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stubVMNAME = args[0];
		

		ManagedEntity me;
		try {
			SERVICE_INSTANCE = new ServiceInstance(new URL(vCenterIP), USER,
					PW, true);


			perfMgr = SERVICE_INSTANCE.getPerformanceManager();
			PerfCounterInfo[] pcis = perfMgr.getPerfCounter();

			// create map between counter ID and PerfCounterInfo, counter name
			// and ID
			countersIdMap = new HashMap<String, Integer>();
			countersinfoMap = new HashMap<Integer, PerfCounterInfo>();

			for (int i = 0; i < pcis.length; i++) {


				countersinfoMap.put(pcis[i].getKey(), pcis[i]);
				countersIdMap.put(
						pcis[i].getGroupInfo().getKey() + "."
								+ pcis[i].getNameInfo().getKey() + "."
								+ pcis[i].getRollupType(), pcis[i].getKey());
			}

			pmis = createPerfMetricId(counters);
			for(PerfMetricId p:pmis)
			{
				System.out.println(""+p.getCounterId());
			}
			me = (VirtualMachine) new InventoryNavigator(
					SERVICE_INSTANCE.getRootFolder()).searchManagedEntity(
							"ManagedEntity", VMNAME);

			writeStatToFile(me,false,FILENAME);
			ManagedEntity host = (ManagedEntity) new InventoryNavigator(
					SERVICE_INSTANCE.getRootFolder()).searchManagedEntity(
							"HostSystem", findHost(me));
			System.out.println(host);
			writeStatToFile(host,true,FILENAME);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void run(String[] args) throws Exception 
	{
		
	}

	static String findHost(ManagedEntity vm) {
		String host_ip = null;
		try {
			ManagedEntity[] host_pool = new InventoryNavigator(
					SERVICE_INSTANCE.getRootFolder())
			.searchManagedEntities("HostSystem");
			for (int i = 0; i < host_pool.length; i++) {
				HostSystem host = (HostSystem) host_pool[i];
				VirtualMachine[] vm_pool = host.getVms();
				for (int j = 0; j < vm_pool.length; j++) {
					if (vm_pool[j].getName().equals(vm.getName())) {
						host_ip = host.getName();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return host_ip;
	}

	static PerfMetricId[] createPerfMetricId(String[] counters) {
		PerfMetricId[] metricIds = new PerfMetricId[counters.length];
		for (int i = 0; i < counters.length; i++) {
			PerfMetricId metricId = new PerfMetricId();
			metricId.setCounterId(countersIdMap.get(counters[i]));
			metricId.setInstance("*");
			metricIds[i] = metricId;
		}
		return metricIds;
	}

	static void writeStatToFile(ManagedEntity me, boolean isHost,
			String filename1) throws Exception {
		PerfProviderSummary pps = perfMgr.queryPerfProviderSummary(me);
		int refreshRate = pps.getRefreshRate().intValue();

		// only return the latest one sample
		PerfQuerySpec qSpec = createPerfQuerySpec(me, 1, refreshRate);

		PerfEntityMetricBase[] pValues = perfMgr
				.queryPerf(new PerfQuerySpec[] { qSpec });
		if (pValues != null) {
			for (int i = 0; i < pValues.length; ++i) {
				storePerfMetricCSV((PerfEntityMetricCSV) pValues[i], me,isHost,
						filename1);
			}
		}
	}

	static String storePerfMetricCSV(PerfEntityMetricCSV pem, ManagedEntity me,boolean isHost,
			String filename1) {



		StringBuilder oneLine = new StringBuilder("");
		if(isHost)
			oneLine.append( df.format(new Date())+ " HOST ");
		else
			oneLine.append( df.format(new Date())+ " VM ");

		oneLine.append(me.getName() + " ");
		PerfMetricSeriesCSV[] csvs = pem.getValue();
		File file = new File(filename1);
		HashMap<Integer, PerfMetricSeriesCSV> statReturn = new HashMap<Integer, PerfMetricSeriesCSV>();
		for (int i = 0; i < csvs.length; i++) {
			statReturn.put(csvs[i].getId().getCounterId(), csvs[i]);
		}
		for (int i = 0; i < counters.length; i++) {
			Integer counterId = countersIdMap.get(counters[i]);
			String value = null;
			if (statReturn.containsKey(counterId))
				value = statReturn.get(counterId).getValue();
			if (value == null) {
				value = "0";
			}
			System.out.print(value + ",");
			oneLine.append(value);

			oneLine.append(" ");

		}
		System.out.print(oneLine.toString());
		try {
			if (!file.exists()) {
				PrintWriter writer = new PrintWriter(new BufferedWriter(
						new FileWriter(filename1, false)));

				writer.println(oneLine.toString());
				writer.close();
			} else {
				PrintWriter writer = new PrintWriter(new BufferedWriter(
						new FileWriter(filename1, true)));

				writer.println(oneLine.toString());
				writer.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return oneLine.toString();
	}

	private static PerfQuerySpec createPerfQuerySpec(ManagedEntity me,
			int maxSample, int interval) {
		PerfQuerySpec qSpec = new PerfQuerySpec();
		qSpec.setEntity(me.getMOR());
		qSpec.setMaxSample(new Integer(maxSample));
		qSpec.setMetricId(pmis);
		qSpec.setFormat("csv");
		qSpec.setIntervalId(new Integer(interval));
		return qSpec;
	}

	

}