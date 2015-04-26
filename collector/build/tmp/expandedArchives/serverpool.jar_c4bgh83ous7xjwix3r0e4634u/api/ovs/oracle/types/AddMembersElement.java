
package api.ovs.oracle.types;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="serverPool" type="{http://oracle.ovs.api/types/}ServerPool"/>
 *         &lt;element name="serverConfigs" type="{http://oracle.ovs.api/types/}VirtualServerConfig" maxOccurs="unbounded" minOccurs="0"/>
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
    "serverPool",
    "serverConfigs"
})
@XmlRootElement(name = "addMembersElement")
public class AddMembersElement {

    @XmlElement(required = true, nillable = true)
    protected ServerPool serverPool;
    @XmlElement(nillable = true)
    protected List<VirtualServerConfig> serverConfigs;

    /**
     * Gets the value of the serverPool property.
     * 
     * @return
     *     possible object is
     *     {@link ServerPool }
     *     
     */
    public ServerPool getServerPool() {
        return serverPool;
    }

    /**
     * Sets the value of the serverPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerPool }
     *     
     */
    public void setServerPool(ServerPool value) {
        this.serverPool = value;
    }

    /**
     * Gets the value of the serverConfigs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverConfigs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerConfigs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualServerConfig }
     * 
     * 
     */
    public List<VirtualServerConfig> getServerConfigs() {
        if (serverConfigs == null) {
            serverConfigs = new ArrayList<VirtualServerConfig>();
        }
        return this.serverConfigs;
    }

}
