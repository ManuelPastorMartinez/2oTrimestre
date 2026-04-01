package ticketmutxa;

import java.util.*;

public class Usuario implements Acciones {

    private String nombre_usuario;
    private String contraseña;

    private Map<Evento, Integer> carritoCompra = new HashMap<>();

    public Usuario(String nombre_usuario, String contraseña) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public String getNombre_usuario() { return nombre_usuario; }
    public String getContraseña() { return contraseña; }

    // -------------------------
    // AUTENTICARSE (INTERFAZ)
    // -------------------------
    @Override
    public boolean autenticarse(Set<Usuario> usuariosRegistrados) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario:");
        String user = sc.nextLine();

        System.out.println("Contraseña:");
        String pass = sc.nextLine();

        for (Usuario u : usuariosRegistrados) {
            if (u.getNombre_usuario().equals(user) &&
                    u.getContraseña().equals(pass)) {

                // Copiamos datos del usuario real
                this.nombre_usuario = u.getNombre_usuario();
                this.contraseña = u.getContraseña();
                return true;
            }
        }

        return false;
    }

    // -------------------------
    // CARRITO
    // -------------------------
    public void anyadirAlCarrito(Evento evento, int cantidad) {
        carritoCompra.put(evento, cantidad);
    }

    public int getCantidadEntradas(Evento e) {
        return carritoCompra.getOrDefault(e, 0);
    }

    public void setCarrito(Evento evento, int nuevaCantidad) {
        if (nuevaCantidad < 0 || nuevaCantidad > 7) {
            System.out.println("No puedes realizar la operación (cantidad entradas=min 0 y máx 7).");
            return;
        }
        carritoCompra.put(evento, nuevaCantidad);
    }

    public void verCarrito() {
        for (Evento e : carritoCompra.keySet()) {
            int cantidad = carritoCompra.get(e);
            double total = cantidad * e.getPrecio();
            System.out.println("Carrito: " + cantidad + " entradas para " + e.getNombre() +
                    ". Importe total: " + total + "€. Gastos de gestión: por calcular.");
        }
    }

    // -------------------------
    // PAGO
    // -------------------------
    public void pagar() {
        Scanner sc = new Scanner(System.in);
        MetodoPago metodo = null;

        while (metodo == null) {
            System.out.println("Elige un método de pago:");
            System.out.println("PAYPAL (gastos de gestión asociados: 0.5€).");
            System.out.println("BIZUM (gastos de gestión asociados: 1.0€).");
            System.out.println("APPLEPAY (gastos de gestión asociados: 1.5€).");
            System.out.print("Opción: ");

            String opcion = sc.nextLine().toUpperCase();

            try {
                metodo = MetodoPago.valueOf(opcion);
            } catch (Exception e) {
                System.out.println("Método de pago no válido. Vuelve a intentarlo.");
            }
        }

        System.out.println("Realizando pago con " + metodo +
                " (+ " + metodo.getGasto() + " € de gastos de gestión)");
        System.out.println("MUCHAS GRACIAS. DISFRUTA DEL EVENTO!");
    }
}
