//Rodrigo De Lama
//
public class Product {

    //Attributes

    //Product components
    String name;
    String brand;
    String category;
        //Identifiers for the different categories
        final char FOOD = 'f';
        final char SUPPLIES = 's';
        final char EQUIPMENT = 'e';
        final char MISCELLANY = 'm';

    //Countable product?
    boolean isCountable;

    //Measurement units
    String measurementUnit; //"kg", "liters", "pieces"....

    //Constructor
    public Product(String name, String brand, String category) {
        this.name = name;
        this.brand = brand;
        this.category = category;
    }

}
