import java.util.ArrayList;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class StockableProduct extends Product {

    //StockableProduct Attributes
        //We must inherit all previous attributes
        private int productID;
        private static int ID_counter; //auxiliary value, to make sure each newly stocked product gets a unique ID

        private int numUnits;
        private double costPerUnit;
        private double pricePerUnit;

        ArrayList <StockableProduct> list;
        //We will store totalCost, totalPrice and totalBenefit in this ArrayList
            //All these values take into account not only the different products on the
            //list but also the number of units available for each of them

    //Constructor
        //For the time being we will use the default class constructor
    public StockableProduct() {

        ID_counter++;
        this.productID = ID_counter;

        //Initialize ProductList ArrayList here
        list = new ArrayList<StockableProduct>();
            // ???????
            //MAYBE we need to initialize this ArrayList in ProductList.java
            //Potential error of duplicate name "list" if declared in ProductList class
    }

    //Methods

}