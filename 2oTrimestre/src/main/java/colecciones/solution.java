package colecciones;

import java.util.Stack;

// Asume fichero llamado solution.java
public class Solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            Stack<Character>pila = new Stack<>();
            String expresion = in.nextLine();
            for (int i = 0; i < expresion.length(); i++){

            }
            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution
