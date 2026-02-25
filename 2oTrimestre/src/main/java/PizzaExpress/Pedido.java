package PizzaExpress;
import java.util.ArrayList;

public class Pedido extends PizzaExpress {

    protected Cliente cliente;
    protected ArrayList<CartaPizzas> listaPizzas;
    protected Estado estadoPedido;

    public Pedido(Estado estado, Cliente cliente) {
        listaPizzas = new ArrayList<>();
        this.estadoPedido = Estado.CREANDO;
        this.cliente = cliente;
    }

    public double aplicarDescuento(double precio, Cliente cli) {
        int descuento = cli.getDescuento();
        return precio - precio * (descuento/100.0);

    }

    public void añadirPizza(CartaPizzas pizza) {
        listaPizzas.add(pizza);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public void obtenerDetalles() {

    }
}