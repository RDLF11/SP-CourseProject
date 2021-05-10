//Systems Programming Course Project
//Rodrigo De Lama - 100451775@alumnos.uc3m.es - @RDLF11
//Jaime Mato - 100451639@alumnos.uc3m.es - @Pekeniojimi
//Manuel Morales - 100451690@alumnos.uc3m.es - @ikaoseu

public class PersonException extends Exception {

    //Declared the default static final serialVersionUID field of type long Java(536871008) as suggested by VSCode
    private static final long serialVersionUID = 1L;

    //PersonException Constructor required by various Person.java methods
    public PersonException(String errorMsg) {

        System.err.println(errorMsg);
    }

}
