//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.22 at 11:59:10 AM EDT 
//


package org.eclipse.ice.datastructures.batteryml;

import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the batteryml._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Pack_QNAME = new QName("BatteryML:2.0", "Pack");
    private static final QName _Int64_QNAME = new QName("BatteryML:2.0", "Int64");
    private static final QName _Float64_QNAME = new QName("BatteryML:2.0", "Float64");
    private static final QName _Int64List_QNAME = new QName("BatteryML:2.0", "Int64List");
    private static final QName _Encoded64_QNAME = new QName("BatteryML:2.0", "Encoded64");
    private static final QName _Float32List_QNAME = new QName("BatteryML:2.0", "Float32List");
    private static final QName _ShortToken_QNAME = new QName("BatteryML:2.0", "ShortToken");
    private static final QName _Vector_QNAME = new QName("BatteryML:2.0", "Vector");
    private static final QName _PositiveIntList_QNAME = new QName("BatteryML:2.0", "PositiveIntList");
    private static final QName _String_QNAME = new QName("BatteryML:2.0", "String");
    private static final QName _CategorySet_QNAME = new QName("BatteryML:2.0", "CategorySet");
    private static final QName _Device_QNAME = new QName("BatteryML:2.0", "Device");
    private static final QName _Parameter_QNAME = new QName("BatteryML:2.0", "Parameter");
    private static final QName _NonNegativeInt32List_QNAME = new QName("BatteryML:2.0", "NonNegativeInt32List");
    private static final QName _ChemicalElementSymbol_QNAME = new QName("BatteryML:2.0", "ChemicalElementSymbol");
    private static final QName _Boolean_QNAME = new QName("BatteryML:2.0", "Boolean");
    private static final QName _NonNegativeInt64_QNAME = new QName("BatteryML:2.0", "NonNegativeInt64");
    private static final QName _NonNegativeInt_QNAME = new QName("BatteryML:2.0", "NonNegativeInt");
    private static final QName _Float32_QNAME = new QName("BatteryML:2.0", "Float32");
    private static final QName _ShortNameList_QNAME = new QName("BatteryML:2.0", "ShortNameList");
    private static final QName _PositiveInt_QNAME = new QName("BatteryML:2.0", "PositiveInt");
    private static final QName _Category_QNAME = new QName("BatteryML:2.0", "Category");
    private static final QName _DateTimeList_QNAME = new QName("BatteryML:2.0", "DateTimeList");
    private static final QName _Module_QNAME = new QName("BatteryML:2.0", "Module");
    private static final QName _Model_QNAME = new QName("BatteryML:2.0", "Model");
    private static final QName _CellSandwich_QNAME = new QName("BatteryML:2.0", "CellSandwich");
    private static final QName _PropertyType_QNAME = new QName("BatteryML:2.0", "PropertyType");
    private static final QName _ParameterSet_QNAME = new QName("BatteryML:2.0", "ParameterSet");
    private static final QName _DateTime_QNAME = new QName("BatteryML:2.0", "DateTime");
    private static final QName _Int32_QNAME = new QName("BatteryML:2.0", "Int32");
    private static final QName _EmbeddedXML_QNAME = new QName("BatteryML:2.0", "EmbeddedXML");
    private static final QName _BuildingBlock_QNAME = new QName("BatteryML:2.0", "BuildingBlock");
    private static final QName _NonNegativeIntList_QNAME = new QName("BatteryML:2.0", "NonNegativeIntList");
    private static final QName _ShortName_QNAME = new QName("BatteryML:2.0", "ShortName");
    private static final QName _Cell_QNAME = new QName("BatteryML:2.0", "Cell");
    private static final QName _Part_QNAME = new QName("BatteryML:2.0", "Part");
    private static final QName _Float64List_QNAME = new QName("BatteryML:2.0", "Float64List");
    private static final QName _NonNegativeInt64List_QNAME = new QName("BatteryML:2.0", "NonNegativeInt64List");
    private static final QName _Simulation_QNAME = new QName("BatteryML:2.0", "Simulation");
    private static final QName _Int32List_QNAME = new QName("BatteryML:2.0", "Int32List");
    private static final QName _ShortString_QNAME = new QName("BatteryML:2.0", "ShortString");
    private static final QName _BooleanList_QNAME = new QName("BatteryML:2.0", "BooleanList");
    private static final QName _Definition_QNAME = new QName("BatteryML:2.0", "Definition");
    private static final QName _NonNegativeInt32_QNAME = new QName("BatteryML:2.0", "NonNegativeInt32");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: batteryml._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildingBlockRefType }
     * 
     */
    public BuildingBlockRefType createBuildingBlockRefType() {
        return new BuildingBlockRefType();
    }

    /**
     * Create an instance of {@link VectorType }
     * 
     */
    public VectorType createVectorType() {
        return new VectorType();
    }

    /**
     * Create an instance of {@link AnyValueType }
     * 
     */
    public AnyValueType createAnyValueType() {
        return new AnyValueType();
    }

    /**
     * Create an instance of {@link AnyListNumericValueType }
     * 
     */
    public AnyListNumericValueType createAnyListNumericValueType() {
        return new AnyListNumericValueType();
    }

    /**
     * Create an instance of {@link ModuleRefType }
     * 
     */
    public ModuleRefType createModuleRefType() {
        return new ModuleRefType();
    }

    /**
     * Create an instance of {@link PackRefType }
     * 
     */
    public PackRefType createPackRefType() {
        return new PackRefType();
    }

    /**
     * Create an instance of {@link SimulationDBType }
     * 
     */
    public SimulationDBType createSimulationDBType() {
        return new SimulationDBType();
    }

    /**
     * Create an instance of {@link DeviceDBTestDoc }
     * 
     */
    public DeviceDBTestDoc createDeviceDBTestDoc() {
        return new DeviceDBTestDoc();
    }

    /**
     * Create an instance of {@link CellSet }
     * 
     */
    public CellSet createCellSet() {
        return new CellSet();
    }

    /**
     * Create an instance of {@link BuildingBlockDBTestDoc }
     * 
     */
    public BuildingBlockDBTestDoc createBuildingBlockDBTestDoc() {
        return new BuildingBlockDBTestDoc();
    }

    /**
     * Create an instance of {@link UnitsDBTestDoc }
     * 
     */
    public UnitsDBTestDoc createUnitsDBTestDoc() {
        return new UnitsDBTestDoc();
    }

    /**
     * Create an instance of {@link AnySingleListNumericValueType }
     * 
     */
    public AnySingleListNumericValueType createAnySingleListNumericValueType() {
        return new AnySingleListNumericValueType();
    }

    /**
     * Create an instance of {@link CategorySetType }
     * 
     */
    public CategorySetType createCategorySetType() {
        return new CategorySetType();
    }

    /**
     * Create an instance of {@link AnySingleNumericValueType }
     * 
     */
    public AnySingleNumericValueType createAnySingleNumericValueType() {
        return new AnySingleNumericValueType();
    }

    /**
     * Create an instance of {@link MapItemType }
     * 
     */
    public MapItemType createMapItemType() {
        return new MapItemType();
    }

    /**
     * Create an instance of {@link SimulationDBTestDoc }
     * 
     */
    public SimulationDBTestDoc createSimulationDBTestDoc() {
        return new SimulationDBTestDoc();
    }

    /**
     * Create an instance of {@link PackDB }
     * 
     */
    public PackDB createPackDB() {
        return new PackDB();
    }

    /**
     * Create an instance of {@link PartDBEntryType }
     * 
     */
    public PartDBEntryType createPartDBEntryType() {
        return new PartDBEntryType();
    }

    /**
     * Create an instance of {@link BuildingBlockDB }
     * 
     */
    public BuildingBlockDB createBuildingBlockDB() {
        return new BuildingBlockDB();
    }

    /**
     * Create an instance of {@link MapType }
     * 
     */
    public MapType createMapType() {
        return new MapType();
    }

    /**
     * Create an instance of {@link ModelDB }
     * 
     */
    public ModelDB createModelDB() {
        return new ModelDB();
    }

    /**
     * Create an instance of {@link ModuleSet }
     * 
     */
    public ModuleSet createModuleSet() {
        return new ModuleSet();
    }

    /**
     * Create an instance of {@link BatteryMLDoc }
     * 
     */
    public BatteryMLDoc createBatteryMLDoc() {
        return new BatteryMLDoc();
    }

    /**
     * Create an instance of {@link BuildingBlockDBEntryType }
     * 
     */
    public BuildingBlockDBEntryType createBuildingBlockDBEntryType() {
        return new BuildingBlockDBEntryType();
    }

    /**
     * Create an instance of {@link SimulationDB }
     * 
     */
    public SimulationDB createSimulationDB() {
        return new SimulationDB();
    }

    /**
     * Create an instance of {@link BasicDataTypesMLDoc }
     * 
     */
    public BasicDataTypesMLDoc createBasicDataTypesMLDoc() {
        return new BasicDataTypesMLDoc();
    }

    /**
     * Create an instance of {@link PartRefType }
     * 
     */
    public PartRefType createPartRefType() {
        return new PartRefType();
    }

    /**
     * Create an instance of {@link CategoryNoIdType }
     * 
     */
    public CategoryNoIdType createCategoryNoIdType() {
        return new CategoryNoIdType();
    }

    /**
     * Create an instance of {@link DeviceDBEntryType }
     * 
     */
    public DeviceDBEntryType createDeviceDBEntryType() {
        return new DeviceDBEntryType();
    }

    /**
     * Create an instance of {@link AnySingleListCounterValueType }
     * 
     */
    public AnySingleListCounterValueType createAnySingleListCounterValueType() {
        return new AnySingleListCounterValueType();
    }

    /**
     * Create an instance of {@link DeviceRefType }
     * 
     */
    public DeviceRefType createDeviceRefType() {
        return new DeviceRefType();
    }

    /**
     * Create an instance of {@link CellRefType }
     * 
     */
    public CellRefType createCellRefType() {
        return new CellRefType();
    }

    /**
     * Create an instance of {@link AnyCounterValueType }
     * 
     */
    public AnyCounterValueType createAnyCounterValueType() {
        return new AnyCounterValueType();
    }

    /**
     * Create an instance of {@link UnitsDB }
     * 
     */
    public UnitsDB createUnitsDB() {
        return new UnitsDB();
    }

    /**
     * Create an instance of {@link BuildingBlockSet }
     * 
     */
    public BuildingBlockSet createBuildingBlockSet() {
        return new BuildingBlockSet();
    }

    /**
     * Create an instance of {@link CellSandwichSet }
     * 
     */
    public CellSandwichSet createCellSandwichSet() {
        return new CellSandwichSet();
    }

    /**
     * Create an instance of {@link PackSet }
     * 
     */
    public PackSet createPackSet() {
        return new PackSet();
    }

    /**
     * Create an instance of {@link AnyListValueType }
     * 
     */
    public AnyListValueType createAnyListValueType() {
        return new AnyListValueType();
    }

    /**
     * Create an instance of {@link CellDBEntryType }
     * 
     */
    public CellDBEntryType createCellDBEntryType() {
        return new CellDBEntryType();
    }

    /**
     * Create an instance of {@link AnySingleListValueType }
     * 
     */
    public AnySingleListValueType createAnySingleListValueType() {
        return new AnySingleListValueType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link AnySingleValueType }
     * 
     */
    public AnySingleValueType createAnySingleValueType() {
        return new AnySingleValueType();
    }

    /**
     * Create an instance of {@link DefinitionType }
     * 
     */
    public DefinitionType createDefinitionType() {
        return new DefinitionType();
    }

    /**
     * Create an instance of {@link ModuleDBTestDoc }
     * 
     */
    public ModuleDBTestDoc createModuleDBTestDoc() {
        return new ModuleDBTestDoc();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link PackDBEntryType }
     * 
     */
    public PackDBEntryType createPackDBEntryType() {
        return new PackDBEntryType();
    }

    /**
     * Create an instance of {@link CellSandwichRefType }
     * 
     */
    public CellSandwichRefType createCellSandwichRefType() {
        return new CellSandwichRefType();
    }

    /**
     * Create an instance of {@link UnitsType }
     * 
     */
    public UnitsType createUnitsType() {
        return new UnitsType();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link AnyNumericValueType }
     * 
     */
    public AnyNumericValueType createAnyNumericValueType() {
        return new AnyNumericValueType();
    }

    /**
     * Create an instance of {@link ModuleDBEntryType }
     * 
     */
    public ModuleDBEntryType createModuleDBEntryType() {
        return new ModuleDBEntryType();
    }

    /**
     * Create an instance of {@link PartDBTestDoc }
     * 
     */
    public PartDBTestDoc createPartDBTestDoc() {
        return new PartDBTestDoc();
    }

    /**
     * Create an instance of {@link ModelDBTestDoc }
     * 
     */
    public ModelDBTestDoc createModelDBTestDoc() {
        return new ModelDBTestDoc();
    }

    /**
     * Create an instance of {@link AnyListCounterValueType }
     * 
     */
    public AnyListCounterValueType createAnyListCounterValueType() {
        return new AnyListCounterValueType();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link ModelDBType }
     * 
     */
    public ModelDBType createModelDBType() {
        return new ModelDBType();
    }

    /**
     * Create an instance of {@link CellSandwichDBTestDoc }
     * 
     */
    public CellSandwichDBTestDoc createCellSandwichDBTestDoc() {
        return new CellSandwichDBTestDoc();
    }

    /**
     * Create an instance of {@link CellSandwichDBEntryType }
     * 
     */
    public CellSandwichDBEntryType createCellSandwichDBEntryType() {
        return new CellSandwichDBEntryType();
    }

    /**
     * Create an instance of {@link DeviceDB }
     * 
     */
    public DeviceDB createDeviceDB() {
        return new DeviceDB();
    }

    /**
     * Create an instance of {@link BuildingBlockModelType }
     * 
     */
    public BuildingBlockModelType createBuildingBlockModelType() {
        return new BuildingBlockModelType();
    }

    /**
     * Create an instance of {@link ModuleDB }
     * 
     */
    public ModuleDB createModuleDB() {
        return new ModuleDB();
    }

    /**
     * Create an instance of {@link NamedParametersMLDoc }
     * 
     */
    public NamedParametersMLDoc createNamedParametersMLDoc() {
        return new NamedParametersMLDoc();
    }

    /**
     * Create an instance of {@link ParameterSetType }
     * 
     */
    public ParameterSetType createParameterSetType() {
        return new ParameterSetType();
    }

    /**
     * Create an instance of {@link AnySingleCounterValueType }
     * 
     */
    public AnySingleCounterValueType createAnySingleCounterValueType() {
        return new AnySingleCounterValueType();
    }

    /**
     * Create an instance of {@link SimulationType }
     * 
     */
    public SimulationType createSimulationType() {
        return new SimulationType();
    }

    /**
     * Create an instance of {@link PartDB }
     * 
     */
    public PartDB createPartDB() {
        return new PartDB();
    }

    /**
     * Create an instance of {@link AnyCategoryType }
     * 
     */
    public AnyCategoryType createAnyCategoryType() {
        return new AnyCategoryType();
    }

    /**
     * Create an instance of {@link PackDBTestDoc }
     * 
     */
    public PackDBTestDoc createPackDBTestDoc() {
        return new PackDBTestDoc();
    }

    /**
     * Create an instance of {@link BatteryMLTestDoc }
     * 
     */
    public BatteryMLTestDoc createBatteryMLTestDoc() {
        return new BatteryMLTestDoc();
    }

    /**
     * Create an instance of {@link CellDBTestDoc }
     * 
     */
    public CellDBTestDoc createCellDBTestDoc() {
        return new CellDBTestDoc();
    }

    /**
     * Create an instance of {@link CellSandwichDB }
     * 
     */
    public CellSandwichDB createCellSandwichDB() {
        return new CellSandwichDB();
    }

    /**
     * Create an instance of {@link UnitsDBType }
     * 
     */
    public UnitsDBType createUnitsDBType() {
        return new UnitsDBType();
    }

    /**
     * Create an instance of {@link ModelType }
     * 
     */
    public ModelType createModelType() {
        return new ModelType();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link CellDB }
     * 
     */
    public CellDB createCellDB() {
        return new CellDB();
    }

    /**
     * Create an instance of {@link DeviceSet }
     * 
     */
    public DeviceSet createDeviceSet() {
        return new DeviceSet();
    }

    /**
     * Create an instance of {@link PartSet }
     * 
     */
    public PartSet createPartSet() {
        return new PartSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Pack")
    public JAXBElement<PackDBEntryType> createPack(PackDBEntryType value) {
        return new JAXBElement<PackDBEntryType>(_Pack_QNAME, PackDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Int64")
    public JAXBElement<Long> createInt64(Long value) {
        return new JAXBElement<Long>(_Int64_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Float64")
    public JAXBElement<Double> createFloat64(Double value) {
        return new JAXBElement<Double>(_Float64_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Int64List")
    public JAXBElement<List<Long>> createInt64List(List<Long> value) {
        return new JAXBElement<List<Long>>(_Int64List_QNAME, ((Class) List.class), null, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Encoded64")
    public JAXBElement<byte[]> createEncoded64(byte[] value) {
        return new JAXBElement<byte[]>(_Encoded64_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Float32List")
    public JAXBElement<List<Float>> createFloat32List(List<Float> value) {
        return new JAXBElement<List<Float>>(_Float32List_QNAME, ((Class) List.class), null, ((List<Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ShortToken")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShortToken(String value) {
        return new JAXBElement<String>(_ShortToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Vector")
    public JAXBElement<VectorType> createVector(VectorType value) {
        return new JAXBElement<VectorType>(_Vector_QNAME, VectorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "PositiveIntList")
    public JAXBElement<List<Long>> createPositiveIntList(List<Long> value) {
        return new JAXBElement<List<Long>>(_PositiveIntList_QNAME, ((Class) List.class), null, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "String")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "CategorySet")
    public JAXBElement<CategorySetType> createCategorySet(CategorySetType value) {
        return new JAXBElement<CategorySetType>(_CategorySet_QNAME, CategorySetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Device")
    public JAXBElement<DeviceDBEntryType> createDevice(DeviceDBEntryType value) {
        return new JAXBElement<DeviceDBEntryType>(_Device_QNAME, DeviceDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Parameter")
    public JAXBElement<ParameterType> createParameter(ParameterType value) {
        return new JAXBElement<ParameterType>(_Parameter_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeInt32List")
    public JAXBElement<List<Long>> createNonNegativeInt32List(List<Long> value) {
        return new JAXBElement<List<Long>>(_NonNegativeInt32List_QNAME, ((Class) List.class), null, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChemicalElementSymbolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ChemicalElementSymbol")
    public JAXBElement<ChemicalElementSymbolType> createChemicalElementSymbol(ChemicalElementSymbolType value) {
        return new JAXBElement<ChemicalElementSymbolType>(_ChemicalElementSymbol_QNAME, ChemicalElementSymbolType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeInt64")
    public JAXBElement<BigInteger> createNonNegativeInt64(BigInteger value) {
        return new JAXBElement<BigInteger>(_NonNegativeInt64_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeInt")
    public JAXBElement<Long> createNonNegativeInt(Long value) {
        return new JAXBElement<Long>(_NonNegativeInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Float32")
    public JAXBElement<Float> createFloat32(Float value) {
        return new JAXBElement<Float>(_Float32_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ShortNameList")
    public JAXBElement<List<String>> createShortNameList(List<String> value) {
        return new JAXBElement<List<String>>(_ShortNameList_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "PositiveInt")
    public JAXBElement<Long> createPositiveInt(Long value) {
        return new JAXBElement<Long>(_PositiveInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link XMLGregorianCalendar }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "DateTimeList")
    public JAXBElement<List<XMLGregorianCalendar>> createDateTimeList(List<XMLGregorianCalendar> value) {
        return new JAXBElement<List<XMLGregorianCalendar>>(_DateTimeList_QNAME, ((Class) List.class), null, ((List<XMLGregorianCalendar> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Module")
    public JAXBElement<ModuleDBEntryType> createModule(ModuleDBEntryType value) {
        return new JAXBElement<ModuleDBEntryType>(_Module_QNAME, ModuleDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelDBType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Model")
    public JAXBElement<ModelDBType> createModel(ModelDBType value) {
        return new JAXBElement<ModelDBType>(_Model_QNAME, ModelDBType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellSandwichDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "CellSandwich")
    public JAXBElement<CellSandwichDBEntryType> createCellSandwich(CellSandwichDBEntryType value) {
        return new JAXBElement<CellSandwichDBEntryType>(_CellSandwich_QNAME, CellSandwichDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "PropertyType")
    public JAXBElement<PropertyTypeType> createPropertyType(PropertyTypeType value) {
        return new JAXBElement<PropertyTypeType>(_PropertyType_QNAME, PropertyTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ParameterSet")
    public JAXBElement<ParameterSetType> createParameterSet(ParameterSetType value) {
        return new JAXBElement<ParameterSetType>(_ParameterSet_QNAME, ParameterSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "DateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Int32")
    public JAXBElement<Integer> createInt32(Integer value) {
        return new JAXBElement<Integer>(_Int32_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "EmbeddedXML")
    public JAXBElement<String> createEmbeddedXML(String value) {
        return new JAXBElement<String>(_EmbeddedXML_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingBlockDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "BuildingBlock")
    public JAXBElement<BuildingBlockDBEntryType> createBuildingBlock(BuildingBlockDBEntryType value) {
        return new JAXBElement<BuildingBlockDBEntryType>(_BuildingBlock_QNAME, BuildingBlockDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Long }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeIntList")
    public JAXBElement<List<Long>> createNonNegativeIntList(List<Long> value) {
        return new JAXBElement<List<Long>>(_NonNegativeIntList_QNAME, ((Class) List.class), null, ((List<Long> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ShortName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShortName(String value) {
        return new JAXBElement<String>(_ShortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Cell")
    public JAXBElement<CellDBEntryType> createCell(CellDBEntryType value) {
        return new JAXBElement<CellDBEntryType>(_Cell_QNAME, CellDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartDBEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Part")
    public JAXBElement<PartDBEntryType> createPart(PartDBEntryType value) {
        return new JAXBElement<PartDBEntryType>(_Part_QNAME, PartDBEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Float64List")
    public JAXBElement<List<Double>> createFloat64List(List<Double> value) {
        return new JAXBElement<List<Double>>(_Float64List_QNAME, ((Class) List.class), null, ((List<Double> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeInt64List")
    public JAXBElement<List<BigInteger>> createNonNegativeInt64List(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_NonNegativeInt64List_QNAME, ((Class) List.class), null, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimulationDBType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Simulation")
    public JAXBElement<SimulationDBType> createSimulation(SimulationDBType value) {
        return new JAXBElement<SimulationDBType>(_Simulation_QNAME, SimulationDBType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Int32List")
    public JAXBElement<List<Integer>> createInt32List(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_Int32List_QNAME, ((Class) List.class), null, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "ShortString")
    public JAXBElement<String> createShortString(String value) {
        return new JAXBElement<String>(_ShortString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "BooleanList")
    public JAXBElement<List<Boolean>> createBooleanList(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_BooleanList_QNAME, ((Class) List.class), null, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "Definition")
    public JAXBElement<DefinitionType> createDefinition(DefinitionType value) {
        return new JAXBElement<DefinitionType>(_Definition_QNAME, DefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "BatteryML:2.0", name = "NonNegativeInt32")
    public JAXBElement<Long> createNonNegativeInt32(Long value) {
        return new JAXBElement<Long>(_NonNegativeInt32_QNAME, Long.class, null, value);
    }

}