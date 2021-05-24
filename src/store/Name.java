package store;

public class Name implements Comparable<Name> {
    
    //Attributes
    private String name;
    private String firstSurname;
    private String secondSurname;
    
    public Name(String name, String firstSurname, String secondSurname) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return this.firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return this.secondSurname;
    }
    
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    
    public String toString() {
        return this.firstSurname + " " + this.secondSurname + ", " + this.name;
    }

    @Override
    public int compareTo(Name anotherName) {
        if (anotherName != null) {
            if (firstSurname.compareTo(anotherName.getFirstSurname()) < 0) {
                return -1;
            } else if(firstSurname.compareTo(anotherName.getFirstSurname()) > 0) { 
                return 1;
            } else {
                if(secondSurname.compareTo(anotherName.getSecondSurname()) < 0) {
                    return -1;
                } else if (secondSurname.compareTo(anotherName.getSecondSurname()) > 0) {
                    return 1;
                } else {
                    if (this.name.compareTo(anotherName.getName()) < 0) {
                        return -1;
                    } else if(this.name.compareTo(anotherName.getName()) > 0){
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
        return -1;
    }
}