package e_commerce;

import java.util.ArrayList;

public class TarjetaCredito extends MetodoPago{

    private static final String FORMATO_TARJETA="\\d{16}";

    private String nro_tarjeta;
    private String tipo;
    private static String tipoValido[] = {"VISA","MASTERCARD","MAESTRO"};

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    public boolean validarTarjeta(){
        boolean validar=false;
        if (!nro_tarjeta.matches(FORMATO_TARJETA)){
            validar=false;
        }else {
            for (String tipo : tipoValido){
                if (getTipo().toUpperCase().equals(tipo)){
                    validar=true;
                    break;
                }
            }
        }


        return validar;

    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" con tarjeta de crédito "+tipo);
    }
}
