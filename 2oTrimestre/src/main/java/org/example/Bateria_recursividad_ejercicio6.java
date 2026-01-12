package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio6 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime una frase");
        String frase=teclado.nextLine();
        System.out.println(comprobar_alfabeticamente(frase));
    }
    public static boolean comprobar_alfabeticamente(String frase){

        if (frase.length()>0){
            for (int i = 0; i < frase.length()-1; i++) {
                if (frase.charAt(i)>frase.charAt(i+1)){
                    return true;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
