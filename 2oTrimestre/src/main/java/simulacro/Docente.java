package simulacro;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Docente implements AccionesHuelga {
    private String dni;
    private Integer diasHuelga;
    private EstadoDocente estado;

    public Docente(String dni,Integer diasHuelga,EstadoDocente estado){
        this.dni=dni;
        this.diasHuelga=diasHuelga;
        this.estado=estado;
    }

    @Override
    public void secundar() {
        setDiasHuelga(1);
        setEstado(EstadoDocente.EN_HUELGA);
    }

    @Override
    public void asignarServiciosMinimos() {
        setEstado(EstadoDocente.SERVICIOS_MINIMOS);
    }

    @Override
    public void finalizar() {
        System.out.println("Docente "+this+" finalizando huelga...");
        setEstado(EstadoDocente.ACTIVO);

    }
}
