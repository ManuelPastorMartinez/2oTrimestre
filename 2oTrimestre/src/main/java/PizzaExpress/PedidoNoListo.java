package PizzaExpress;

public class PedidoNoListo extends RuntimeException {
    public PedidoNoListo(String message) {
        super(message);
    }
}