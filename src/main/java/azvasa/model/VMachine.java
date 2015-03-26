package azvasa.model;

import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.VirtualMachine;
import org.apache.catalina.Host;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class VMachine {

	private String name;
    private List<String> datastores;
    private String powerState;
    private String bootTime;
    private String guestOSName;
    private String guestID;
    private String version;
    private List<String> hostNames;
    private List<String> networkNames;
    private int  guestMemoryUsage;

    public String getName() {
        return name;
    }

    public List<String> getDatastores() {
        return datastores;
    }

    public String getPowerState() {
        return powerState;
    }

    public String getBootTime() {
        return bootTime;
    }

    public String getGuestOSName() {
        return guestOSName;
    }

    public String getGuestID() {
        return guestID;
    }

    public String getVersion() {
        return version;
    }

    public List<String> getHostNames() {
        return hostNames;
    }

    public List<String> getNetworkNames() {
        return networkNames;
    }

    public int getGuestMemoryUsage() {
        return guestMemoryUsage;
    }

    public int getHostMemoryUsage() {
        return hostMemoryUsage;
    }

    public int getOverallCPUUsage() {
        return overallCPUUsage;
    }

    private int  hostMemoryUsage;
    private int  overallCPUUsage;


    public VMachine(String name, String powerState, String bootTime, String guestOSName, String guestID, String version,List<String> networks,List<String> hosts,int guestMemoryUsage,int hostMemoryUsage,int overallCPUUsage,List<String> datastores) {
        this.name = name;
        this.powerState = powerState;
        this.bootTime = bootTime;
        this.guestOSName = guestOSName;
        this.guestID = guestID;
        this.version = version;
        this.hostNames=hosts;
        this.networkNames=networks;
        this.guestMemoryUsage=guestMemoryUsage;
        this.hostMemoryUsage=hostMemoryUsage;
        this.overallCPUUsage=overallCPUUsage;

        this.datastores = datastores;
    }

    public static VMachine instance(VirtualMachine virtualMachine) {
        VirtualMachineRuntimeInfo vmri = (VirtualMachineRuntimeInfo) virtualMachine.getRuntime();
        VirtualMachineConfigInfo congif= virtualMachine.getConfig();
         List<Network> networks= new ArrayList<Network>();
        try {
            networks = Arrays.asList(virtualMachine.getNetworks());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        List<String> networknames= new ArrayList<String>();
        List<String> hosts= new ArrayList<String>();

        for(Network n:networks)
        {
            networknames.add(n.getName());
            for(HostSystem h:n.getHosts())
                hosts.add(h.getName());
        }

        VirtualMachineQuickStats stats = virtualMachine.getSummary().getQuickStats();
        assert stats!=null;

        String vmachineName = virtualMachine.getName();
        assert vmri.getBootTime()!=null;
        String bootTime = null;
        if(vmri.getBootTime()!=null){
            bootTime = vmri.getBootTime().getTime().toString();
        }else{
            bootTime = "Not Available";
        }

        String guestFullName = congif.getGuestFullName();
        String guestId = congif.getGuestId();
        String version1 = congif.getVersion();
        Integer guestMemoryUsage1 = stats.getGuestMemoryUsage();
        Integer hostMemoryUsage1 = stats.getHostMemoryUsage();
        Integer overallCpuUsage = stats.overallCpuUsage;
        Datastore[] datastores1 = null;
        try {
            datastores1 = virtualMachine.getDatastores();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        List<String> dataStoreNames = new ArrayList<String>();
        if(datastores1!=null){
            Arrays.asList(datastores1).stream().forEach(store->dataStoreNames.add(store.getName()));
        }

        return new VMachine(vmachineName,vmri.getPowerState().name(), bootTime, guestFullName, guestId, version1,networknames,hosts, guestMemoryUsage1, hostMemoryUsage1, overallCpuUsage,dataStoreNames);
    }
}
