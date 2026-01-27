package Tema5;

public class LibroApp {
    public static void main(String[] args) {


        Editorial millenium = new Editorial("Millenium","España");
        Libro quijote = new Libro("Quijote","Miguel de Cervantes Salavedra",millenium);

        System.out.println(quijote.getTitulo());
        System.out.println(quijote.getAutor());




        System.out.println(quijote.estaDisponible());

        System.out.println("Libros disponibles: "+ Libro.getLibrosDisponibles());
        System.out.println("Total libros: "+ Libro.getTotalLibros());




        System.out.println(quijote.estaDisponible());

        System.out.println("Libros disponibles: "+ Libro.getLibrosDisponibles());
    }
}