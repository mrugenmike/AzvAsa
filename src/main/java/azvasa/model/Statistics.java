package azvasa.model;

public class Statistics {
	String ID;
	String vmName;
	String vmIP;
	String cpuUsage;
	String memoryUsage;


	public String getID() {
		return ID;
	}
	public void setTimeStamp(String ID) {
		this.ID = ID;
	}
	public String getVmName() {
		return vmName;
	}
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}
	public String getVmIP() {
		return vmIP;
	}
	public void setVmIP(String vmIP) {
		this.vmIP = vmIP;
	}
	public String getCpuUsage() {
		return cpuUsage;
	}
	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
	public String getMemoryUsage() {
		return memoryUsage;
	}
	public void setMemoryUsage(String memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
	
}
