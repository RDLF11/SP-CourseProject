//Rodrigo De Lama
//
public class Product {

    //Attributes

    //Product components
    private String name;
    private String brand;
    private char category;
            //Identifiers for the different categories
        static final char FOOD = 'f';
        static final char SUPPLIES = 's';
        static final char EQUIPMENT = 'e';
        static final char MISCELLANY = 'm';

    //Countable product?
    private boolean isCountable;

    //Measurement units
    private String measurementUnit; //"kg", "liters", "pieces"....

    //Constructor
    public Product(String name, String brand, char category, boolean isCountable, String measurementUnits) {
        setName(name);
        setBrand(brand);
        setCategory(category);
        setIsCountable(isCountable);
        setMeasurementUnit(measurementUnit);
    }

    //Methods
    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public char getCategory() {
        return category;
    }
    public void setCategory(char category) {
        this.category = category;
    }
    public boolean getIsCountable() {
        return isCountable;
    }
    public void setIsCountable(boolean isCountable) {
        this.isCountable = isCountable;
    }
    public String getMeasurementUnit() {
        return measurementUnit;
    }
    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

}
