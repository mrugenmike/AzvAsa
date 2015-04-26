
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
 *         &lt;element name="pool" type="{http://oracle.ovs.api/types/}ServerPool"/>
 *         &lt;element name="vs" type="{http://oracle.ovs.api/types/}VirtualServer"/>
 *         &lt;element name="loginUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "pool",
    "vs",
    "loginUserId"
})
@XmlRootElement(name = "getVirtualServersElement")
public class GetVirtualServersElement {

    @XmlElement(required = true, nillable = true)
    protected ServerPool pool;
    @XmlElement(required = true, nillable = true)
    protected VirtualServer vs;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long loginUserId;

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link ServerPool }
     *     
     */
    public ServerPool getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerPool }
     *     
     */
    public void setPool(ServerPool value) {
        this.pool = value;
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

    /**
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoginUserId(Long value) {
        this.loginUserId = value;
    }

}
