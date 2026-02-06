package Banco;

public class Cuenta {

    private static int contadorIban=1;

    private String iban;
    private double saldo;
    private Cliente titular;

    public Cuenta(){
        this.iban="ESXX"+contadorIban;
        contadorIban++;
        this.saldo=0;
        this.titular=null;
    }
    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void ingresar(double cantidad){
        saldo+=cantidad;
    }

    public void retirar(double cantidad){
        saldo-=cantidad;
    }

    public boolean enRojos(){
        return saldo<0;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }



}
