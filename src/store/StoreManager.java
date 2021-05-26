package store;

import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class StoreManager {

    //StoreManager Attributes
    private static String storeName; //name of the store
    private static double stockCost;
    private static double stockBenefit;

    //we should consider if this ArrayList is necessary
    private ArrayList <ProductList> stock;

    //Empty constructor (We may also not declare it since it exits by default)
    public StoreManager() {}

    //Non empty constructor
    public StoreManager(String storeName, double stockCost, double stockBenefit) {
        setStoreName(storeName);
        setStockCost(stockCost);
        setStockBenefit(stockBenefit);
    }

    //Methods - Getters and Setters

    public static String getStoreName() {
        return storeName;
    }
    public static void setStoreName(String storeName) {
        StoreManager.storeName = storeName;
    }

    public void setStockCost(double stockCost) {
        StoreManager.stockCost = stockCost;
    }
    public static double getStockCost() {
        return stockCost;
    }

    public void setStockBenefit(double stockBenefit) {
        StoreManager.stockBenefit = stockBenefit;
    }
    public static double getStockBenefit() {
        return stockBenefit;
    }

    public String toString() {
        return storeName + "|" + stockCost + "|" + stockBenefit + "\n";
    }
}
