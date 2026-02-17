package e_commerce;

public class PayPal extends MetodoPago{

    private static final String FORMATO_CUENTA = "^[A-Za-z0-9+_.-]+@gmail.com";

    private String cuenta;
    private double saldo=23;

    public PayPal(String cuenta){
        this.cuenta = cuenta;
    }

    public boolean validarPayPal(double importe){
        if (!cuenta.matches(FORMATO_CUENTA)){
            System.out.println("Formato de correo incorrecto, introduce un correo electrónico válido");
            return false;
        }

        if (saldo<importe){
            System.out.println("No tienes suficiente crédito para realizar este trámite");
            return false;
        }

        return true;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con PayPal");
    }
}
