package CopaDelRey;

public interface AccionesDeportivas {

    /**
     * Este método sirve para poder sobreescribirlo en las clases que utilicen acciones deportivas y es obligatorio implementarlo
     */
    public void entrenar();

    /**
     * Método que sirve para sobreescribirlo en las clases que utilicen esta, también obligatorio implementarlo
     * @param rival
     */
    public void jugarPartido(String rival);
}
