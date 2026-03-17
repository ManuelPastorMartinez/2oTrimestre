package reservas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ReservaApp {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void eliminar(HashSet<Reserva> listaReserva){
        System.out.println("Qué tipo de pista quieres eliminar?");
        String pista = teclado.nextLine().toLowerCase();
        Iterator<Reserva> it = listaReserva.iterator();
        while (it.hasNext()){
            Reserva reserva = it.next();
            if (reserva.getPista() instanceof Tenis && pista.equals("tenis")){
                it.remove();
            }else if (reserva.getPista() instanceof Padel && pista.equals("padel")){
                it.remove();
            }
        }
    }
}
