
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oracle.ovs.api/types/}VirtualMachineBase">
 *       &lt;sequence>
 *         &lt;element name="imgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imgId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bootDevice" type="{http://oracle.ovs.api/types/}BootDevice"/>
 *         &lt;element name="imgSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vncPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximumMemory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publish" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="haEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operatingSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="parentImg" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="systemPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="systemLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deploy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://oracle.ovs.api/types/}VmStatus"/>
 *         &lt;element name="vncPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imgIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poweronTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="virtualMachineType" type="{http://oracle.ovs.api/types/}VmType"/>
 *         &lt;element name="keyboardLayout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pvdriver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cpuCap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cpuPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachine", propOrder = {
    "imgName",
    "comments",
    "imgId",
    "bootDevice",
    "imgSize",
    "vncPassword",
    "maximumMemory",
    "publish",
    "cpuNumber",
    "haEnable",
    "uuid",
    "operatingSystemName",
    "createTime",
    "parentImg",
    "systemPassword",
    "location",
    "memory",
    "systemLogin",
    "platform",
    "deploy",
    "status",
    "vncPort",
    "imgIp",
    "poweronTime",
    "architecture",
    "virtualMachineType",
    "keyboardLayout",
    "pvdriver",
    "cpuCap",
    "cpuPriority"
})
public class VirtualMachine
    extends VirtualMachineBase
{

    @XmlElement(required = true, nillable = true)
    protected String imgName;
    @XmlElement(required = true, nillable = true)
    protected String comments;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long imgId;
    @XmlElement(required = true, nillable = true)
    protected BootDevice bootDevice;
    @XmlElement(required = true, nillable = true)
    protected String imgSize;
    @XmlElement(required = true, nillable = true)
    protected String vncPassword;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maximumMemory;
    @XmlElement(required = true, nillable = true)
    protected String publish;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cpuNumber;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean haEnable;
    @XmlElement(required = true, nillable = true)
    protected String uuid;
    @XmlElement(required = true, nillable = true)
    protected String operatingSystemName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long createTime;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long parentImg;
    @XmlElement(required = true, nillable = true)
    protected String systemPassword;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer memory;
    @XmlElement(required = true, nillable = true)
    protected String systemLogin;
    @XmlElement(required = true, nillable = true)
    protected String platform;
    @XmlElement(required = true, nillable = true)
    protected String deploy;
    @XmlElement(required = true, nillable = true)
    protected VmStatus status;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer vncPort;
    @XmlElement(required = true, nillable = true)
    protected String imgIp;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long poweronTime;
    @XmlElement(required = true, nillable = true)
    protected String architecture;
    @XmlElement(required = true, nillable = true)
    protected VmType virtualMachineType;
    @XmlElement(required = true, nillable = true)
    protected String keyboardLayout;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean pvdriver;
    protected Integer cpuCap;
    protected Integer cpuPriority;

    /**
     * Gets the value of the imgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * Sets the value of the imgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgName(String value) {
        this.imgName = value;
    }

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
     * Gets the value of the imgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImgId() {
        return imgId;
    }

    /**
     * Sets the value of the imgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImgId(Long value) {
        this.imgId = value;
    }

    /**
     * Gets the value of the bootDevice property.
     * 
     * @return
     *     possible object is
     *     {@link BootDevice }
     *     
     */
    public BootDevice getBootDevice() {
        return bootDevice;
    }

    /**
     * Sets the value of the bootDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BootDevice }
     *     
     */
    public void setBootDevice(BootDevice value) {
        this.bootDevice = value;
    }

    /**
     * Gets the value of the imgSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgSize() {
        return imgSize;
    }

    /**
     * Sets the value of the imgSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgSize(String value) {
        this.imgSize = value;
    }

    /**
     * Gets the value of the vncPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVncPassword() {
        return vncPassword;
    }

    /**
     * Sets the value of the vncPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVncPassword(String value) {
        this.vncPassword = value;
    }

    /**
     * Gets the value of the maximumMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMemory() {
        return maximumMemory;
    }

    /**
     * Sets the value of the maximumMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMemory(Integer value) {
        this.maximumMemory = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublish(String value) {
        this.publish = value;
    }

    /**
     * Gets the value of the cpuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpuNumber() {
        return cpuNumber;
    }

    /**
     * Sets the value of the cpuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpuNumber(Integer value) {
        this.cpuNumber = value;
    }

    /**
     * Gets the value of the haEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaEnable() {
        return haEnable;
    }

    /**
     * Sets the value of the haEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaEnable(Boolean value) {
        this.haEnable = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the operatingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    /**
     * Sets the value of the operatingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystemName(String value) {
        this.operatingSystemName = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateTime(Long value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the parentImg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentImg() {
        return parentImg;
    }

    /**
     * Sets the value of the parentImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentImg(Long value) {
        this.parentImg = value;
    }

    /**
     * Gets the value of the systemPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemPassword() {
        return systemPassword;
    }

    /**
     * Sets the value of the systemPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemPassword(String value) {
        this.systemPassword = value;
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
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemory(Integer value) {
        this.memory = value;
    }

    /**
     * Gets the value of the systemLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemLogin() {
        return systemLogin;
    }

    /**
     * Sets the value of the systemLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemLogin(String value) {
        this.systemLogin = value;
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
     * Gets the value of the deploy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploy() {
        return deploy;
    }

    /**
     * Sets the value of the deploy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploy(String value) {
        this.deploy = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VmStatus }
     *     
     */
    public VmStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmStatus }
     *     
     */
    public void setStatus(VmStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the vncPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVncPort() {
        return vncPort;
    }

    /**
     * Sets the value of the vncPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVncPort(Integer value) {
        this.vncPort = value;
    }

    /**
     * Gets the value of the imgIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgIp() {
        return imgIp;
    }

    /**
     * Sets the value of the imgIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgIp(String value) {
        this.imgIp = value;
    }

    /**
     * Gets the value of the poweronTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoweronTime() {
        return poweronTime;
    }

    /**
     * Sets the value of the poweronTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoweronTime(Long value) {
        this.poweronTime = value;
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
     * Gets the value of the virtualMachineType property.
     * 
     * @return
     *     possible object is
     *     {@link VmType }
     *     
     */
    public VmType getVirtualMachineType() {
        return virtualMachineType;
    }

    /**
     * Sets the value of the virtualMachineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmType }
     *     
     */
    public void setVirtualMachineType(VmType value) {
        this.virtualMachineType = value;
    }

    /**
     * Gets the value of the keyboardLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardLayout() {
        return keyboardLayout;
    }

    /**
     * Sets the value of the keyboardLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardLayout(String value) {
        this.keyboardLayout = value;
    }

    /**
     * Gets the value of the pvdriver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPvdriver() {
        return pvdriver;
    }

    /**
     * Sets the value of the pvdriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPvdriver(Boolean value) {
        this.pvdriver = value;
    }

    /**
     * Gets the value of the cpuCap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpuCap() {
        return cpuCap;
    }

    /**
     * Sets the value of the cpuCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpuCap(Integer value) {
        this.cpuCap = value;
    }

    /**
     * Gets the value of the cpuPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpuPriority() {
        return cpuPriority;
    }

    /**
     * Sets the value of the cpuPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpuPriority(Integer value) {
        this.cpuPriority = value;
    }

}
