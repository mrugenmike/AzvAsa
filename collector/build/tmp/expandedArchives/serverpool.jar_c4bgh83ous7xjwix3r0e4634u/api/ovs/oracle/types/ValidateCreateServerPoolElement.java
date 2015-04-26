
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
 *         &lt;element name="poolConfig" type="{http://oracle.ovs.api/types/}ServerPoolConfig"/>
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
    "poolConfig"
})
@XmlRootElement(name = "validateCreateServerPoolElement")
public class ValidateCreateServerPoolElement {

    @XmlElement(required = true, nillable = true)
    protected ServerPoolConfig poolConfig;

    /**
     * Gets the value of the poolConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ServerPoolConfig }
     *     
     */
    public ServerPoolConfig getPoolConfig() {
        return poolConfig;
    }

    /**
     * Sets the value of the poolConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerPoolConfig }
     *     
     */
    public void setPoolConfig(ServerPoolConfig value) {
        this.poolConfig = value;
    }

}
