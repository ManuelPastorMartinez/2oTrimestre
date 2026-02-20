package Tenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugadorTenis1;
    private Jugador jugadorTenis2;
    private ArrayList<Set>listaSet;

    public Partido(Jugador jugadorTenis1, Jugador jugadorTenis2){
        this.jugadorTenis1 = jugadorTenis1;
        this.jugadorTenis2 = jugadorTenis2;
        this.listaSet=new ArrayList<>();
        jugadorTenis1.setRival(jugadorTenis2);
        jugadorTenis2.setRival(jugadorTenis1);
    }



    public void insertarSet(int puntosJ1, int puntosJ2){
        Set set = new Set(puntosJ1,puntosJ2);
        listaSet.add(set);
    }

    public Jugador getJugador1() {
        return jugadorTenis1;
    }

    public void setJugador1(Jugador jugadorTenis1) {
        this.jugadorTenis1 = jugadorTenis1;
    }

    public Jugador getJugador2() {
        return jugadorTenis2;
    }

    public void setJugador2(Jugador jugadorTenis2) {
        this.jugadorTenis2 = jugadorTenis2;
    }

    public ArrayList<Set> getListaSet() {
        return listaSet;
    }

    public void setListaSet(ArrayList<Set> listaSet) {
        this.listaSet = listaSet;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugadorTenis1 +
                ", jugador2=" + jugadorTenis2 +
                ", listaSet=" + listaSet +
                '}';
    }
}
