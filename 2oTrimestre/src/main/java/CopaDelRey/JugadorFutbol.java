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
        /**
         * Este es el constructor de un jugador de fútbol, tiene los atributos de la clase madre y también implementa los suyos.
         */

    }



    public void calentar(){
        System.out.println(nombre+ " calentando antes del partido para evitar lesionarse ");

        /**
         * Este método sirve para imprimir el mensaje de arriba cada vez que se le llama (cuando un jugador está calentando)
         */
    }

    public void descansar(){
        System.out.println(nombre+" yendose al descanso después de la primera parte");
        /**
         * Este método también es único de jugador e imprime el mensaje cada vez que se le llama, que es cuando un jugador se va al descanso después de la primera parte
         */
    }

    public void marcarGol(){
        System.out.println(nombre+ " ha marcado gol y lo está celebrando con su afición");
        /**
         * Este método imprime el mensaje de arriba cada vez que se le llama y es único de Jugador, que es cada vez que alguien marca gol
         */
    }



    public Equipo getCategoria() {
        return categoria;

        /**
         * Método que sirve para poder llamar a la categoria del jugador
         */
    }

    public void setCategoria(Equipo categoria) {
        this.categoria = categoria;

        /**
         * Método que sirve para cambiar la categoria del jugador
         */
    }

    public int getDorsal() {
        return dorsal;
        /**
         * Método que sirve para poder llamar al dorsal.
         */
    }

    public void setDorsal(int dorsal) {
        for ( JugadorFutbol jugador : listaJugadores){
            if (jugador.categoria.equals(this.categoria) && jugador.dorsal==dorsal){
                throw new MismoDorsalException();
            }
        }

        this.dorsal = dorsal;

        if (!listaJugadores.contains(this)){
            listaJugadores.add(this);
        }

        /**
         * Este método sirve para poder el cambiar el dorsal cuando se le llama, pero también comprueba que no haya ningún dorsal repetido y añade al jugador a la lista si no está ya.
         */
    }

    public Posicion getPosiciones() {
        return posiciones;

        /**
         * Método que sirve para poder llamar a posiciones
         */
    }

    public void setPosiciones(Posicion posiciones) {
        this.posiciones = posiciones;

        /**
         * Método que sirve para cambiar la posición de un jugador
         */
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
