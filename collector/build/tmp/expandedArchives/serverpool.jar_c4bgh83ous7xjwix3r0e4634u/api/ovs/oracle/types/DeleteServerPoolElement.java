
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
 *         &lt;element name="serverPool" type="{http://oracle.ovs.api/types/}ServerPool"/>
 *         &lt;element name="isDelWorkingDir" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "serverPool",
    "isDelWorkingDir",
    "force",
    "warningMessageList"
})
@XmlRootElement(name = "deleteServerPoolElement")
public class DeleteServerPoolElement {

    @XmlElement(required = true, nillable = true)
    protected ServerPool serverPool;
    protected boolean isDelWorkingDir;
    protected boolean force;
    @XmlElement(required = true, nillable = true)
    protected List warningMessageList;

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
     * Gets the value of the isDelWorkingDir property.
     * 
     */
    public boolean isIsDelWorkingDir() {
        return isDelWorkingDir;
    }

    /**
     * Sets the value of the isDelWorkingDir property.
     * 
     */
    public void setIsDelWorkingDir(boolean value) {
        this.isDelWorkingDir = value;
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
