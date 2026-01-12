package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio5 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        System.out.print(convertir_binario(numero));
    }

    public static String convertir_binario(int num){
        if (num<=1){
            return Integer.toString(num);
        }else {
            return convertir_binario(num/2)+num%2;
        }

    }
}
