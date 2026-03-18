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

        TreeMap<Invitado,String> mapa = new TreeMap<>();


        mapa.put(new Invitado("Jacobo",15),"Raqueta");
        mapa.put(new Invitado("David",12),"500€");
        mapa.put(new Invitado("Joaquin",12),"Charla con Milei");

        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapa.entrySet());

        listaMapa.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));

        for (Map.Entry<Invitado,String> mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre()+ " "+ mapita.getValue());
        }
    }
}
