
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
 *         &lt;element name="serverPoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="virtualServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "serverPoolName",
    "virtualServerName"
})
@XmlRootElement(name = "getVirtualServerByNameElement")
public class GetVirtualServerByNameElement {

    @XmlElement(required = true, nillable = true)
    protected String serverPoolName;
    @XmlElement(required = true, nillable = true)
    protected String virtualServerName;

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

}
