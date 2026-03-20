package diccionario;

import java.util.Scanner;

public class AppDiccionario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Diccionario dic = new Diccionario();

        // Cargar palabras
        dic.nuevoPar();
        dic.nuevoPar();
        dic.nuevoPar();
        dic.nuevoPar();
        dic.nuevoPar();

        System.out.println("=== CUESTIONARIO ===");
        System.out.println("Escribe 'fin' para salir");

        while (true) {

            String palabra = teclado.next();

            System.out.println("Traduce: " + palabra);
            System.out.println("Pista: empieza por '" + dic.primeraLetraTraduccion(palabra) + "'");

            String respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("fin")) {
                System.out.println("Programa terminado.");
                break;
            }

            if (respuesta.equalsIgnoreCase(dic.getTraduccion(palabra))) {
                System.out.println("¡CORRECTO!");
            } else {
                System.out.println("¡NO! La respuesta correcta es: " + dic.getTraduccion(palabra));
            }
        }

        teclado.close();
    }
}