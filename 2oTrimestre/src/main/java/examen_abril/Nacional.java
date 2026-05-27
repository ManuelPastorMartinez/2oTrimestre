package examen_abril;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Nacional extends Votante{

    private String dni;

    public Nacional(String poblacion, String nombre, String dni){
        super(poblacion,nombre);
        this.dni=dni;
    }

    public Nacional(String dni){
        super(null,null);
        this.dni=dni;
    }
    @Override
    public String votar() {
        return "";
    }
}
