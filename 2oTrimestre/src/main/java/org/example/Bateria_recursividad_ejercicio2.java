package org.example;

public class Bateria_recursividad_ejercicio2 {
    public static void main(String[] args) {

        System.out.println(potencia(5,5));
    }

    public static int potencia(int base, int exponente ){

        if (exponente==1){
            return base;
        }else{
            return base*potencia(base,exponente-1);

        }
    }
}
