package PizzaExpress;

import java.util.Scanner;

public class AppPizzaExpress {
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        double precioAcumulado = 0;
        System.out.println("*** BIENVENIDO A LA PIZZERÍA POPEYE DE MUTXAMEL ***");
        Empleado manuel = new Empleado("Manuel");
        manuel.obtenerDetalles();
        Empleado joaquin = new Empleado("Joaquín");
        joaquin.obtenerDetalles();

        System.out.println("Haz tu pedido... ¿cómo te llamas?");
        String nombre = teclado.next();
        Cliente cli = new Cliente(nombre);
        Pedido pedido = new Pedido(Estado.CREANDO, cli);
        char op = 'n';
        do {
            System.out.println("¿Qué te apetece hoy, " + cli.getNombre() + "?");
            System.out.println("====CARTA====");
            for (CartaPizzas pizza : CartaPizzas.values()) {
                System.out.println(pizza + ": " + pizza.getPrecio() + "€");
            }
            System.out.println("=============");
            CartaPizzas pizza = null;
            boolean anyadir = true;
            try {
                pizza = CartaPizzas.valueOf(teclado.next().toUpperCase());

            } catch (Exception e) {
                System.out.println("Has elegido una pizza que no existe.");
                anyadir = false;
            }
            if (anyadir) pedido.añadirPizza(pizza);
            for (CartaPizzas pissa : pedido.listaPizzas) {
                precioAcumulado += pissa.getPrecio();
            }
            System.out.println("El precio actual de la cuenta es de "  + precioAcumulado + "€. ¿Quieres añadir otra pizza a  tu pedido?");
            op = teclado.next().toUpperCase().charAt(0);
        } while (op != 'N');
        pedido.estadoPedido = Estado.RECIBIDO;
        System.out.println("PEDIDO "+ pedido.estadoPedido + ". Total pedido: " + precioAcumulado + "€");
        double precioFinal = pedido.aplicarDescuento(precioAcumulado, cli);
        System.out.println("Descuento a aplicar: 20%. Total importe a pagar: " + precioFinal + "€");
        System.out.println("Pasa por caja para pagar y recoger tu pedido cuando esté LISTO. Muchas gracias " + cli.getNombre());

        pedido.estadoPedido = pedido.estadoPedido.siguiente();
        System.out.println(pedido.estadoPedido + "...");

        pedido.estadoPedido = pedido.estadoPedido.siguiente();
        System.out.println(pedido.estadoPedido + "...");

        manuel.entregarPedido(pedido);
        pedido.estadoPedido = pedido.estadoPedido.siguiente();
        System.out.println(pedido.estadoPedido + "...");
        pedido.estadoPedido = pedido.estadoPedido.siguiente();
        System.out.println(pedido.estadoPedido + "!!!");
        pedido.cliente.pagar();
        manuel.entregarPedido(pedido);
        pedido.cliente.recoger();



    }

}
