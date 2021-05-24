package store;

import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class StockableProduct extends Product {

    //StockableProduct Attributes
        //We must inherit all previous attributes
        private int productID;
        private static int productID_counter; //auxiliary value, to make sure each newly stocked product gets a unique ID

        private int numUnits;
        private double costPerUnit;
        private double pricePerUnit;

    //Constructors
    //For the time being we will use the default class constructor
    public StockableProduct() {
        
        productID_counter++;
        setProductID(productID);
    }
    public StockableProduct(String productName, String productBrand, int numUnits,double costPerUnit, double pricePerUnit){
        super(productName, productBrand);

        productID_counter++;
        setProductID(productID);

        setNumUnits(numUnits);
        setCostPerUnit(costPerUnit);
        setPricePerUnit(pricePerUnit);
    }

    //Methods
    //Getters and Setters
    //since we might need this ID later to either locate it or modify it.
    public int getProductID(){
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getNumUnits() {
        return numUnits;
    }
    public void setNumUnits(int numUnits){
        this.numUnits = numUnits;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }
    public void setCostPerUnit(double costPerUnit){
        this.costPerUnit = costPerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }

    public String toString() {
        return super.toString() + numUnits + "|" + costPerUnit + "|" + pricePerUnit + "\n";
    }

}
