package Tema5;

public class EstudianteApp {
    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());


        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());
        System.out.println(raul);

        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay "+Estudiante.obtenerTotalEstudiantes()+" estudiantes.");

        System.out.println(Estudiante.validarCorreo("manuel@gmail.com"));
        System.out.println(Estudiante.validarCorreo("manuel@alu.edu.gva.es"));

        Libro divina_comedia = new Libro("divina comedia","dante ali");

        divina_comedia.prestar(jorge);

        divina_comedia.devolver();
    }
}
