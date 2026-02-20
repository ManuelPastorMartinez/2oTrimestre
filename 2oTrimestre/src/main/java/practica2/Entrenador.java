package practica2;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private static final String FORMATO_FORMACION= "\\d{1,2}-\\d{1,2}-\\d{1,2}";

    private Equipo equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println(nombre+ " ha decidido hacer un pre partido en el entrenamiento con la alineación "+formacionPreferida);
    }
    public void hacerCambios(){
        System.out.println(nombre+" ha decidido hacer cambios ya que el equipo está cansado y necesita piernas frescas");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre+" preparandose mentalmente para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre+" viajando a "+ciudad+" después de la concentración del equipo");
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre+" celebrando el gol del equipo");
    }

    @Override
    public void entrenar() {
        System.out.println("Preparando el último entrenamiento antes del partido");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Preparando las tácticas del partido contra el "+rival);
    }
}
