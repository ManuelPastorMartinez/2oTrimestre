package CopaDelRey;

public interface FuncionesIntegrantes {

    /**
     * Este método sirve para poder sobreescribirlo cada vez que una clase se relacione con esta y es obligatorio que lo contenga
     * y sirve para cada vez que una persona quiera concentrarse
     */
    public void concentrarse();



    /**
     * Este método también sirve para poder sobreescribirlo cada vez que se relacione con esta clase y sirve para cada vez que un
     * equipo viaje
     * @param ciudad
     */
    public void viajar(String ciudad);

    /**
     * Este método
     */
    public void celebrarGol();
}
