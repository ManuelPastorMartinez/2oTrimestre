package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio3 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        del_reves(numero);
        System.out.println("Ahora introduce una frase");
        String frase = teclado.nextLine();
        char[] frase_char = frase.toCharArray();
        char_del_reves(frase_char.length-1,frase_char);
    }

    public static void del_reves(int numero){

        if (numero < 10){
            System.out.println(numero);
        }else {
            System.out.println(numero%10);
            del_reves(numero/10);
        }
    }

    public static void char_del_reves(int posicion, char[] frase){

        if (posicion>=0){
            System.out.print(frase[posicion]);
            char_del_reves(posicion-1,frase);
        }


    }
}
