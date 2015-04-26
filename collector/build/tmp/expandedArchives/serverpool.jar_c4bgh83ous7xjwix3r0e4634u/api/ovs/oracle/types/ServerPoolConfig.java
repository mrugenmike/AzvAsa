
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.webservices.internal.literal.List;


/**
 * <p>Java class for ServerPoolConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerPoolConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utilityServers" type="{http://www.oracle.com/webservices/internal/literal}list"/>
 *         &lt;element name="virtualServers" type="{http://www.oracle.com/webservices/internal/literal}list"/>
 *         &lt;element name="masterServer" type="{http://oracle.ovs.api/types/}MasterVirtualServer"/>
 *         &lt;element name="HA_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serverPoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverPoolVirtualIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerPoolConfig", propOrder = {
    "utilityServers",
    "virtualServers",
    "masterServer",
    "haEnabled",
    "serverPoolName",
    "serverPoolVirtualIP"
})
public class ServerPoolConfig {

    @XmlElement(required = true, nillable = true)
    protected List utilityServers;
    @XmlElement(required = true, nillable = true)
    protected List virtualServers;
    @XmlElement(required = true, nillable = true)
    protected MasterVirtualServer masterServer;
    @XmlElement(name = "HA_enabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean haEnabled;
    @XmlElement(required = true, nillable = true)
    protected String serverPoolName;
    protected String serverPoolVirtualIP;

    /**
     * Gets the value of the utilityServers property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getUtilityServers() {
        return utilityServers;
    }

    /**
     * Sets the value of the utilityServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setUtilityServers(List value) {
        this.utilityServers = value;
    }

    /**
     * Gets the value of the virtualServers property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getVirtualServers() {
        return virtualServers;
    }

    /**
     * Sets the value of the virtualServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setVirtualServers(List value) {
        this.virtualServers = value;
    }

    /**
     * Gets the value of the masterServer property.
     * 
     * @return
     *     possible object is
     *     {@link MasterVirtualServer }
     *     
     */
    public MasterVirtualServer getMasterServer() {
        return masterServer;
    }

    /**
     * Sets the value of the masterServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterVirtualServer }
     *     
     */
    public void setMasterServer(MasterVirtualServer value) {
        this.masterServer = value;
    }

    /**
     * Gets the value of the haEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHAEnabled() {
        return haEnabled;
    }

    /**
     * Sets the value of the haEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHAEnabled(Boolean value) {
        this.haEnabled = value;
    }

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
     * Gets the value of the serverPoolVirtualIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerPoolVirtualIP() {
        return serverPoolVirtualIP;
    }

    /**
     * Sets the value of the serverPoolVirtualIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerPoolVirtualIP(String value) {
        this.serverPoolVirtualIP = value;
    }

}
