package store;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Product {
    
    //Product Attributes
    private String productName;
    private String productBrand;
    private char category;
        //we need 4 final char categories:
        static final char FOOD = 'f';
        static final char SUPPLIES = 's';
        static final char EQUIPMENT = 'e';
        static final char MISCELLANY = 'm';
    private boolean isCountable;
    private String measurementUnit; //kg, litres, pieces...

    //Constructors
    public Product() {

    }
    public Product(String productName, String productBrand) {
        setProductName(productName);
        setProductBrand(productBrand);
    }

    //Methods - Getters and Setters
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getProductBrand() {
        return productBrand;
    }

    public char getCategory() {
        return category;
    }
    public void setCategory(char category) {
        if (category == 'f' || category == 's' || category == 'e' || category == 'm') {
            this.category = category;
        } else {
            System.err.println("Please input a valid category ('f', 's', 'e' or 'm')");
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

    //set method
    public void set(String[] productData) {
        //try {
        setProductName(productData[0]);
        setProductBrand(productData[1]);
        String category = productData[2];
        setCategory( category.charAt(0)); //turn string to char
        //} catch (ProductException pe) {
        //    pe.printStackTrace();
        //    System.exit(1);
        //}
    }

    public String toString() {
        return productName + "|" + productBrand;
    }
}
