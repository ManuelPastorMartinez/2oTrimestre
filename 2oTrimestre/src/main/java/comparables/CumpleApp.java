package comparables;

import java.util.*;

public class CumpleApp {

    public static void main(String[] args) {

        ArrayList<Invitado> listaInvitados = new ArrayList<>();
        listaInvitados.add(new Invitado("Jacobo",15));
        listaInvitados.add(new Invitado("David",12));
        listaInvitados.add(new Invitado("Dionisio",12));

        Collections.sort(listaInvitados, new OrdenarPorEdadNombreHora().reversed());

        System.out.println(listaInvitados);

        TreeMap<Invitado,String> mapa = new TreeMap<>(Collections.reverseOrder());
    }
}
