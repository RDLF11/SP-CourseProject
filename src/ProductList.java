import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class ProductList {

    //ProductList Attributes
    //declare static and friendly for Order.java cosntructor to be able to utilise them
    static ArrayList<StockableProduct> list = new ArrayList<StockableProduct>(); //changed list from string to ArrayList
    static double totalCost;
    static double totalPrice;
    static double totalBenefit;

    //Constructors
    public ProductList() {
    }
    //to be able to inherit attributes we need an initial constructor
    public ProductList(ArrayList<StockableProduct> list, double totalCost, double totalPrice, double totalBenefit) {
    }

    //Getters for initial test of Order constructor
    //Cannot use getters in a subclass constructor method
    public ArrayList<StockableProduct> getList() {
        return list;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalBenefit() {
        return totalBenefit;
    }

    //Setters - to be potentially used in Order.java
    public void setList(ArrayList<StockableProduct> list) {
        ProductList.list = list; //since they are static, we must access them differently
    }

    public void setTotalCost(double totalCost) {
        ProductList.totalCost = totalCost;
    }

    public void setTotalPrice(double totalPrice) {
        ProductList.totalPrice = totalPrice;
    }

    public void setTotalBenefit(double totalBenefit) {
        ProductList.totalBenefit = totalBenefit;
    }

}
