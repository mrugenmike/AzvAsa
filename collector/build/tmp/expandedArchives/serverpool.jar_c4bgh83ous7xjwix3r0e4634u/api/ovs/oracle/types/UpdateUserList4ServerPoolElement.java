
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
 *         &lt;element name="serverPoolId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userIDList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
    "serverPoolId",
    "userIDList"
})
@XmlRootElement(name = "updateUserList4ServerPoolElement")
public class UpdateUserList4ServerPoolElement {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long serverPoolId;
    @XmlElement(nillable = true)
    protected List<Long> userIDList;

    /**
     * Gets the value of the serverPoolId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServerPoolId() {
        return serverPoolId;
    }

    /**
     * Sets the value of the serverPoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServerPoolId(Long value) {
        this.serverPoolId = value;
    }

    /**
     * Gets the value of the userIDList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userIDList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIDList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUserIDList() {
        if (userIDList == null) {
            userIDList = new ArrayList<Long>();
        }
        return this.userIDList;
    }

}
