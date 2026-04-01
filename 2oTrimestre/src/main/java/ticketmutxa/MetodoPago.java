package ticketmutxa;

public enum MetodoPago {
    PAYPAL(0.5),
    BIZUM(1.0),
    APPLEPAY(1.5);

    private double gasto;

    MetodoPago(double gasto) {
        this.gasto = gasto;
    }

    public double getGasto() {
        return gasto;
    }
}
