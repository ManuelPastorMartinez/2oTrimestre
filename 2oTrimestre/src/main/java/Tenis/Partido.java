package Tenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set>listaSet;

    public Partido(Jugador jugador1, Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        listaSet=new ArrayList<>();

    }



    public void insertarSet(int puntosJ1, int puntosJ2){

        Set set = new Set(puntosJ1,puntosJ2);
        listaSet.add(set);
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaSet() {
        return listaSet;
    }

    public void setListaSet(ArrayList<Set> listaSet) {
        this.listaSet = listaSet;
    }
}
