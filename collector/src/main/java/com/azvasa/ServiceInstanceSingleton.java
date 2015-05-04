package com.azvasa;

import com.vmware.vim25.mo.ServiceInstance;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/**
 * Created by prasadshirsath on 4/25/15.
 */
public class ServiceInstanceSingleton {

    static ServiceInstance SERVICE_INSTANCE;
    static String vCenterIP = "https://130.65.132.109/sdk";
    static final String USER = "administrator";
    static final String PW = "12!@qwQW";
    static Map<String,Timer> vm_Timer_map = new HashMap<>();
    static String logPath="/home/test/logs.txt";
    static ServiceInstance getServiceInstance() {

        if(SERVICE_INSTANCE==null) {
            try {
                SERVICE_INSTANCE=new ServiceInstance(new URL(vCenterIP), USER,
                        PW, true);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
       return SERVICE_INSTANCE;

    }

    public static void startLogTimer(String vmName)
    {
        Timer timer;
        Collector collectorTask = new Collector(vmName,logPath);

        if(vm_Timer_map.containsKey(vmName))
        {
            timer= vm_Timer_map.get(vmName);
            timer.cancel();
            vm_Timer_map.remove(vmName);

        }
        timer= new Timer();
        vm_Timer_map.put(vmName,timer);

        timer.schedule(collectorTask, 0, 5*1000);

    }
    public static void stopLogTimer(String vmName)
    {
        Timer timer;

        if(vm_Timer_map.containsKey(vmName))
        {
            timer= vm_Timer_map.get(vmName);
            timer.cancel();
            vm_Timer_map.remove(vmName);

        }
    }



}
