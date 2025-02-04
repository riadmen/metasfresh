//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 10:38:39 AM CET 
//


package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SLSRPTExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLSRPTExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReportingDate" minOccurs="0"/&gt;
 *           &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReportingPeriod" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PointOfSales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLSRPTExtensionType", propOrder = {
    "reportingDateOrReportingPeriodAndPointOfSales"
})
public class SLSRPTExtensionType {

    @XmlElementRefs({
        @XmlElementRef(name = "ReportingDate", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ReportingPeriod", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PointOfSales", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalesDate", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> reportingDateOrReportingPeriodAndPointOfSales;

    /**
     * Gets the value of the reportingDateOrReportingPeriodAndPointOfSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingDateOrReportingPeriodAndPointOfSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingDateOrReportingPeriodAndPointOfSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link PeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getReportingDateOrReportingPeriodAndPointOfSales() {
        if (reportingDateOrReportingPeriodAndPointOfSales == null) {
            reportingDateOrReportingPeriodAndPointOfSales = new ArrayList<JAXBElement<?>>();
        }
        return this.reportingDateOrReportingPeriodAndPointOfSales;
    }

}
