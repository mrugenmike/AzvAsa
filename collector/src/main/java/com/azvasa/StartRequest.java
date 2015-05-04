package com.azvasa;

import javax.validation.constraints.NotNull;

/**
 * Created by mrugen on 5/3/15.
 */
public class StartRequest {
    @NotNull
    String vmname;

    public String getVmname() {
        return vmname;
    }

    public void setVmname(String vmname) {
        this.vmname = vmname;
    }


}
