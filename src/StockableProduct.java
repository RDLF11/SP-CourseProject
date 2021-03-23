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

    public void prueba(){
        
    }


    //Methods

}
