package tareasEmpleados;

public class Gerente extends Empleado {

    @Override
    public void realizarTarea(){
        System.out.println("Supervisando el proyecto y organizando reuniones");
    }
}
