package org.example;

public class Bateria_recursividad_ejercicio5 {
    public static void main(String[] args) {
        System.out.print(convertir_binario(128));
    }

    public static String convertir_binario(int num){
        if (num<=1){
            return Integer.toString(num);
        }else {
            return convertir_binario(num/2)+num%2;
        }

    }
}
