
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.oracle.webservices.internal.literal.List;


/**
 * <p>Java class for VirtualServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="supportHVM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverTypeDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memFree" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="vmList" type="{http://www.oracle.com/webservices/internal/literal}list"/>
 *         &lt;element name="serverPool" type="{http://oracle.ovs.api/types/}ServerPool"/>
 *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loginPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentPwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hdFree" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualServer", propOrder = {
    "comments",
    "platform",
    "memAmount",
    "supportHVM",
    "serverType",
    "loginUsername",
    "status",
    "serverTypeDisplay",
    "memFree",
    "serverId",
    "vmList",
    "serverPool",
    "architecture",
    "hdAmount",
    "loginPassword",
    "agentPwd",
    "serverName",
    "location",
    "ip",
    "cpuNum",
    "hdFree"
})
@XmlSeeAlso({
    MasterVirtualServer.class,
    UtilityVirtualServer.class
})
public class VirtualServer {

    @XmlElement(required = true, nillable = true)
    protected String comments;
    @XmlElement(required = true, nillable = true)
    protected String platform;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long memAmount;
    @XmlElement(required = true, nillable = true)
    protected String supportHVM;
    @XmlElement(required = true, nillable = true)
    protected String serverType;
    @XmlElement(required = true, nillable = true)
    protected String loginUsername;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String serverTypeDisplay;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long memFree;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long serverId;
    @XmlElement(required = true, nillable = true)
    protected List vmList;
    @XmlElement(required = true, nillable = true)
    protected ServerPool serverPool;
    @XmlElement(required = true, nillable = true)
    protected String architecture;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long hdAmount;
    @XmlElement(required = true, nillable = true)
    protected String loginPassword;
    @XmlElement(required = true, nillable = true)
    protected String agentPwd;
    @XmlElement(required = true, nillable = true)
    protected String serverName;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, nillable = true)
    protected String ip;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cpuNum;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long hdFree;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the memAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemAmount() {
        return memAmount;
    }

    /**
     * Sets the value of the memAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemAmount(Long value) {
        this.memAmount = value;
    }

    /**
     * Gets the value of the supportHVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportHVM() {
        return supportHVM;
    }

    /**
     * Sets the value of the supportHVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportHVM(String value) {
        this.supportHVM = value;
    }

    /**
     * Gets the value of the serverType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * Sets the value of the serverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerType(String value) {
        this.serverType = value;
    }

    /**
     * Gets the value of the loginUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsername() {
        return loginUsername;
    }

    /**
     * Sets the value of the loginUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsername(String value) {
        this.loginUsername = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the serverTypeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTypeDisplay() {
        return serverTypeDisplay;
    }

    /**
     * Sets the value of the serverTypeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTypeDisplay(String value) {
        this.serverTypeDisplay = value;
    }

    /**
     * Gets the value of the memFree property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemFree() {
        return memFree;
    }

    /**
     * Sets the value of the memFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemFree(Long value) {
        this.memFree = value;
    }

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServerId(Long value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the vmList property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getVmList() {
        return vmList;
    }

    /**
     * Sets the value of the vmList property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setVmList(List value) {
        this.vmList = value;
    }

    /**
     * Gets the value of the serverPool property.
     * 
     * @return
     *     possible object is
     *     {@link ServerPool }
     *     
     */
    public ServerPool getServerPool() {
        return serverPool;
    }

    /**
     * Sets the value of the serverPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerPool }
     *     
     */
    public void setServerPool(ServerPool value) {
        this.serverPool = value;
    }

    /**
     * Gets the value of the architecture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Sets the value of the architecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * Gets the value of the hdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHdAmount() {
        return hdAmount;
    }

    /**
     * Sets the value of the hdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHdAmount(Long value) {
        this.hdAmount = value;
    }

    /**
     * Gets the value of the loginPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * Sets the value of the loginPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPassword(String value) {
        this.loginPassword = value;
    }

    /**
     * Gets the value of the agentPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPwd() {
        return agentPwd;
    }

    /**
     * Sets the value of the agentPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPwd(String value) {
        this.agentPwd = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the cpuNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpuNum() {
        return cpuNum;
    }

    /**
     * Sets the value of the cpuNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpuNum(Long value) {
        this.cpuNum = value;
    }

    /**
     * Gets the value of the hdFree property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHdFree() {
        return hdFree;
    }

    /**
     * Sets the value of the hdFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHdFree(Long value) {
        this.hdFree = value;
    }

}
