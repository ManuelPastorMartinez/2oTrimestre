package e_commerce;

public class PayPal extends MetodoPago{

    private static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@+[A-Za-z0-9+_.-]+.com$";

    private String correo;
    private double saldo=23;

    public PayPal(String correo,double saldo){
        this.correo=correo;
        this.saldo=saldo;
    }

    public void validarPayPal(){
        if (!correo.matches(FORMATO_CORREO)){
            System.out.println("Formato de correo incorrecto, introduce un correo electrónico válido");
            return;
        }

        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
