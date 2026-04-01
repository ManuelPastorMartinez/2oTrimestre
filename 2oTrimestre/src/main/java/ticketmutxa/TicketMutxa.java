package ticketmutxa;

import java.time.LocalDate;
import java.util.*;

public class TicketMutxa {

    private static Set<Usuario> usuariosRegistrados = new HashSet<>();
    private static Set<Evento> listaEventos = new HashSet<>();

    private static List<Evento> getEventosOrdenados() {
        List<Evento> ordenados = new ArrayList<>(listaEventos);
        Collections.sort(ordenados, new Comparator<Evento>() {
            @Override
            public int compare(Evento e1, Evento e2) {
                return e1.getFecha().compareTo(e2.getFecha());
            }
        });
        return ordenados;
    }

    public static void insertarEvento(String nombre, LocalDate fecha, double precio, String tipo) {
        Scanner sc = new Scanner(System.in);
        Evento nuevo = null;

        if (tipo.equalsIgnoreCase("concierto")) {
            System.out.println("Creando concierto ...");
            System.out.println("Artista:");
            String artista = sc.nextLine();
            nuevo = new Concierto(nombre, fecha, precio, artista);

        } else if (tipo.equalsIgnoreCase("festival")) {
            System.out.println("Creando festival ...");
            Festival f = new Festival(nombre, fecha, precio);
            System.out.println("Introduce los artistas (o 'salir'):");
            while (true) {
                String art = sc.nextLine();
                if (art.equalsIgnoreCase("salir")) break;
                f.getListaArtistas().add(art);
            }
            nuevo = f;

        } else {
            System.out.println("No existe el tipo de evento.");
            return;
        }

        listaEventos.add(nuevo);
    }

    public static void generarUsuarios(int cantidad) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();

        while (usuariosRegistrados.size() < cantidad) {
            String user = "";
            String pass = "";
            for (int i = 0; i < 8; i++) {
                user += chars.charAt(r.nextInt(chars.length()));
                pass += chars.charAt(r.nextInt(chars.length()));
            }
            Usuario u = new Usuario(user, pass);
            if (usuariosRegistrados.add(u)) {
                System.out.println("Chivato de usuarios generados -- " + user + " " + pass);
            }
        }
    }

    public static Set<Usuario> getUsuariosRegistrados() {
        return Collections.unmodifiableSet(usuariosRegistrados);
    }

    public static void verEventos() {
        List<Evento> ordenados = getEventosOrdenados();
        for (int i = 0; i < ordenados.size(); i++) {
            Evento e = ordenados.get(i);
            System.out.println("[" + (i + 1) + "]. " + e.getNombre() + " " + e.getFecha());
        }
    }

    public static Evento getEvento(int pos) {
        List<Evento> ordenados = getEventosOrdenados();
        if (pos <= 0 || pos > ordenados.size()) return null;
        return ordenados.get(pos - 1);
    }
}
