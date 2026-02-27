package CopaDelRey;

abstract class MutxamelFC implements FuncionesIntegrantes{
    protected String nombre;
    private int edad;

    /**
     * @Auhor Manuel Pastor
     * @Version 1.0
     * Este es el constructor de la clase madre, que se reutiliza en todas las hijas
     * @param nombre
     * @param edad
     */
    public MutxamelFC(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    /**
     * Este método sirve para poder llamar al nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método sirve para cambiar al nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método sirve para llamar a edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Este método sirve para poder cambiar la edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
