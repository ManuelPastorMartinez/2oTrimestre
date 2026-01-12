package org.example;

import java.util.Scanner;

public class Bateria_recursividad_ejercicio1{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        System.out.println(digitos(numero));
    }
    public static int digitos(int num){

        if (num<10){
            return 1;
        }else {
            return 1+digitos(num/10);
        }

    }
}
