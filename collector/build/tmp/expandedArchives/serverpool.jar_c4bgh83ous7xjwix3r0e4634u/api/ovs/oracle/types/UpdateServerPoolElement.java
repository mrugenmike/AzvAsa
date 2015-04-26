
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poolId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HAStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newPoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "poolId",
    "haStatus",
    "newPoolName"
})
@XmlRootElement(name = "updateServerPoolElement")
public class UpdateServerPoolElement {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long poolId;
    @XmlElement(name = "HAStatus")
    protected boolean haStatus;
    @XmlElement(required = true, nillable = true)
    protected String newPoolName;

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoolId(Long value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the haStatus property.
     * 
     */
    public boolean isHAStatus() {
        return haStatus;
    }

    /**
     * Sets the value of the haStatus property.
     * 
     */
    public void setHAStatus(boolean value) {
        this.haStatus = value;
    }

    /**
     * Gets the value of the newPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPoolName() {
        return newPoolName;
    }

    /**
     * Sets the value of the newPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPoolName(String value) {
        this.newPoolName = value;
    }

}
