package Biblio;

import java.util.ArrayList;

public class Editorial {


    private String editorial;
    private String Pais;
    private ArrayList<Libro>listaLibros;

    public Editorial(String editorial,String pais){
        this.editorial=editorial;
        this.Pais=pais;
        listaLibros=new ArrayList<>();
    }

    public Editorial(){
        this("","");
    }

    public void insertarLibro(Libro libro){
        listaLibros.add(libro);
    }

    public void borrarLibro(Libro libro){
        listaLibros.remove(libro);
    }

    public ArrayList<Libro>getListaLibros(){
        return listaLibros;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "editorial='" + editorial + '\'' +
                ", Pais='" + Pais + '\'' +
                ", listaLibros=" + listaLibros +
                '}';
    }




}
