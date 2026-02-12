package sistemasSuscripciones;

public class PlanFamiliar extends Suscripcion{

    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición");
    }
}
