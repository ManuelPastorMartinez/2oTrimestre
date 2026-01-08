package org.example;

import java.util.Scanner;

public class Bateria_Ejercicios {
        static Scanner teclado;
    public static void main(String[] args) {
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println(" 1 - Dígitos");
        System.out.println(" 2 - Potencias");
        System.out.println(" 3 - Del Revés");
        System.out.println(" 4 - Binario");
        System.out.println(" 5 - A binario");
        System.out.println(" 6 - Orden alfabético");
        System.out.println(" 7 - Mostrar suma");
        switch_case();

        System.out.println(digitos(10));

        System.out.println(potencia(5,5));
    }

    public static int switch_case() {
         int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                return digitos(10);
            case 2:

                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            default:
                return 0;
        }

        return opcion;
    }
    public static int digitos(int num){
        if (num<10){
            return 1;
        }else {
            return 1+digitos(num/10);
        }
    }

    public static int potencia(int base, int exponente ){

        if (exponente==1){
            return base;
        }else{
            return base*potencia(base,exponente-1);

        }
    }

}
