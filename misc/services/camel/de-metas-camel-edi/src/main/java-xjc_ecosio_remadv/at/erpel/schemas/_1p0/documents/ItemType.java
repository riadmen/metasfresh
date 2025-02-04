//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 10:38:39 AM CET 
//


package at.erpel.schemas._1p0.documents;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}TaxedAmount"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}TaxRate"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}Amount"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}DomesticAmount" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "taxedAmount",
    "taxRate",
    "amount",
    "domesticAmount",
    "description"
})
public class ItemType {

    @XmlElement(name = "TaxedAmount", required = true)
    protected BigDecimal taxedAmount;
    @XmlElement(name = "TaxRate", required = true)
    protected TaxRateType taxRate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "DomesticAmount")
    protected DomesticAmountType domesticAmount;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * The base amount for the tax (= the amount the tax must be applied to).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxedAmount() {
        return taxedAmount;
    }

    /**
     * Sets the value of the taxedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxedAmount(BigDecimal value) {
        this.taxedAmount = value;
    }

    /**
     * The tax rate.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateType }
     *     
     */
    public TaxRateType getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateType }
     *     
     */
    public void setTaxRate(TaxRateType value) {
        this.taxRate = value;
    }

    /**
     * The tax amount. Calculated using: taxed amount x tax rate = tax amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * The tax amount in the domestic currency. The domestic currency != invoice currency.
     * 
     * @return
     *     possible object is
     *     {@link DomesticAmountType }
     *     
     */
    public DomesticAmountType getDomesticAmount() {
        return domesticAmount;
    }

    /**
     * Sets the value of the domesticAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticAmountType }
     *     
     */
    public void setDomesticAmount(DomesticAmountType value) {
        this.domesticAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
