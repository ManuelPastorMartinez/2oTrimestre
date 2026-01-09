package org.example;

public class Bateria_recursividad_ejercicio4 {
    public static void main(String[] args) {

        System.out.println(comprobar_binario(10011001));
    }

    public static boolean comprobar_binario(int numero) {

        if (numero >= 10) {
            if (numero % 10 == 0 || numero % 10 == 1) {
                return comprobar_binario(numero/10);
            } else {
                return false;
            }
        }else if (numero==0 || numero==1){
            return true;
        }else{
            return false;
        }

    }
}
