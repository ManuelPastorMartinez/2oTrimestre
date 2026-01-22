package Tema5;

public class Libro {
    private static final int DEF_LIBRO_PRESTADO=-1;
    private static final int DEF_LIBRO_SIN_PRESTAR=1;
    private static int contadorLibrosDisponibles=0;
    private static int contadorCantidadLibros=0;

    private int id= 0;
    private String  titulo;
    private String autor;
    private boolean disponible;
    private static int cantidadLibros=0;
    private static int librosDisponibles;

    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        calcularId();
        setCantidadLibros();
        setLibrosDisponibles();

    }

    public boolean prestar(){
        return true;
    }

    private void calcularId(){
        id++;
    }

    public Libro(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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











}
