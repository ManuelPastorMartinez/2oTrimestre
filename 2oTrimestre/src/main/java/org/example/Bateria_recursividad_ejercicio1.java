package org.example;

public class Bateria_recursividad_ejercicio1{
    public static void main(String[] args) {
        System.out.println(digitos(100));
    }
    public static int digitos(int num){

        if (num<10){
            return 1;
        }else {
            return 1+digitos(num/10);
        }

    }
}
