//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class Provider {

    //Provider Attributes
    private int VAT;
    private String providerName;
    private String taxAddress;
    private Person contactPerson; //contact person should be a person

    //Constructor
        //For the time being we will use the default class constructor
    public Provider() {
        //TODO: stuff by default
    }
    public Provider(int VAT, String providerName, String taxAddress, Person contactPerson) {
        //Deprecated this. assignments for setters
        setVAT(VAT);
        setProviderName(providerName);
        setTaxAddress(taxAddress);
        setContactPerson(contactPerson);
    }

    //Methods - Getters and Setters
    //Getters
    public int getVAT() {
        return VAT;
    }
    public String getProviderName() {
        return providerName;
    }
    public String getTaxAddress() {
        return taxAddress;
    }
    public Person getContactPerson() {
        return contactPerson;
    }
    //Setters
    public void setVAT(int VAT) {
        this.VAT = VAT;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public void setTaxAddress(String taxAddress) {
        this.taxAddress = taxAddress;
    }
    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }    
    
}
