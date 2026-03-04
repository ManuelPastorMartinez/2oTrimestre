package colecciones;

import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        Stack<String>letras = new Stack<>();

        letras.push("a");
        letras.push("b");
        letras.push("c");
        letras.push("d");
        letras.push("e");

        System.out.println(letras.isEmpty());
        System.out.println(letras.size());
        System.out.println(letras.peek());
        for (int i = 0; i < letras.size(); i++) {
            System.out.println(letras.pop());
        }

    }
}
