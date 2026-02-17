package e_commerce;

import java.util.Random;

public class Bizum extends MetodoPago{

    private static final String  FORMATO_TELEFONO= "\\d{9}";

    private String telefono;
    private int pin;

    public Bizum(String telefono){
        this.telefono=telefono;
        this.pin = generarPin();
        System.out.println("Pin generado: "+pin);
    }

    private int generarPin(){

        Random random = new Random();

        return random.nextInt(100000,999999);
    }



    public boolean validarBizum(int pinIntroducido){

        if (!telefono.matches(FORMATO_TELEFONO)){
            System.out.println("Formato de telefono incorrecto, por favor introduce un teléfono correcto");
            return false;
        }

        if (pinIntroducido !=pin){
            System.out.println("Pin incorrecto");
            return false;
        }
        return true;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con bizum");
    }
}
