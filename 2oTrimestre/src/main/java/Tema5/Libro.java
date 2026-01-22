package Tema5;

public class Libro {
    private static final int DEF_LIBRO_PRESTADO=-1;
    private static final int DEF_LIBRO_SIN_PRESTAR=1;
    private static int contadorLibrosDisponibles=0;
    private static int contadorCantidadLibros=0;
    private static final String CADENA_ID ="LIB";

    private String id;
    private String  titulo;
    private String autor;
    private boolean disponible;
    private static int cantidadLibros=0;
    private static int librosDisponibles;

    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.disponible = true;
        id = generarId();
        setCantidadLibros();
        setLibrosDisponibles();
    }


    private String generarId() {
        return CADENA_ID+cantidadLibros;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public void prestar(){
        if (disponible){
            System.out.println("El libro "+titulo+" ha sido prestado con éxito.");
            librosDisponibles--;
            disponible = false;
        } else {
            System.out.println("El libro "+titulo+" no se puede prestar debido a que ya esta prestado.");
        }

    }

    public void devolver(){
        if (!disponible){
            System.out.println("El libro "+titulo+" ha sido devuelto con éxito.");
            librosDisponibles++;
            disponible = true;
        } else {
            System.out.println("El libro "+titulo+" ya está disponible. No se puede devolver.");
        }
    }



    public static int getTotalLibros(){
        return cantidadLibros;
    }


    public Libro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static void setCantidadLibros() {
        cantidadLibros = ++contadorCantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    private static void setLibrosDisponibles() {
        librosDisponibles = ++contadorLibrosDisponibles;
    }


@Override

    public String toString(){
        return "Total de libros creados: "+getTotalLibros()+
                " Total libros disponibles: "+getLibrosDisponibles()+
                " El libro "+getTitulo()+" ha sido prestado." +
                " Libros disponibles después del prestamo: "+getLibrosDisponibles()+
                " El libro "+getTitulo()+" ha sido devuelto."+
                " Libros disponibles después de la devolución: "+getLibrosDisponibles();
    }








}
