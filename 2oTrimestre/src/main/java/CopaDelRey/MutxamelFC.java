package CopaDelRey;

abstract class MutxamelFC implements FuncionesIntegrantes{
    protected String nombre;
    private int edad;

    public MutxamelFC(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
        /**
         * @Auhor Manuel Pastor
         * @Version 1.0
         * Este es el constructor de la clase madre, que se reutiliza en todas las hijas
         */
    }
    public String getNombre() {
        return nombre;
        /**
         * Este método sirve para poder llamar al nombre
         */
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        /**
         * Este método sirve para cambiar al nombre
         */
    }

    public int getEdad() {
        return edad;
        /**
         * Este método sirve para llamar a edad
         */
    }

    public void setEdad(int edad) {
        this.edad = edad;

        /**
         * Este método sirve para poder cambiar la edad
         */
    }
}
