package store;

import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class ProductList {

    //ProductList Attributes
    //declare static and friendly for Order.java constructor to be able to utilise them
    private ArrayList<StockableProduct> list = new ArrayList<StockableProduct>(); //changed list from string to ArrayList
    private double totalCost;
    private double totalPrice;
    private double totalBenefit = totalPrice - totalCost;

    //Constructors
    //to be able to inherit attributes we need a standard empty constructor
    public ProductList() {
    }
    public ProductList(ArrayList<StockableProduct> list, double totalCost, double totalPrice, double totalBenefit) {
        setList(list);
        setTotalCost(totalCost);
        setTotalPrice(totalPrice);
        setTotalBenefit(totalBenefit);
    }

    //Methods - Getters and Setters
    public ArrayList<StockableProduct> getList() {
        return list;
    }
    public void setList(ArrayList<StockableProduct> list) {
        this.list = list;
    //if the objects were static, we must access them differently --> class.attribute = inputAttribute
    }

    //Product cost
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    //customer price
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    //benefit for the store
    public double getTotalBenefit() {
        return totalBenefit;
    }
    public void setTotalBenefit(double totalBenefit) {
        this.totalBenefit = totalBenefit;
    }

    //toString method
    public String toString() {
        return list + "\\|" + totalCost + "\\|" + totalPrice + "\\|" + totalBenefit;
    }

    public void print() {

    }

    public void writeToFile() {
        
    }
}
