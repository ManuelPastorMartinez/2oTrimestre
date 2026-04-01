package ticketmutxa;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Festival extends Evento {

    private Set<String> listaArtistas = new HashSet<>();

    public Festival(String nombre, LocalDate fecha, double precio) {
        super(nombre, fecha, precio);
    }

    public Set<String> getListaArtistas() {
        return listaArtistas;
    }
}
