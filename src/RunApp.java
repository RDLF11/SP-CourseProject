//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class RunApp {
    
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

    }
    
}
