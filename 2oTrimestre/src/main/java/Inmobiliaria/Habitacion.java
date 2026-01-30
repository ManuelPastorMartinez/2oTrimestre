package Inmobiliaria;

import java.util.ArrayList;

public class Habitacion {


    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaElectrodomestico;

    public Habitacion(String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
        this.listaElectrodomestico= new ArrayList<>();
    }

    public void agregarElectrodomestico(String nombre, double consumo){

        for (Electrodomestico electrodomestico: listaElectrodomestico){
            if (electrodomestico.getNombre().equals(nombre)){
                System.out.println("Ya hay un electrodoméstico creado con ese nombre");
                return;
            }
        }

        Electrodomestico electrodomestico= new Electrodomestico(nombre,consumo);
        listaElectrodomestico.add(electrodomestico);
        System.out.println("El electrodoméstico "+nombre+" ha sido creado en "+getNombre());
    }

    public double calcularConsumo(){
        double sumar=0;
        for (Electrodomestico electrodomestico: listaElectrodomestico){
            sumar+= electrodomestico.getConsumo();
        }
        return sumar;
    }

    public void mostrarElectrodomestico(){
        System.out.println("En la habitacion "+nombre+" hay "+listaElectrodomestico.size()+" electrodomésticos");
        for (Electrodomestico electrodomestico: listaElectrodomestico){
            System.out.println("- "+electrodomestico.getNombre()+" ("+electrodomestico.getConsumo()+") kWh ");
        }
    }

    public void borrarElectrodomestico(String nombre){

        for (Electrodomestico electrodomestico: listaElectrodomestico){
            if (electrodomestico.getNombre().equals(nombre)){
                listaElectrodomestico.remove(electrodomestico);
                System.out.println("El electrodoméstico "+nombre+" ha sido borrado");
                return;
            }
        }

        System.out.println("El electrodoméstico "+nombre+" no existe");
    }

    public ArrayList<Electrodomestico>getListaElectrodomestico(){
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(ArrayList<Electrodomestico>listaElectrodomestico){
        this.listaElectrodomestico=listaElectrodomestico;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }


}
