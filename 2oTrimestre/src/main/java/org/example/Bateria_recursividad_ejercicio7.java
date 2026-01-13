package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio7 {
    static Scanner teclado = new Scanner(System.in);
    static int limite = 1;

    public static void main(String[] args) {
        System.out.println("Dame un número");
        int numero = teclado.nextInt();
        System.out.println(suma_numeros(numero));

    }
    public static int suma_numeros(int num){
        int res = 0;
        if (num<=limite){
            return num;
        }else {
            return num + suma_numeros(num-1);
        }
    }
}
