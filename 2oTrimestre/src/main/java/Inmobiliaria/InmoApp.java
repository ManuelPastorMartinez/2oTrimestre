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



        pisito.getListaHabitaciones().get(2).agregarElectrodomestico("aspiradora",34.6);
        pisito.getListaHabitaciones().get(0).agregarElectrodomestico("rumba",53.5);
        pisito.getListaHabitaciones().get(2).agregarElectrodomestico("freidora",43.6);

        pisito.getHabitacionMayorConsumo();
    }
}
