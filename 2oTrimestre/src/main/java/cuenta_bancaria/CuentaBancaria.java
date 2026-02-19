package cuenta_bancaria;

import java.util.Scanner;

public class CuentaBancaria {
    static Scanner teclado = new Scanner(System.in);
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(){

        System.out.print("Introduce el importe a ingresar: ");
        double ingreso=teclado.nextDouble();
        saldo+=ingreso;
    }

    public void retirarDinero(){

        System.out.print("Introduce el importe a retirar: ");
        double retiro=teclado.nextDouble();
        saldo-=retiro;
    }

    public void consultarSaldo(){
        System.out.println("Saldo disponible: "+saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
