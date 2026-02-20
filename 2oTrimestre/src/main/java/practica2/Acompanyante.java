package practica2;

public class Acompanyante extends MutxamelFC {
    private JugadorFutbol integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, JugadorFutbol integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    public void animarEquipo(){
        System.out.println(nombre+ " animando con toda su alma al equipo");
    }

    public JugadorFutbol getIntegrante() {
        return integrante;
    }

    public void setIntegrante(JugadorFutbol integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante de "+integrante+ " está ayudandole a concentrarse para su partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante de "+integrante+" está viajando con el "+nombre+" a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante "+nombre+" está celebrando el gol de "+integrante);
    }
}
