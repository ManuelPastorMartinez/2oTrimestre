package colecciones;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce el primer número: ");
        int num1=teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2=teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3=teclado.nextInt();

        pila.push(num1);
        pila.push(num2);
        pila.push(num3);

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }


    }
}
