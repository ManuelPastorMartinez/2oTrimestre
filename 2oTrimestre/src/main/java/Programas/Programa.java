package Programas;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado>listaEmpleados;
    private ArrayList<Invitado>listaInvitados;


    public void setDirector(Empleado director) {
        this.director = director;
    }

    private Empleado director;

    public Programa(String nombre,Cadena cadena,String director){
        this.nombre=nombre;
        this.cadena=cadena;
        this.director=new Empleado(nombre,"director",null);
    }

    public void añadirEmpleado(String nombre,String cargo){
        listaEmpleados.add(new Empleado(nombre,cargo,director));
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public Empleado getDirector() {
        return director;
    }


    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }


}
