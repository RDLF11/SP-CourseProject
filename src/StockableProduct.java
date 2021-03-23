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

    //Constructor
        //For the time being we will use the default class constructor
    public StockableProduct() {

        productID_counter++;
        this.productID = productID_counter;

    }
    //Variable Constructor 

    public StockableProduct(int numUnits,double costPerUnit, double pricePerUnit){
        setnumUnits(numUnits);
        setcostPerUnit(costPerUnit);
        setpricePerUnit(pricePerUnit);
    }

    //Methods
    //Getters
        //since we might need this ID later to either locate it or modify it.
    public int productID(){
        return productID;
    }

    //Setters
        //we create a set() method for this 3 variables since theres a empty constructor.
    public void setnumUnits(int numUnits){
        this.numUnits = numUnits;
    }

    public void setcostPerUnit(double costPerUnit){
        this.costPerUnit = costPerUnit;
    }

    public void setpricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }

}
