//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.22 at 11:59:10 AM EDT 
//


package oasis.names.tc.unitsml.schema.xsd.unitsmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for the element for providing factors for a conversion equation from another unit; y = d + ((b / c) (x + a))
 * 
 * <p>Java class for Float64ConversionFromType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Float64ConversionFromType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}ConversionNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}initialUnit"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id use="required""/>
 *       &lt;attribute name="initialAddend" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="initialAddendDecimalPlace" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="multiplicand" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       &lt;attribute name="multiplicandDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="divisor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       &lt;attribute name="divisorDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="finalAddend" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="finalAddendDecimalPlace" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="exact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Float64ConversionFromType", propOrder = {
    "conversionNote"
})
public class Float64ConversionFromType {

    @XmlElement(name = "ConversionNote")
    protected List<NoteType> conversionNote;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    protected Double initialAddend;
    @XmlAttribute
    protected Byte initialAddendDecimalPlace;
    @XmlAttribute
    protected Double multiplicand;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedByte")
    protected Short multiplicandDigits;
    @XmlAttribute
    protected Double divisor;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedByte")
    protected Short divisorDigits;
    @XmlAttribute
    protected Double finalAddend;
    @XmlAttribute
    protected Byte finalAddendDecimalPlace;
    @XmlAttribute
    protected Boolean exact;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String initialUnit;

    /**
     * Gets the value of the conversionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getConversionNote() {
        if (conversionNote == null) {
            conversionNote = new ArrayList<NoteType>();
        }
        return this.conversionNote;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the initialAddend property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getInitialAddend() {
        if (initialAddend == null) {
            return  0.0D;
        } else {
            return initialAddend;
        }
    }

    /**
     * Sets the value of the initialAddend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialAddend(Double value) {
        this.initialAddend = value;
    }

    /**
     * Gets the value of the initialAddendDecimalPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getInitialAddendDecimalPlace() {
        return initialAddendDecimalPlace;
    }

    /**
     * Sets the value of the initialAddendDecimalPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setInitialAddendDecimalPlace(Byte value) {
        this.initialAddendDecimalPlace = value;
    }

    /**
     * Gets the value of the multiplicand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMultiplicand() {
        if (multiplicand == null) {
            return  1.0D;
        } else {
            return multiplicand;
        }
    }

    /**
     * Sets the value of the multiplicand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicand(Double value) {
        this.multiplicand = value;
    }

    /**
     * Gets the value of the multiplicandDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMultiplicandDigits() {
        return multiplicandDigits;
    }

    /**
     * Sets the value of the multiplicandDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMultiplicandDigits(Short value) {
        this.multiplicandDigits = value;
    }

    /**
     * Gets the value of the divisor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDivisor() {
        if (divisor == null) {
            return  1.0D;
        } else {
            return divisor;
        }
    }

    /**
     * Sets the value of the divisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDivisor(Double value) {
        this.divisor = value;
    }

    /**
     * Gets the value of the divisorDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDivisorDigits() {
        return divisorDigits;
    }

    /**
     * Sets the value of the divisorDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDivisorDigits(Short value) {
        this.divisorDigits = value;
    }

    /**
     * Gets the value of the finalAddend property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getFinalAddend() {
        if (finalAddend == null) {
            return  0.0D;
        } else {
            return finalAddend;
        }
    }

    /**
     * Sets the value of the finalAddend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinalAddend(Double value) {
        this.finalAddend = value;
    }

    /**
     * Gets the value of the finalAddendDecimalPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFinalAddendDecimalPlace() {
        return finalAddendDecimalPlace;
    }

    /**
     * Sets the value of the finalAddendDecimalPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFinalAddendDecimalPlace(Byte value) {
        this.finalAddendDecimalPlace = value;
    }

    /**
     * Gets the value of the exact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExact() {
        if (exact == null) {
            return false;
        } else {
            return exact;
        }
    }

    /**
     * Sets the value of the exact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExact(Boolean value) {
        this.exact = value;
    }

    /**
     * Gets the value of the initialUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialUnit() {
        return initialUnit;
    }

    /**
     * Sets the value of the initialUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialUnit(String value) {
        this.initialUnit = value;
    }

}