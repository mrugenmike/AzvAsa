
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerPool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerPool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="haEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverPoolId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serverPoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverPoolVirtualIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerPool", propOrder = {
    "haEnable",
    "description",
    "status",
    "serverPoolId",
    "serverPoolName",
    "serverPoolVirtualIP"
})
public class ServerPool {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean haEnable;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long serverPoolId;
    @XmlElement(required = true, nillable = true)
    protected String serverPoolName;
    protected String serverPoolVirtualIP;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the serverPoolId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServerPoolId() {
        return serverPoolId;
    }

    /**
     * Sets the value of the serverPoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServerPoolId(Long value) {
        this.serverPoolId = value;
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

    /**
     * Gets the value of the serverPoolVirtualIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerPoolVirtualIP() {
        return serverPoolVirtualIP;
    }

    /**
     * Sets the value of the serverPoolVirtualIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerPoolVirtualIP(String value) {
        this.serverPoolVirtualIP = value;
    }

}
