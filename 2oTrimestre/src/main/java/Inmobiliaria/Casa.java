package Inmobiliaria;

import java.util.ArrayList;

public class Casa {



    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;

    public Casa(String direccion){
        this.direccion=direccion;
        listaHabitaciones=new ArrayList<>();
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion: listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación "+ nombre+" ya existe");
                return;
            }

        }
        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion "+nombre+" creada.");
    }

    public void mostrarHabitacion(){
        System.out.println("Casa en "+direccion+" tiene "+listaHabitaciones.size()+" habitaciones.");
        for (Habitacion habitacion: listaHabitaciones){
            System.out.println("- "+ habitacion.getNombre()+" ("+habitacion.getMetros()+") m2");
        }
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);

        for (Habitacion habitacion: listaHabitaciones) {
            if (habitacion.getMetros()>mayor.getMetros()){
                mayor=habitacion;
            }
        }

        return mayor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }




}
