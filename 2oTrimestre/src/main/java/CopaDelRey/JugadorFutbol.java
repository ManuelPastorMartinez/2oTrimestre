package CopaDelRey;

import java.util.ArrayList;

public class JugadorFutbol extends MutxamelFC implements AccionesDeportivas{
    private Equipo categoria;
    private int dorsal;
    private Posicion posiciones;
    private static ArrayList<JugadorFutbol>listaJugadores=new ArrayList<>();

    public JugadorFutbol(String nombre, int edad, Equipo categoria, int dorsal, Posicion posiciones) {
        super(nombre, edad);
        this.categoria=categoria;
        this.posiciones=posiciones;
        setDorsal(dorsal);


    }



    public void calentar(){
        System.out.println(nombre+ " calentando antes del partido para evitar lesionarse ");
    }

    public void descansar(){
        System.out.println(nombre+" yendose al descanso después de la primera parte");
    }

    public void marcarGol(){
        System.out.println(nombre+ " ha marcado gol y lo está celebrando con su afición");
    }



    public Equipo getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipo categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        boolean estado = true;

        for ( JugadorFutbol jugador : listaJugadores){
            try{
                if (jugador.categoria.equals(categoria) && jugador.dorsal==dorsal){
                    estado=false;
                    throw new MismoDorsalException();
                }
            }catch (MismoDorsalException e){
                System.out.println(e.getMessage());
            }
        }
        if (estado && dorsal!=this.dorsal){
            listaJugadores.add(this);
        }
    }

    public Posicion getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posicion posiciones) {
        this.posiciones = posiciones;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre+" preparandose física y mentalmente para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre+" viajando a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre+" celebrando el gol");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre+" entrenando duramente antes del partido");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugando partido contra el " + rival);
    }
}
