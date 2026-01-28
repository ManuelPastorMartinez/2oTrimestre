package Tema5;

public class EstudianteApp {
    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());


        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());


        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay "+Estudiante.obtenerTotalEstudiantes()+" estudiantes.");

        System.out.println(Estudiante.validarCorreo("manuel@gmail.com"));
        System.out.println(Estudiante.validarCorreo("manuel@alu.edu.gva.es"));

        Editorial millenium= new Editorial("Millenium","España");

        Libro divina_comedia = new Libro("divina comedia","dante ali",millenium);

        Prestamo p1 = divina_comedia.prestar(jorge);

        System.out.println("Fecha préstamo: " + p1.getFecha());
        System.out.println(jorge.getListaLibros());


        System.out.println("Libros disponibles: "+Libro.getTotalLibros());
    }
}
