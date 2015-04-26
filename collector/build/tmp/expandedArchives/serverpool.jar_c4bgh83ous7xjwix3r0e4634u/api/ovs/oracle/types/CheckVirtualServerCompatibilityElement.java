
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
 *         &lt;element name="masterVS" type="{http://oracle.ovs.api/types/}MasterVirtualServer"/>
 *         &lt;element name="vs" type="{http://oracle.ovs.api/types/}VirtualServer"/>
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
    "masterVS",
    "vs"
})
@XmlRootElement(name = "checkVirtualServerCompatibilityElement")
public class CheckVirtualServerCompatibilityElement {

    @XmlElement(required = true, nillable = true)
    protected MasterVirtualServer masterVS;
    @XmlElement(required = true, nillable = true)
    protected VirtualServer vs;

    /**
     * Gets the value of the masterVS property.
     * 
     * @return
     *     possible object is
     *     {@link MasterVirtualServer }
     *     
     */
    public MasterVirtualServer getMasterVS() {
        return masterVS;
    }

    /**
     * Sets the value of the masterVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterVirtualServer }
     *     
     */
    public void setMasterVS(MasterVirtualServer value) {
        this.masterVS = value;
    }

    /**
     * Gets the value of the vs property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualServer }
     *     
     */
    public VirtualServer getVs() {
        return vs;
    }

    /**
     * Sets the value of the vs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualServer }
     *     
     */
    public void setVs(VirtualServer value) {
        this.vs = value;
    }

}
