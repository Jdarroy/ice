//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.22 at 11:59:10 AM EDT 
//


package oasis.names.tc.unitsml.schema.xsd.unitsmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ComplexType for the root element of an UnitsML document.
 * 
 * <p>Java class for UnitsMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitsMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}CountedItemSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantitySet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}DimensionSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}PrefixSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitsMLType", propOrder = {
    "unitSet",
    "countedItemSet",
    "quantitySet",
    "dimensionSet",
    "prefixSet"
})
public class UnitsMLType {

    @XmlElement(name = "UnitSet")
    protected UnitSetType unitSet;
    @XmlElement(name = "CountedItemSet")
    protected CountedItemSetType countedItemSet;
    @XmlElement(name = "QuantitySet")
    protected QuantitySetType quantitySet;
    @XmlElement(name = "DimensionSet")
    protected DimensionSetType dimensionSet;
    @XmlElement(name = "PrefixSet")
    protected PrefixSetType prefixSet;

    /**
     * Gets the value of the unitSet property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSetType }
     *     
     */
    public UnitSetType getUnitSet() {
        return unitSet;
    }

    /**
     * Sets the value of the unitSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSetType }
     *     
     */
    public void setUnitSet(UnitSetType value) {
        this.unitSet = value;
    }

    /**
     * Gets the value of the countedItemSet property.
     * 
     * @return
     *     possible object is
     *     {@link CountedItemSetType }
     *     
     */
    public CountedItemSetType getCountedItemSet() {
        return countedItemSet;
    }

    /**
     * Sets the value of the countedItemSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountedItemSetType }
     *     
     */
    public void setCountedItemSet(CountedItemSetType value) {
        this.countedItemSet = value;
    }

    /**
     * Gets the value of the quantitySet property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySetType }
     *     
     */
    public QuantitySetType getQuantitySet() {
        return quantitySet;
    }

    /**
     * Sets the value of the quantitySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySetType }
     *     
     */
    public void setQuantitySet(QuantitySetType value) {
        this.quantitySet = value;
    }

    /**
     * Gets the value of the dimensionSet property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionSetType }
     *     
     */
    public DimensionSetType getDimensionSet() {
        return dimensionSet;
    }

    /**
     * Sets the value of the dimensionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionSetType }
     *     
     */
    public void setDimensionSet(DimensionSetType value) {
        this.dimensionSet = value;
    }

    /**
     * Gets the value of the prefixSet property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixSetType }
     *     
     */
    public PrefixSetType getPrefixSet() {
        return prefixSet;
    }

    /**
     * Sets the value of the prefixSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixSetType }
     *     
     */
    public void setPrefixSet(PrefixSetType value) {
        this.prefixSet = value;
    }

}