package tareasEmpleados;

import java.util.ArrayList;

public class EmpleadoApp {

    public static void main(String[] args) {
        Desarrollador jacobo = new Desarrollador();
        Disenyador angel = new Disenyador();
        Gerente kevin = new Gerente();

        ArrayList<Empleado>listaEmpleado = new ArrayList<>();
        listaEmpleado.add(jacobo);
        listaEmpleado.add(angel);
        listaEmpleado.add(kevin);

        for (Empleado empleado : listaEmpleado){
            empleado.realizarTarea();
        }

        asignarTarea(jacobo);

        System.out.println("====Agregando tareas===");
        Empleado jorge = new Disenyador();
        Empleado raula = new Gerente();

        asignarTarea(jorge);
        asignarTarea(raula);
    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asginando tarea al empleado...");
        empleado.realizarTarea();
    }
}
