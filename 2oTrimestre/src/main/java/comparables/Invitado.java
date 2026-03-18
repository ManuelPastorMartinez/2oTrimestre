package comparables;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@ToString
public class Invitado implements Comparable<Invitado> {
    private LocalTime hora;
    private Integer edad;
    private String nombre;

    public Invitado(String nombre, int edad) {
        this.hora = LocalTime.now();
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Invitado invitado) {

        int comparar = edad.compareTo(invitado.edad);

        if (comparar !=0){
            return comparar;
        }

        comparar = nombre.compareTo(invitado.nombre);

        if (comparar !=0){
            return comparar;
        }

        return hora.compareTo(invitado.hora);
    }
}
