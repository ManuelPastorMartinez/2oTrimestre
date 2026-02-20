package Tenis;

public class TenisApp {
    public static void main(String[] args) {

        Jugador jugadorTenis1 = new Jugador("Nadal",1);
        Jugador jugadorTenis2 = new Jugador("Djokovic",2);

        Partido partido=new Partido(jugadorTenis1, jugadorTenis2);
        System.out.println("Partido creado entre "+ jugadorTenis1.getNombre()+" y "+ jugadorTenis2.getNombre());

        System.out.print("Set 1: ");
        partido.insertarSet(6,4);

        System.out.print("Set 2: ");
        partido.insertarSet(7,5);


        System.out.println("Total sets jugados: "+partido.getListaSet().size());
    }
}
