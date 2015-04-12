package azvasa.model;

import java.util.Date;

/**
 * Created by mrugen on 4/11/15.
 */
public class VMEntry {
    public String getUserName() {
        return userName;
    }

    public String getVmName() {
        return vmName;
    }

    public Date getTime() {
        return time;
    }

    private final String userName;
    private final String vmName;
    private final Date time;

    public VMEntry(String userName, String vmName, Date time) {

        this.userName = userName;
        this.vmName = vmName;
        this.time = time;
    }
}
