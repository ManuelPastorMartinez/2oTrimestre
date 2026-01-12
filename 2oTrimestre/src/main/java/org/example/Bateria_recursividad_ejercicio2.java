package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una base y un exponente");
        int base = teclado.nextInt();
        int exponente = teclado.nextInt();
        System.out.println(potencia(base,exponente));
    }

    public static int potencia(int base, int exponente ){

        if (exponente==1){
            return base;
        }else{
            return base*potencia(base,exponente-1);
        }
    }
}
