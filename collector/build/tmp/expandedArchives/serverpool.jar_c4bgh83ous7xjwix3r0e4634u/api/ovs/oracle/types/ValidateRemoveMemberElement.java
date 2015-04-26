
package api.ovs.oracle.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.webservices.internal.literal.List;


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
 *         &lt;element name="vs" type="{http://oracle.ovs.api/types/}VirtualServer"/>
 *         &lt;element name="force" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="warningMessageList" type="{http://www.oracle.com/webservices/internal/literal}list"/>
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
    "vs",
    "force",
    "warningMessageList"
})
@XmlRootElement(name = "validateRemoveMemberElement")
public class ValidateRemoveMemberElement {

    @XmlElement(required = true, nillable = true)
    protected VirtualServer vs;
    protected boolean force;
    @XmlElement(required = true, nillable = true)
    protected List warningMessageList;

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
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

    /**
     * Gets the value of the warningMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getWarningMessageList() {
        return warningMessageList;
    }

    /**
     * Sets the value of the warningMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setWarningMessageList(List value) {
        this.warningMessageList = value;
    }

}
