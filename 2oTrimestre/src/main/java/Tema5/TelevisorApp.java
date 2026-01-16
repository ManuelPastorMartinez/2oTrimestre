package Tema5;

public class TelevisorApp {
    public static void main(String[] args) {
        Televisor lg=new Televisor(5,50);
        lg.subirCanal();
        lg.subirCanal();
        lg.subirCanal();
        lg.bajarVolumen();
        lg.bajarVolumen();
        lg.bajarCanal();
        lg.subirVolumen();

        lg.imprimirDatosTelevisor();

        Televisor samsung = new Televisor();
        samsung.imprimirDatosTelevisor();

    }
}
