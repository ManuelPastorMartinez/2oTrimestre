package carrefour;

public class EmpleadosApp {

    public static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge",1800);

        jorge.mostrarInfo();

        Reponedor joaquin = new Reponedor(167,"Joaquin",10,"Congelados");
        joaquin.mostrarInfo();

        Seguridad carlos = new Seguridad(142,"Carlos",8,"FaliyoCorp");

        carlos.insertarArmas("porra");

        carlos.insertarArmas("Yorch");

        carlos.mostrarInfo();
    }
}
