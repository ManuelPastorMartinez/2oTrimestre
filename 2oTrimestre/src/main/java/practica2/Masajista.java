package practica2;

import Tenis.Jugador;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }


    public void darMasaje(JugadorFutbol jugador){
        System.out.println(nombre +" está dando un masaje a "+jugador);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista está preparandose para dar masajes a "+nombre);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista está viajando con el equipo a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista "+ nombre+"grita el gol del Equipo");
    }
}
