//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public abstract class RunApp {
    
    //Clear console
    public static void clear() {

        //ANSI Escape Codes - Compatible with VSCode
            //https://www.edureka.co/community/4668/how-to-clear-the-console-in-java
        System.out.print("\033[H\033[2J");  
        System.out.flush();
            
        //Eclipse way (primitive - print out 100 lines)
        //for( int i = 0 ; i < 100; i++ ) System.out.println();
    }

    public static void main(String[] args) {
        
        //MainMenu must be shown

        clear();
        
        System.out.println("\t\t\t\t - Main Menu - ");
        System.out.println( "Store info: Store Name: " + getStoreName() +
                            "Store cost: " + getProductCost() + 
                            "Stock benefit: " + getProductBenefit());

        System.out.println("1 - Create Store\n" +
                           "2 - Manage Stock\n" +
                           "3 - Manage Orders (To process)\n" +
                           "4 - Manage Orders (Processed)\n" +
                           "5 - Manage Clients\n" +
                           "6 - Manage Providers\n" +
                           "7 - Manage Employees\n" +
                           "8 - Print Store Info\n" +
                           "9 - Testing\n" +
                           "0 - Exit the application");
                           
        System.out.println("Option>");
    }
    
}
