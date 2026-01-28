package Imserso;

public class ImsersoApp {
    public static void main(String[] args) {
        Abuelo manolo = new Abuelo("manolo",89);
        Abuelo pepe = new Abuelo("pepe",67);
        Abuelo marisa = new Abuelo("marisa",75);
        Abuelo euge = new Abuelo("euge",68);

        AutobusImserso alsa = new AutobusImserso("1234KKK","CANARIAS");

        alsa.insertarAbuelo(manolo);
        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa);
        alsa.insertarAbuelo(euge);

        System.out.println(alsa.getListaAbuelos());

        alsa.borrarAbuelo(euge);
        System.out.println(alsa.getListaAbuelos());

        alsa.mostarAbuelos();

        alsa.mostrarMayores(70);
    }


}
