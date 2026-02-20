package practica2;

public class JugadorFutbol extends MutxamelFC implements AccionesDeportivas{
    private Equipo categoria;
    private int dorsal;
    private Posicion posiciones;

    public JugadorFutbol(String nombre, int edad, Equipo categoria, int dorsal, Posicion posiciones) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posiciones=posiciones;
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
        this.dorsal = dorsal;
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
