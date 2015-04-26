
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="virtualServerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "virtualServerID"
})
@XmlRootElement(name = "validateBlackoutServerElement")
public class ValidateBlackoutServerElement {

    protected long virtualServerID;

    /**
     * Gets the value of the virtualServerID property.
     * 
     */
    public long getVirtualServerID() {
        return virtualServerID;
    }

    /**
     * Sets the value of the virtualServerID property.
     * 
     */
    public void setVirtualServerID(long value) {
        this.virtualServerID = value;
    }

}
