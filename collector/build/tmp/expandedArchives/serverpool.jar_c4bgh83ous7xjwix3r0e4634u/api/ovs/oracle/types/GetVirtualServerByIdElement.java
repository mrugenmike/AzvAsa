
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
 *         &lt;element name="vsID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "vsID"
})
@XmlRootElement(name = "getVirtualServerByIdElement")
public class GetVirtualServerByIdElement {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long vsID;

    /**
     * Gets the value of the vsID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVsID() {
        return vsID;
    }

    /**
     * Sets the value of the vsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVsID(Long value) {
        this.vsID = value;
    }

}
