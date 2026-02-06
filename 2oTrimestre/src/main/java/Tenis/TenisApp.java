package Tenis;

public class TenisApp {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Nadal",1);
        Jugador jugador2 = new Jugador("Djokovic",2);

        Partido partido=new Partido(jugador1,jugador2);
        System.out.println("Partido creado entre "+jugador1.getNombre()+" y "+jugador2.getNombre());

        System.out.print("Set 1: ");
        partido.insertarSet(6,4);

        System.out.print("Set 2: ");
        partido.insertarSet(7,5);


        System.out.println("Total sets jugados: "+partido.getListaSet().size());
    }
}
