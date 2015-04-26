
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
 *         &lt;element name="poolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "poolName"
})
@XmlRootElement(name = "getServerPoolByNameElement")
public class GetServerPoolByNameElement {

    @XmlElement(required = true, nillable = true)
    protected String poolName;

    /**
     * Gets the value of the poolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Sets the value of the poolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolName(String value) {
        this.poolName = value;
    }

}
