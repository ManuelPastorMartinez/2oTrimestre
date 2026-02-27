package CopaDelRey;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private static final String FORMATO_FORMACION= "\\d-\\d-\\d";

    private Equipo equipo;
    private String formacionPreferida;

    /**
     * Constructor de entrenador que hereda la clase MutxamelFC y también añade sus atributos propios al constructor
     * @param nombre
     * @param edad
     * @param equipo
     * @param formacionPreferida
     */
    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        setFormacionPreferida(formacionPreferida);

    }

    /**
     * Método que sirve para poder llamar a equipo
     * @return
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Método que sirve para poder cambiar equipo
     * @param equipo
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Método que sirve para llamar a formaciónPreferida
     * @return
     */
    public String getFormacionPreferida() {
        return formacionPreferida;
    }


    /**
     * Método que sirve para cambiar la formación preferida de entrenador
     * @param formacionPreferida
     */
    public void setFormacionPreferida(String formacionPreferida) {

        if (!formacionPreferida.matches(FORMATO_FORMACION)){
            throw new FormacionCorrectaException();
        }
        this.formacionPreferida=formacionPreferida;
    }

    /**
     * Método del entrenador que sirve para mostrar el mensaje de planificar el entrenamiento
     */
    public void planificarEntrenamiento(){
        System.out.println(nombre+ " ha decidido hacer un pre partido en el entrenamiento con la alineación "+formacionPreferida);
    }

    /**
     * Método que sirve para imprimir el mensaje para hacer los cambios
     */
    public void hacerCambios(){
        System.out.println(nombre+" ha decidido hacer cambios ya que el equipo está cansado y necesita piernas frescas");
    }

    /**
     * Método que sirve para sobreescribir concentrarse y con un mensaje personificado para el entrenador
     */
    @Override
    public void concentrarse() {
        System.out.println(nombre+" preparandose mentalmente para el partido");
    }

    /**
     * Método para sobreescribir viajar y con el mensaje para entrenador
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre+" viajando a "+ciudad+" después de la concentración del equipo");
    }

    /**
     * Método que sobreescribe celebrarGol y con mensaje personal para entrenador
     */
    @Override
    public void celebrarGol() {
        System.out.println(nombre+" celebrando el gol del equipo");
    }

    /**
     * Método que sobreescribe entrenar y con mensaje personificado para entrenador
     */
    @Override
    public void entrenar() {
        System.out.println("Preparando el último entrenamiento antes del partido");
    }

    /**
     * Método para sobreescribir jugarPartido personificado para entrenador
     * @param rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Preparando las tácticas del partido contra el "+rival);
    }
}
