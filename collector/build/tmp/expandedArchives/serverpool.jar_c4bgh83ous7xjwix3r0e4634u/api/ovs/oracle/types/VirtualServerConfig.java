
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualServerConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualServerConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtualServer" type="{http://oracle.ovs.api/types/}VirtualServer"/>
 *         &lt;element name="utilityVirtualServer" type="{http://oracle.ovs.api/types/}UtilityVirtualServer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualServerConfig", propOrder = {
    "virtualServer",
    "utilityVirtualServer"
})
@XmlSeeAlso({
    UtilitVirtualServerConfig.class,
    MasterVirtualServerConfig.class
})
public class VirtualServerConfig {

    @XmlElement(required = true, nillable = true)
    protected VirtualServer virtualServer;
    @XmlElement(required = true, nillable = true)
    protected UtilityVirtualServer utilityVirtualServer;

    /**
     * Gets the value of the virtualServer property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualServer }
     *     
     */
    public VirtualServer getVirtualServer() {
        return virtualServer;
    }

    /**
     * Sets the value of the virtualServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualServer }
     *     
     */
    public void setVirtualServer(VirtualServer value) {
        this.virtualServer = value;
    }

    /**
     * Gets the value of the utilityVirtualServer property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityVirtualServer }
     *     
     */
    public UtilityVirtualServer getUtilityVirtualServer() {
        return utilityVirtualServer;
    }

    /**
     * Sets the value of the utilityVirtualServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityVirtualServer }
     *     
     */
    public void setUtilityVirtualServer(UtilityVirtualServer value) {
        this.utilityVirtualServer = value;
    }

}
