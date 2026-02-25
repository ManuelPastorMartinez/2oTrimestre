package PizzaExpress;

public class Cliente extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private int descuento;

    public Cliente(String nombre) {
        this.nombre = nombre;
        descuento = 20;
    }

    public void pedir() {

    }

    public void pagar() {
        System.out.println(nombre + " realizando pago en caja...");
    }

    public void recoger() {
        System.out.println("Pedido recogido por " + nombre);
    }


    @Override
    public void obtenerDetalles() {

    }

    @Override
    public void cancelar(Pedido pedido) {

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}