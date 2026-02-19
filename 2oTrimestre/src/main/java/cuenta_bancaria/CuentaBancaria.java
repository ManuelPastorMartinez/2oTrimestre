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
        if (ingreso>3000){
            throw new DepositoMaximoException();
        }
        if (ingreso==0){
            throw new MasDe0Exception();
        }
        saldo+=ingreso;
        System.out.println("Dinero ingresado con éxito. Saldo actual: "+saldo);
    }

    public void retirarDinero(){

        System.out.print("Introduce el importe a retirar: ");
        double retiro=teclado.nextDouble();
        teclado.nextLine();
        if (retiro>saldo){
            throw new SaldoInsuficienteException();
        }
        if (retiro>600){
            throw new LimiteDiarioException();
        }

        if (retiro==0){
            throw new MasDe0Exception();
        }
        saldo-=retiro;
        System.out.println("Dinero retirado con éxito. Saldo actual: "+saldo);
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
