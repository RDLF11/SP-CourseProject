package store;

import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class StoreManager {

    //StoreManager Attributes
    private String storeName; //name of the store
    private double stockCost;
    private double stockBenefit;

    //we should consider if this ArrayList is necessary
    private ArrayList <ProductList> stock;

    //Empty constructor
    public StoreManager() {
        
    }

    //Non empty consctrutor
    public StoreManager(String storeName, double stockCost, double stockBenefit) {
        setStoreName(storeName);
        setStockCost(stockCost);
        setStockBenefit(stockBenefit);
    }

    //Methods - Getters and Setters
    //Getters
    public String getStoreName() {
        return storeName;
    }
    public double getStockCost() {
        return stockCost;
    }
    public double getStockBenefit() {
        return stockBenefit;
    }
    //Setters
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public void setStockCost(double stockCost) {
        this.stockCost = stockCost;
    }
    public void setStockBenefit(double stockBenefit) {
        this.stockBenefit = stockBenefit;
    }

}
