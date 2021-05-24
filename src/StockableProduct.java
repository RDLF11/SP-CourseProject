//Rodrigo De Lama
//
public class StockableProduct extends Product {
    
    //Attributes
    private int productID;
    private int numUnits;
    private double costPerUnit;
    private double pricePerUnits;

    public StockableProduct() {
        super(name, brand, category, isCountable, measurementUnit);

    }


}
