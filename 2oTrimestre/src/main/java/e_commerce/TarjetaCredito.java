package e_commerce;

public class TarjetaCredito extends MetodoPago{

    private static final String FORMATO_TARJETA="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";

    private String nro_tarjeta;
    private String tipo;
    @Override
    public void procesarPago(double importe) {

    }
}
