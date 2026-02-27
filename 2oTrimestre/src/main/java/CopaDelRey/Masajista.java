package CopaDelRey;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
        /**
         * Este es el constructor del masajista, tiene los métodos de la clase madre que los llama con super y después titulación y experiencia que son del propio masajista
         */
    }


    public void darMasaje(String jugador){
        System.out.println("El masajista "+nombre +" está dando un masaje a "+jugador);

        /**
         * Este método es para imprimir el mensaje cada vez que un masajista de un masaje
         */
    }

    public String getTitulacion() {
        return titulacion;
        /**
         * Método para llamar a titulación.
         */
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
        /**
         * Método para cambiar la titulación
         */
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;

        /**
         * Método para llamar a AnyosExperiencia
         */
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
        /**
         * Método para cambiar anyosExperiencia
         */
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista "+nombre+" está preparandose para dar masajes al equipo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista"+nombre+" está viajando con el equipo a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista "+ nombre+" grita el gol del Equipo");
    }
}
