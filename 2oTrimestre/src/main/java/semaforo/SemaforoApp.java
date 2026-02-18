package semaforo;

import java.util.Scanner;

public class SemaforoApp {
    static Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime un color del semáforo");
        Semaforo color = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            System.out.println(color.name());
            color=color.siguiente();
        }
    }
}
