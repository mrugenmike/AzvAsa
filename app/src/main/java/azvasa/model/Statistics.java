package azvasa.model;

public class Statistics {
	String ID;
	String vmName;
	String cpuUsage;
	String guestMemoryUsage;
	String hostMemoryUsage;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public String getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public String getGuestMemoryUsage() {
		return guestMemoryUsage;
	}

	public void setGuestMemoryUsage(String guestMemoryUsage) {
		this.guestMemoryUsage = guestMemoryUsage;
	}

	public String getHostMemoryUsage() {
		return hostMemoryUsage;
	}

	public void setHostMemoryUsage(String hostMemoryUsage) {
		this.hostMemoryUsage = hostMemoryUsage;
	}

}
