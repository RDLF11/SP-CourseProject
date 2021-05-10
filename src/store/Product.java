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
        static final char Food = 'f';
        static final char Supplies = 's';
        static final char Equipment = 'e';
        static final char Miscellany = 'm';

    private boolean isCountable;
    private String measurementUnit; //kg, litres, pieces...

    //Constructor
        //For the time being we will use the default class constructor
    public Product() {

    }

    public Product(String productName, String productBrand) {
        setProductName(productName);
        setProductBrand(productBrand);
    }

    //Methods - Getters and Setters
    //Getters
    public char getCategory() {
        return category;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductBrand() {
        return productBrand;
    }
    //Setters

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public void setCategory(char category) {
        this.category = category;
    }
    //set method
    public void set(String[] productData) {
        try {
            setProductName(productData[0]);
            setProductBrand(productData[1]);
            //setCategory(.valueOf(productData[2])); turn string to char
        } catch (ProductException pe) {
            pe.printStackTrace();
            System.exit(1);
        }
    }

}
