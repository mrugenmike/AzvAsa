
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
 *         &lt;element name="serverPool" type="{http://oracle.ovs.api/types/}ServerPool"/>
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
    "serverPool",
    "loginUserId"
})
@XmlRootElement(name = "getServerPoolsElement")
public class GetServerPoolsElement {

    @XmlElement(required = true, nillable = true)
    protected ServerPool serverPool;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long loginUserId;

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
