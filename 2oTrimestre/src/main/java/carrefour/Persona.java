package carrefour;

public abstract class Persona {

    private int codigo_emp;
    private String nombre;
    private double sueldo;

    public Persona(int codigo_emp,String nombre,double sueldo){
        this.codigo_emp=codigo_emp;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public int getCodigo_emp() {
        return codigo_emp;
    }

    public void setCodigo_emp(int codigo_emp) {
        this.codigo_emp = codigo_emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarInfo(){
        System.out.println("Persona con código " + codigo_emp +" y nombre "+nombre+" gana "+sueldo+"€");
    }

    public abstract void trabajar();


    @Override
    public String toString() {
        return "Persona{" +
                "codigo_emp=" + codigo_emp +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
