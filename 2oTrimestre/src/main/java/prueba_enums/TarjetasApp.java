package prueba_enums;

import java.util.Scanner;

public class TarjetasApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tarjetas tarjeta_tipo = Tarjetas.VISA;

        System.out.println(tarjeta_tipo.ordinal());
        System.out.println(tarjeta_tipo.name());

        System.out.println("Tipos de tarjetas: ");
        for (Tarjetas tarjeta: Tarjetas.values()){
            System.out.println(tarjeta);
        }

        System.out.println("Introduce el tipo: ");
        Tarjetas tipo = Tarjetas.valueOf(teclado.next().toUpperCase());

        System.out.println("La tarjeta de tipo "+tipo+" tiene una comisión de "+tipo.getCOMISION()+ "€");


    }
}
