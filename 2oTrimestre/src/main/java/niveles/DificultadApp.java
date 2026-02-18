package niveles;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int puntuacion = aleatorio.nextInt(5001);

        System.out.println("Introduce la dificultad");
        Dificultad dificultad = Dificultad.valueOf(teclado.next().toUpperCase());

        int resultado = puntuacion * dificultad.getMULTIPLICADOR();


        System.out.println("Punutación obtenida: "+puntuacion);
        System.out.println("Puntuación final: "+resultado);
    }
}
