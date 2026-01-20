package Tema5;

public class EstudianteApp {
    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());


        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());
        System.out.println(raul);
    }
}
