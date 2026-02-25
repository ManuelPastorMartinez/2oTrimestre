package PizzaExpress;

public class Empleado extends PizzaExpress implements AccionesPedido{

    static int contador = 1;

    private String id_empleado;
    private String nombre;

    public Empleado(String nombre) {
        setId_empleado();
        this.nombre = nombre;
    }

    public void siguienteEstado(Pedido pedido) {

    }

    public void entregarPedido(Pedido pedido) {
        try {
            if (pedido.estadoPedido != Estado.LISTO) {
                throw new PedidoNoListo("INTENTO DE ENTREGA. El pedido todavía no está listo para entregarse. Estado: " + pedido.estadoPedido );
            }
            else {
                System.out.println("Entregando pedido a " + pedido.getCliente().getNombre());
            }
        } catch (PedidoNoListo e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    public void obtenerDetalles() {
        System.out.println("Empleado " + id_empleado + ": " + nombre);
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado() {
        id_empleado = "EMP" + contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado='" + id_empleado + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}