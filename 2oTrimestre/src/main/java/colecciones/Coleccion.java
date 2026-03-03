package colecciones;

import java.util.ArrayList;
import java.util.Stack;

public class Coleccion {
    public static void main(String[] args) {

        ArrayList<Integer>listaNums = new ArrayList<>();

        Stack<Integer> pila = new Stack<>();

        pila.push(2);
        pila.push(9);
        pila.push(12);

        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila.peek());
    }
}
