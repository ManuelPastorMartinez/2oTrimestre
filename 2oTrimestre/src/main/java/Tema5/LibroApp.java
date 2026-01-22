package Tema5;

public class LibroApp {

    public static void main(String[] args) {

        Libro quijote = new Libro("Quijote","Miguel de Cervantes Salavedra");

        System.out.println(quijote.getTitulo());
        System.out.println(quijote.getAutor());

        quijote.prestar();
        quijote.prestar();


        System.out.println(quijote.estaDisponible());

        System.out.println("Libros disponibles: "+Libro.getLibrosDisponibles());
        System.out.println("Total libros: "+Libro.getTotalLibros());
        quijote.devolver();
        quijote.devolver();


        System.out.println(quijote.estaDisponible());

        System.out.println("Libros disponibles: "+Libro.getLibrosDisponibles());
    }
}
