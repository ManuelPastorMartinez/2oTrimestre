package Programas;

public class Empleado {

    private static final String CADENA_ID="EP";
    private static int contadorCantidadEmpleados=0;

    private String id;
    private String nombre;
    private static int cantidadEmpleados =0;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre,String cargo){
        this.nombre=nombre;
        this.cargo=cargo;
        id=generarId();

    }

    private String generarId(){
        return CADENA_ID+cantidadEmpleados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setCantidadEmpleados(){
        cantidadEmpleados=++contadorCantidadEmpleados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


}
