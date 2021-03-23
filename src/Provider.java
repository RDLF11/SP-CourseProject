//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Provider {

    //Provider Attributes
    private int vat;
    private String name;
    private String taxAddress;
    private Person contactPerson; //contact person should be a person

    //Constructor
        //For the time being we will use the default class constructor
    public Provider() {
        //TODO: stuff by default
    }
    public Provider(int vat, String name, String taxAddress, Person contactPerson) {
        this.vat = vat;
        this.name = name;
        this.taxAddress = taxAddress;
        this.contactPerson = contactPerson;
    }

    //Methods
    
}
