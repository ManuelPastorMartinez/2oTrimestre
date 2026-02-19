package cuenta_bancaria;

import java.util.Scanner;

public class CuentaBancariaApp {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(3000);
        menu(cuenta);
    }
    public static void imprimirMenu(){
        System.out.println("=== Cajero Automático ===");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
    }


    public static void menu(CuentaBancaria cuenta){
        imprimirMenu();
        switch (opcion()){
            case '1':
                cuenta.consultarSaldo();
                menu(cuenta);
                break;
            case '2':
                cuenta.ingresarDinero();
                menu(cuenta);
                break;
            case '3':
                cuenta.retirarDinero();
                menu(cuenta);
                break;
            case 'X':
                return;
            default:
                System.out.println("Elige una opción válida");
        }

    }

    public static char opcion(){
        System.out.print("Introduce una opción: ");
        return teclado.next().toUpperCase().charAt(0);

    }
}
