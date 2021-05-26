import java.util.Scanner;
import store.StoreManager;

//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public abstract class RunApp {

    //static scanner and input var for global referencing across RunApp file
    static Scanner userInput = new Scanner(System.in);
    static String input = userInput.next();
    
    //Clear console
    public static void clear() {

        //ANSI Escape Codes - Compatible with VSCode
            //https://www.edureka.co/community/4668/how-to-clear-the-console-in-java
        System.out.print("\033[H\033[2J");  
        System.out.flush();
            
        //Eclipse (primitive - print out 100 lines)
        //for( int i = 0 ; i < 100; i++ ) System.out.println();
    }

    public static void mainMenu() {
        clear();
        
        System.out.println("\t - Main Menu - ");
        System.out.println("Store info: Store Name: " + StoreManager.getStoreName() +
                           "\nStore cost: " + StoreManager.getStockCost() + 
                           "\nStock benefit: " + StoreManager.getStockBenefit());

        System.out.println("1 - Create Store\n" +
                           "2 - Manage Stock\n" +
                           "3 - Manage Orders (To process)\n" +
                           "4 - Manage Orders (Processed)\n" +
                           "5 - Manage Clients\n" +
                           "6 - Manage Providers\n" +
                           "7 - Manage Employees\n" +
                           "8 - Print Store Info\n" +
                           "9 - Testing\n" +
                           "0 - Exit the application\n");

        System.out.print("Option> ");
    }

    public static void menuSelection(String selection) {
        switch(selection) {
            case "1":
                CreateStoreMENU();
            case "2":
                StoreManagerMENU();
            case "3":
                OrdersToProcessMENU();
            case "4":
                ProcessedOrdersMENU();
            case "5":
                ClientManagerMENU();
            case "6":
                ProviderManagerMENU();
            case "7":
                EmployeeManagerMENU();
            case "8":
                StoreInfoMENU();
            case "9":
                TestingSuiteMENU();
            case "0":
                System.exit(0); //Exit the application
            default:
                System.err.println("Please input a valid digit from 0-9");
        }

    }

    private static void CreateStoreMENU() {
        System.out.println("\t - Store Creation Menu - ");
        System.out.println("What would you like to name the store?: " + input);
        StoreManager.setStoreName(input);

    }

    private static void StoreManagerMENU() {
        System.out.println("\t - Stock Management Menu - ");
        System.out.println("Store info: Store Name: " + StoreManager.getStoreName() +
                           "\nStore cost: " + StoreManager.getStockCost() + 
                           "\nStock benefit: " + StoreManager.getStockBenefit());

        System.out.println("1 - Insert Stock\n" +
                           "2 - Remove Stock\n" +
                           "3 - Modify Stock\n" +
                           "4 - Search Stock\n" +
                           "0 - Exit the application\n");
    }

    private static void OrdersToProcessMENU() {

    }

    private static void ProcessedOrdersMENU() {

    }

    private static void ClientManagerMENU() {

    }

    private static void ProviderManagerMENU() {

    }

    private static void EmployeeManagerMENU() {

    }

    private static void StoreInfoMENU() {

    }

    private static void TestingSuiteMENU() {
        
    }

    public static void main(String[] args) {
        mainMenu();



            String input = userInput.next();
            menuSelection(input);

        
    }

}
