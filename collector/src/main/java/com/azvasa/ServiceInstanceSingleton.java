package com.azvasa;

import com.vmware.vim25.mo.ServiceInstance;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Created by prasadshirsath on 4/25/15.
 */
public class ServiceInstanceSingleton {

    static ServiceInstance SERVICE_INSTANCE;
    static String vCenterIP = "https://130.65.132.109/sdk";
    static final String USER = "administrator";
    static final String PW = "12!@qwQW";

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

}
