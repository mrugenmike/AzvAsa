
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
 *         &lt;element name="virtualServer" type="{http://oracle.ovs.api/types/}VirtualServer"/>
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
    "virtualServer"
})
@XmlRootElement(name = "getNetworkBridgesByServerIPElement")
public class GetNetworkBridgesByServerIPElement {

    @XmlElement(required = true, nillable = true)
    protected VirtualServer virtualServer;

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

}
