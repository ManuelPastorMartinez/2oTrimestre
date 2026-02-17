package dispositivos_inteligentes;

import java.util.ArrayList;

public class DispositivoApp {

    public static void main(String[] args) {

        Televisor tele = new Televisor("LG");
        AireAcondicionado aire = new AireAcondicionado("Orona");
        ParlanteInteligente parlante = new ParlanteInteligente("Alexa");

        ArrayList<Dispositivo>listaDispositivos=new ArrayList<>();
        listaDispositivos.add(tele);
        listaDispositivos.add(aire);
        listaDispositivos.add(parlante);

        Dispositivo proyector = new Dispositivo("HP") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector ya está encendido");
                }else {
                    System.out.println("Encendiendo proyector "+nombre);
                    estado=true;
                }
            }
        };

        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando dispositivo... ");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno = new Dispositivo("Horno LG") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El "+nombre+" ya está encendido");
                }else {
                    System.out.println("Encendiendo dispositivo "+nombre);
                    estado=true;
                }
            }
        };
        horno.encender();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno);


        for (Dispositivo dispositivo:listaDispositivos){
            dispositivo.encender();
            dispositivo.encender();
            if (dispositivo instanceof Televisor){
                ((Televisor) dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }
    }
}
