package Inmobiliaria;

public class InmoApp {

    public static void main(String[] args) {

        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("cocina",20);
        pisito.crearHabitacion("baño",7);
        pisito.crearHabitacion("dormitorio", 21);
        pisito.crearHabitacion("dormitorio", 12);


        pisito.mostrarHabitacion();
        System.out.println("La habitación más grande es "+pisito.getHabitacionMasGrande().getNombre());

        pisito.eliminarHabitacion("baño");
        pisito.mostrarHabitacion();
        pisito.eliminarHabitacion("baño");

    }
}
