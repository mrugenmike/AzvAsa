package azvasa.model;
public class VMachine {

	private String name;
	private String message;
	private String ip;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;
	
	public String getName() {
		return this.name;
	}
	public String getMessage() {
		return this.message;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public VMachine(String name, String message, String ip, String status){
		this.name = name;
		this.message= message;
		this.ip = ip;
		this.status = status;
	}
}
