package ticketmutxa;

import java.time.LocalDate;
import java.util.*;

public class AppCompraEntradas {

    public static void main(String[] args) {

        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16), 20, "festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21), 40, "concierto");

        TicketMutxa.generarUsuarios(4);

        System.out.println("BIENVENIDO A TICKETMUTXA ****");

        Usuario comprador = new Usuario("", "");

        while (!comprador.autenticarse(TicketMutxa.getUsuariosRegistrados())) {
            System.out.println("Credenciales no válidas. Inténtalo de nuevo ...");
        }

        System.out.println("BIENVENIDO!");
        System.out.println("Hola " + comprador.getNombre_usuario() + ". Elige un evento:");
        TicketMutxa.verEventos();

        Scanner sc = new Scanner(System.in);
        Evento evento = null;

        while (evento == null) {
            try {
                int op = Integer.parseInt(sc.nextLine());
                evento = TicketMutxa.getEvento(op);
                if (evento == null) System.out.println("ERROR. Elige una opción correcta.");
            } catch (Exception e) {
                System.out.println("ERROR. Introduce un número válido.");
            }
        }

        System.out.println("Estás comprando entradas para " + evento.getNombre());
        System.out.println("Espera tu turno ...");

        Queue<Usuario> cola = new LinkedList<>();

        for (Usuario u : TicketMutxa.getUsuariosRegistrados()) {
            if (!u.equals(comprador)) cola.add(u);
        }
        cola.add(comprador);

        int pos = cola.size();

        while (!cola.isEmpty()) {
            Usuario actual = cola.poll();

            if (!actual.equals(comprador)) {
                System.out.println("-- Estás en la posición " + (pos - 1));
            } else {
                System.out.println("-- Estás en la posición 1");
                System.out.println("¡Es tu turno!");
            }

            pos--;

            try { Thread.sleep(3000); } catch (Exception ignored) {}
        }

        int cantidad = -1;

        while (cantidad < 0 || cantidad > 7) {
            System.out.println("¿Cuántas entradas quieres? (máximo 7):");
            try {
                cantidad = Integer.parseInt(sc.nextLine());
                if (cantidad > 7) System.out.println("No puedes añadir más de 7 entradas ...");
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
            }
        }

        comprador.anyadirAlCarrito(evento, cantidad);
        comprador.verCarrito();

        boolean salir = false;

        while (!salir) {
            System.out.println("[1]. Añadir más entradas.");
            System.out.println("[2]. Eliminar entradas.");
            System.out.println("[3]. Pagar y finalizar.");

            int op = -1;

            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opción no válida.");
            }

            switch (op) {
                case 1:
                    System.out.println("¿cuántas?");
                    int extra = Integer.parseInt(sc.nextLine());
                    comprador.setCarrito(evento, comprador.getCantidadEntradas(evento) + extra);
                    comprador.verCarrito();
                    break;

                case 2:
                    System.out.println("¿cuántas?");
                    int quitar = Integer.parseInt(sc.nextLine());
                    comprador.setCarrito(evento, comprador.getCantidadEntradas(evento) - quitar);
                    comprador.verCarrito();
                    break;

                case 3:
                    comprador.verCarrito();
                    comprador.pagar();
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
