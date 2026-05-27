package examen_abril;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Extranjero extends Votante {
    private String nie;
    private String pais;

    public Extranjero(String poblacion, String nombre, String nie, String pais){
        super(poblacion, nombre);
        this.pais=pais;
        this.nie=nie;
    }

    public Extranjero(String nie, String pais){
        super(null,null);
        this.nie=nie;
        this.pais=pais;
    }

    @Override
    public String votar() {
        return "";
    }
}
