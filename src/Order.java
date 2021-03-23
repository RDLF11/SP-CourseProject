//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Order extends ProductList {

    //Each purchase is in reality a specialization of a product list(ProductList)

    //Order Attributes
    private int orderID;
    private static int orderID_counter; //aux value
    //clients and employees should be objects of class Person
    private Person client;
    private Person employee;

    //Order Constructors
    public Order() {
        //Cannot use getters on a super attribute inheritance
        //super(list, getTotalCost(), getTotalPrice(), getTotalBenefit());
        super(list, totalCost, totalPrice, totalBenefit);

        //Always increment the orderID counter
        orderID_counter++;
        this.orderID = orderID_counter;

    }
    public Order(Person client, Person employee) {
        
        //All orderIDs must be tracked
        orderID_counter++;
        this.orderID = orderID_counter;

        setEmployee(employee);
        setClient(client);
    }

    //Methods - Getters and Setters
    //Getters
    public int getOrderID() {
        return orderID;
    }
    public Person getClient() {
        return client;
    }
    public Person getEmployee() {
        return employee;
    }
    //Setters
    public void setClient(Person client) {
        this.client = client;
    }
    public void setEmployee(Person employee) {
        this.employee = employee;
    }


}
