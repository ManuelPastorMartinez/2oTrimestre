package e_commerce;

import java.util.ArrayList;

public class TarjetaCredito extends MetodoPago{

    private static final String FORMATO_TARJETA="\\d{16}";

    private String nro_tarjeta;
    private String tipo;
    private ArrayList<String>tiposValidos = new ArrayList<>();

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    public void validarTarjeta(){
        if (!nro_tarjeta.matches(FORMATO_TARJETA)){
            System.out.println("Formato de tarjeta incorrecto ");
            return;
        }else {

        }
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" con tarjeta de crédito "+tipo);
    }
}
