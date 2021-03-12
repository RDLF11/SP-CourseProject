//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Order extends ProductList {

    //Each purchase is in reality a specialization of a product list(ProductList)

    //Order Attributes
    private int orderID;
    private String client;
    private String employee;

    //Order Constructor
    public Order() {

        //Cannot use getters on a super attribute inheritance
        //super(list, getTotalCost(), getTotalPrice(), getTotalBenefit());

        super(list, totalCost, totalPrice, totalBenefit);
        
    }

}
