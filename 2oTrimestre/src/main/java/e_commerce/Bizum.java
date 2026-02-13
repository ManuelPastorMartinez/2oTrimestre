package e_commerce;

import java.util.Random;

public class Bizum extends MetodoPago{

    private static final String  FORMATO_TELEFONO= "\\d{9}";

    private String telefono;
    private int pin;

    Random random = new Random(7);



    public void validarBizum(){

        if (!telefono.matches(FORMATO_TELEFONO)){
            System.out.println("Formato de telefono incorrecto, por favor introduce un teléfono correcto");
        }

    }
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con bizum");
    }
}
