//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class ProductList {

    //ProductList Attributes
    //declare static and friendly for Order.java cosntructor to be able to utilise them
    static String list;
    static double totalCost;
    static double totalPrice;
    static double totalBenefit;

    //to be able to inherit attributes we need an initial constructor
    public ProductList(String list, double totalCost, double totalPrice, double totalBenefit) {
    }

    //Getters for initial test of Order constructor
    //Cannot use getters in a constructor method
    public String getList() {
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

}
