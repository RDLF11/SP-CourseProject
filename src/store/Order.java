package store;

import java.util.ArrayList;
import java.util.Scanner;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Order extends ProductList {

    //Each purchase is in reality a specialization of a product list(ProductList)

    //Order Attributes
    private int orderID;
    private static int orderID_counter; //aux value

    //clients and employees shall be objects of class Person
    private Person client;
    private Person employee;

    //Constructors
    public Order() {
        //Always increment the orderID counter
        orderID_counter++;
        serOrderID(orderID);
    }
    public Order(ArrayList<StockableProduct> list, double totalCost, double totalPrice, double totalBenefit, Person client, Person employee) {
        super(list, totalCost, totalPrice, totalBenefit);
        
        //All orderIDs must be tracked
        orderID_counter++;
        serOrderID(orderID);

        setEmployee(employee);
        setClient(client);
    }

    //Methods - Getters and Setters
    public int getOrderID() {
        return orderID;
    }
    public void serOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Person getClient() {
        return client;
    }
    public void setClient(Person client) {
        this.client = client;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }
    public Person getEmployee() {
        return employee;
    }

    public String toString() {
        return super.toString() + "\\|" + orderID + "\\|" + client + "\\|" + employee + "\n";
    }

    public void print() {
    }

    public void writeToFile() {
    }

    //Read from standard input (keyboard input)
    public Order readKeyboard() {
        System.out.println("Setting new Person");
        Person result = new Person();
        try {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Input the client details\n");
            System.out.print("First Name: ");
                result.setFirstName(userInput.next());
            System.out.print("Last Name: ");
                result.setLastName(userInput.next());
            System.out.print("email: ");
                result.setEmail(userInput.next());

            System.out.println("Input the employee details\n");
            
        userInput.close();
        } catch (PersonException pe) {
            pe.printStackTrace();
            System.exit(1);
        }
        return result;
    }
    //Read from a file with the format of each object in each line
    public Order readFile(String File){
        Scanner fileInput = new Scanner(File);
        return 
    }
}
