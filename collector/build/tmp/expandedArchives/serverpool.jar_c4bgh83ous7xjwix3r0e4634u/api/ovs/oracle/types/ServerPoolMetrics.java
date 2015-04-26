
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerPoolMetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerPoolMetrics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeDiskSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalNumOfCpus" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="allocatedVCpu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalNumOfChips" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalCPUSpeedMHZ" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serverPoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerPoolMetrics", propOrder = {
    "freeDiskSpace",
    "totalNumOfCpus",
    "freeMemory",
    "allocatedVCpu",
    "totalMemory",
    "totalNumOfChips",
    "totalCPUSpeedMHZ",
    "serverPoolName"
})
public class ServerPoolMetrics {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long freeDiskSpace;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalNumOfCpus;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long freeMemory;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long allocatedVCpu;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalMemory;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalNumOfChips;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalCPUSpeedMHZ;
    @XmlElement(required = true, nillable = true)
    protected String serverPoolName;

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
     * Gets the value of the totalNumOfCpus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumOfCpus() {
        return totalNumOfCpus;
    }

    /**
     * Sets the value of the totalNumOfCpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumOfCpus(Long value) {
        this.totalNumOfCpus = value;
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
     * Gets the value of the totalNumOfChips property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumOfChips() {
        return totalNumOfChips;
    }

    /**
     * Sets the value of the totalNumOfChips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumOfChips(Long value) {
        this.totalNumOfChips = value;
    }

    /**
     * Gets the value of the totalCPUSpeedMHZ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCPUSpeedMHZ() {
        return totalCPUSpeedMHZ;
    }

    /**
     * Sets the value of the totalCPUSpeedMHZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCPUSpeedMHZ(Long value) {
        this.totalCPUSpeedMHZ = value;
    }

    /**
     * Gets the value of the serverPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerPoolName() {
        return serverPoolName;
    }

    /**
     * Sets the value of the serverPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerPoolName(String value) {
        this.serverPoolName = value;
    }

}
