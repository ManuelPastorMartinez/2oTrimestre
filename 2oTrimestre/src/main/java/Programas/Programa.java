package Programas;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado>listaEmpleados;
    private ArrayList<Invitado>listaInvitados;
    private Empleado director;

    public Programa(String nombre,Cadena cadena,String director){
        this.nombre=nombre;
        this.cadena=cadena;
        this.director=new Empleado("Director1","director",null);
        listaEmpleados=new ArrayList<>();
        listaInvitados=new ArrayList<>();
    }

    public void anyadirEmpleado(String nombre,String cargo){
        listaEmpleados.add(new Empleado(nombre,cargo,director));
    }

    public void anyadirInvitado(String nombre,String profesion,int temporadas){
        listaInvitados.add(new Invitado(nombre,profesion,temporadas));
    }

    public void invitadosTemporada(int temporada){

        System.out.println("Hay "+listaInvitados.size()+" invitados:");
        for (Invitado invitado:listaInvitados){
            if (temporada==invitado.getTemporada()){
                System.out.println(invitado.getNombre()+" que trabaja de "+invitado.getProfesion());
            }
        }
    }

    public int vecesInvitado(String nombre){
        int aux = 0;
        for (Invitado invitado:listaInvitados){
            if (nombre.equals(invitado.getNombre())){
                aux++;
            }
        }
        System.out.println("El invitado "+nombre+" ha ido "+aux+" veces al programa");
        return aux;
    }

    public void rastrearInvitado(String nombre){

        for (Invitado invitado: listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println(vecesInvitado(nombre)+" ha venido el "+invitado.getFecha_visita()+" en la temporada "+invitado.getTemporada());
            }
        }
    }

    public boolean buscarInvitado(String nombre){

        for (Invitado invitado : listaInvitados){
            if (nombre.equals(invitado.getNombre())){
                return true;
            }
        }
        return false;
    }

    public void invitadoAntes(String nombre){

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

    public void setDirector(Empleado director) {
        this.director = director;
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

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
