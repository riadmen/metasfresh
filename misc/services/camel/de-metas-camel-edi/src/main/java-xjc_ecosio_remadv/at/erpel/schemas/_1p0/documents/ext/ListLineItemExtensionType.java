//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 10:38:39 AM CET 
//


package at.erpel.schemas._1p0.documents.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListLineItemExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListLineItemExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ListLineItemExtension"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}ErpelListLineItemExtension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListLineItemExtensionType", propOrder = {
    "listLineItemExtension",
    "erpelListLineItemExtension"
})
public class ListLineItemExtensionType {

    @XmlElement(name = "ListLineItemExtension", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
    protected at.erpel.schemas._1p0.documents.extensions.edifact.ListLineItemExtensionType listLineItemExtension;
    @XmlElement(name = "ErpelListLineItemExtension")
    protected CustomType erpelListLineItemExtension;

    /**
     * Gets the value of the listLineItemExtension property.
     * 
     * @return
     *     possible object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.ListLineItemExtensionType }
     *     
     */
    public at.erpel.schemas._1p0.documents.extensions.edifact.ListLineItemExtensionType getListLineItemExtension() {
        return listLineItemExtension;
    }

    /**
     * Sets the value of the listLineItemExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.ListLineItemExtensionType }
     *     
     */
    public void setListLineItemExtension(at.erpel.schemas._1p0.documents.extensions.edifact.ListLineItemExtensionType value) {
        this.listLineItemExtension = value;
    }

    /**
     * Gets the value of the erpelListLineItemExtension property.
     * 
     * @return
     *     possible object is
     *     {@link CustomType }
     *     
     */
    public CustomType getErpelListLineItemExtension() {
        return erpelListLineItemExtension;
    }

    /**
     * Sets the value of the erpelListLineItemExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomType }
     *     
     */
    public void setErpelListLineItemExtension(CustomType value) {
        this.erpelListLineItemExtension = value;
    }

}
