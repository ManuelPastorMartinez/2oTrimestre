package CopaDelRey;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int anyosExperiencia;

    /**
     * Este es el constructor del masajista, tiene los métodos de la clase madre que los llama con super y después titulación y experiencia que son del propio masajista
     * @param nombre
     * @param edad
     * @param titulacion
     * @param anyosExperiencia
     */
    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }

    /**
     * Este método es para imprimir el mensaje cada vez que un masajista de un masaje
     * @param jugador
     */
    public void darMasaje(String jugador){
        System.out.println("El masajista "+nombre +" está dando un masaje a "+jugador);
    }

    /**
     * Método para llamar a titulación.
     * @return
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * Método para cambiar la titulación
     * @param titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * Método para llamar a AnyosExperiencia
      * @return
     */
    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    /**
     * Método para cambiar anyosExperiencia
     * @param anyosExperiencia
     */
    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    /**
     * Método que sobreescribe concentrarse y personalizado para masajista
     */
    @Override
    public void concentrarse() {
        System.out.println("El masajista "+nombre+" está preparandose para dar masajes al equipo");
    }

    /**
     * Método que sobreescribe viajar y personalizado para masajista
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista"+nombre+" está viajando con el equipo a "+ciudad);
    }

    /**
     * Método para sobreescribir celebrarGol y personalizado para masajista
     */
    @Override
    public void celebrarGol() {
        System.out.println("El masajista "+ nombre+" grita el gol del Equipo");
    }
}
