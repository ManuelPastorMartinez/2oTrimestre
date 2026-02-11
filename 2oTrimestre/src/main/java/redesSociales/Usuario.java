package redesSociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String nombre_usuario;
    private int seguidores;

    public Usuario(String nombre,int edad,String nombre_usuario,int seguidores){
        this.nombre=nombre;
        this.edad=edad;
        this.nombre_usuario=nombre_usuario;
        this.seguidores=seguidores;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Nombre de usuario: "+nombre_usuario);
        System.out.println("Seguidores: "+seguidores);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}
