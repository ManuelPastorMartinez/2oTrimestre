package CopaDelRey;

public class Acompanyante extends MutxamelFC {
    private JugadorFutbol integrante;
    private String parentesco;

    /**
     * El constructor de acompañante, hereda los atributos de MutxamelFC y también añade los suyos propios
     * @param nombre
     * @param edad
     * @param integrante
     * @param parentesco
     */
    public Acompanyante(String nombre, int edad, JugadorFutbol integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    /**
     * Método exclusivo de acompañante para animar al equipo
     */
    public void animarEquipo(){
        System.out.println(nombre+ " animando con toda su alma al equipo");
    }

    /**
     * Método para poder llamar a integrante
     * @return
     */
    public JugadorFutbol getIntegrante() {
        return integrante;
    }

    /**
     * Método para cambiar el integrante del acompañante
     * @param integrante
     */
    public void setIntegrante(JugadorFutbol integrante) {
        this.integrante = integrante;
    }

    /**
     * Método para poder llamar al parentesco del jugador con el acompañante
     * @return
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Método para cambiar el parentesco de un acompañante con el jugador
     * @param parentesco
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Método que sobreescribe a concentrarse y personalizado para el acompañante
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante del jugador está ayudandole a concentrarse para su partido");
    }

    /**
     * Método para sobreescribir ciudad y decir donde viaja el acompañante
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante "+nombre+" está viajando con el jugador a "+ciudad);
    }

    /**
     * Método para sobreescribir celebrarGol y personalizado al acompañante
     */

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante "+ nombre+" está celebrando el gol de su "+parentesco);
    }


}
