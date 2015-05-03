package com.azvasa;

import javax.validation.constraints.NotNull;

/**
 * Created by mrugen on 5/3/15.
 */
public class StartRequest {
    public String getVmname() {
        return vmname;
    }

    public void setVmname(String vmname) {
        this.vmname = vmname;
    }
    @NotNull
    String vmname;

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
    @NotNull
    String logPath;
}
