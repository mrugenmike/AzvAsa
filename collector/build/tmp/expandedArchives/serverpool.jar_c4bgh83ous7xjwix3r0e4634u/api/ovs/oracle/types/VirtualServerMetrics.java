
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.webservices.internal.literal.Map;


/**
 * <p>Java class for VirtualServerMetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualServerMetrics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeDiskSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="virtualServerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cpuSpeedMHZ" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="allocatedVCpu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numOfPhysicalCPU" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="virtualServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuUtil" type="{http://www.oracle.com/webservices/internal/literal}map"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualServerMetrics", propOrder = {
    "freeDiskSpace",
    "virtualServerID",
    "cpuSpeedMHZ",
    "freeMemory",
    "allocatedVCpu",
    "totalMemory",
    "numOfPhysicalCPU",
    "virtualServerName",
    "cpuUtil"
})
public class VirtualServerMetrics {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long freeDiskSpace;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long virtualServerID;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cpuSpeedMHZ;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long freeMemory;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long allocatedVCpu;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalMemory;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long numOfPhysicalCPU;
    @XmlElement(required = true, nillable = true)
    protected String virtualServerName;
    @XmlElement(required = true, nillable = true)
    protected Map cpuUtil;

    /**
     * Gets the value of the freeDiskSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeDiskSpace() {
        return freeDiskSpace;
    }

    /**
     * Sets the value of the freeDiskSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeDiskSpace(Long value) {
        this.freeDiskSpace = value;
    }

    /**
     * Gets the value of the virtualServerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVirtualServerID() {
        return virtualServerID;
    }

    /**
     * Sets the value of the virtualServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVirtualServerID(Long value) {
        this.virtualServerID = value;
    }

    /**
     * Gets the value of the cpuSpeedMHZ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpuSpeedMHZ() {
        return cpuSpeedMHZ;
    }

    /**
     * Sets the value of the cpuSpeedMHZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpuSpeedMHZ(Long value) {
        this.cpuSpeedMHZ = value;
    }

    /**
     * Gets the value of the freeMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeMemory() {
        return freeMemory;
    }

    /**
     * Sets the value of the freeMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeMemory(Long value) {
        this.freeMemory = value;
    }

    /**
     * Gets the value of the allocatedVCpu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllocatedVCpu() {
        return allocatedVCpu;
    }

    /**
     * Sets the value of the allocatedVCpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllocatedVCpu(Long value) {
        this.allocatedVCpu = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMemory(Long value) {
        this.totalMemory = value;
    }

    /**
     * Gets the value of the numOfPhysicalCPU property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOfPhysicalCPU() {
        return numOfPhysicalCPU;
    }

    /**
     * Sets the value of the numOfPhysicalCPU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOfPhysicalCPU(Long value) {
        this.numOfPhysicalCPU = value;
    }

    /**
     * Gets the value of the virtualServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualServerName() {
        return virtualServerName;
    }

    /**
     * Sets the value of the virtualServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualServerName(String value) {
        this.virtualServerName = value;
    }

    /**
     * Gets the value of the cpuUtil property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getCpuUtil() {
        return cpuUtil;
    }

    /**
     * Sets the value of the cpuUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setCpuUtil(Map value) {
        this.cpuUtil = value;
    }

}
