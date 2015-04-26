
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmType", propOrder = {
    "vmType"
})
public class VmType {

    @XmlElement(required = true, nillable = true)
    protected String vmType;

    /**
     * Gets the value of the vmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmType() {
        return vmType;
    }

    /**
     * Sets the value of the vmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmType(String value) {
        this.vmType = value;
    }

}
