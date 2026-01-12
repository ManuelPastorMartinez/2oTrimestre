package org.example;

import java.util.Scanner;

public class Bateria_Ejercicios {
        static Scanner teclado = new Scanner(System.in);
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
    }

    public static int switch_case() {
         int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("introduce un número");
                int numero_digitos = teclado.nextInt();
                System.out.println(digitos(numero_digitos));
                break;
            case 2:
                System.out.println("Dame una base y un exponente");
                int base = teclado.nextInt();
                int exponente = teclado.nextInt();
                System.out.println(potencia(base,exponente));
                break;

            case 3:
                System.out.println("Introduce un número");
                int numero_del_reves = teclado.nextInt();
                del_reves(numero_del_reves);
                System.out.println("Ahora introduce una frase");
                String frase = teclado.nextLine();
                char[] frase_char = frase.toCharArray();
                char_del_reves(frase_char.length-1,frase_char);
                break;

            case 4:
                System.out.println("Dime un número");
                int numero_binario = teclado.nextInt();
                System.out.println(comprobar_binario(numero_binario));
                break;

            case 5:
                System.out.println("Introduce un número");
                int numero_convertir = teclado.nextInt();
                System.out.print(convertir_binario(numero_convertir));
                break;

            case 6:
                System.out.println("Dime una frase");
                String frase_alfabeticamente=teclado.nextLine();
                System.out.println(comprobar_alfabeticamente(frase_alfabeticamente));
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

    public static void del_reves(int numero){

        if (numero < 10){
            System.out.println(numero);
        }else {
            System.out.println(numero%10);
            del_reves(numero/10);
        }
    }

    public static void char_del_reves(int posicion, char[] frase){

        if (posicion>=0){
            System.out.print(frase[posicion]);
            char_del_reves(posicion-1,frase);
        }


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

    public static String convertir_binario(int num){
        if (num<=1){
            return Integer.toString(num);
        }else {
            return convertir_binario(num/2)+num%2;
        }

    }

    public static boolean comprobar_alfabeticamente(String frase){

        if (frase.length()>0){
            for (int i = 0; i < frase.length()-1; i++) {
                if (frase.charAt(i)>frase.charAt(i+1)){
                    return true;
                }
            }
            return true;
        }else {
            return false;
        }
    }

}
