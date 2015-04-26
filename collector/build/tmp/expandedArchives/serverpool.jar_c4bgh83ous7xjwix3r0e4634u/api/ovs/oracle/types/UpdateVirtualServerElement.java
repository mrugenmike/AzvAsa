
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
 *         &lt;element name="serverConfig" type="{http://oracle.ovs.api/types/}VirtualServerConfig"/>
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
    "serverConfig"
})
@XmlRootElement(name = "updateVirtualServerElement")
public class UpdateVirtualServerElement {

    @XmlElement(required = true, nillable = true)
    protected VirtualServerConfig serverConfig;

    /**
     * Gets the value of the serverConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualServerConfig }
     *     
     */
    public VirtualServerConfig getServerConfig() {
        return serverConfig;
    }

    /**
     * Sets the value of the serverConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualServerConfig }
     *     
     */
    public void setServerConfig(VirtualServerConfig value) {
        this.serverConfig = value;
    }

}
