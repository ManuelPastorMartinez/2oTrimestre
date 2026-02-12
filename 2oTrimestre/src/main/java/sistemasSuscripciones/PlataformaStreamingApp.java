package sistemasSuscripciones;

import java.util.ArrayList;

public class PlataformaStreamingApp {

    public static void main(String[] args) {

        ArrayList<Suscripcion>listaSuscripciones=new ArrayList<>();

        PlanGratis gratis = new PlanGratis("Gratis",0);
        listaSuscripciones.add(gratis);

        PlanBasico basico = new PlanBasico("Básico",9.99);
        listaSuscripciones.add(basico);

        PlanPremium premium = new PlanPremium("Premium",14.99);
        listaSuscripciones.add(premium);

        PlanFamiliar familiar = new PlanFamiliar("Familiar",19.99);
        listaSuscripciones.add(familiar);

        for (Suscripcion sub : listaSuscripciones){
            sub.mostrarInfo();
            sub.obtenerBeneficios();
        }

    }
}
