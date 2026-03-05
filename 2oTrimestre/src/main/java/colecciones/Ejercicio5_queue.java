package colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5_queue {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime una palabra o una frase para comprobar si es palindromo");
        String palabra = teclado.nextLine().toLowerCase().replace(" ","");
        Deque<Character> caracteres = new LinkedList<>();
        for (int i = 0; i <palabra.length(); i++) {
            caracteres.offer(palabra.charAt(i));
        }
        System.out.println(caracteres);
        for (int i = 0; i < caracteres.size(); i++) {
            if (caracteres.peekFirst()==caracteres.peekLast()){
                caracteres.pollFirst();
                caracteres.pollLast();
                System.out.println(caracteres);
            }else {
                System.out.println("No es un palindromo");
                return;
            }
        }

        System.out.println("Es palindromo");
    }
}
