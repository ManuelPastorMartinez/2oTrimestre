package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio7 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dame un número");
        int numero = teclado.nextInt();
        System.out.println(suma_numeros(numero));

    }
    public static int suma_numeros(int num){
        int res = 0;
        if (num<10){
            return num;
        }else {
           String num_string= String.valueOf(num);
            for (int i = 0; i < num_string.length(); i++) {
                res+= num_string.charAt(i);
                System.out.print(num_string.charAt(i));
                System.out.print("+");
            }
            System.out.print("=");
            return suma_numeros(res);
        }
    }
}
