package examen_abril;

import lombok.Getter;
import java.util.ArrayList;

@Getter
public class Censo {

    static ArrayList<Votante> censo = new ArrayList<>();

    public static void generarCenso(){

        censo.add(new Nacional("Mutxamel", "Patricia", "12345678X"));
        censo.add(new Nacional("Mutxamel", "Carmen", "33333333C"));
        censo.add(new Nacional("Mutxamel", "Pedro", "44444444D"));
        censo.add(new Nacional("Mutxamel", "Lucía", "55555555E"));
        censo.add(new Nacional("Mutxamel", "Miguel", "66666666F"));
        censo.add(new Nacional("Mutxamel", "Sergio", "77777777G"));
        censo.add(new Nacional("Mutxamel", "Laura", "88888888H"));
        censo.add(new Nacional("Mutxamel", "Paula", "99999999I"));
        censo.add(new Nacional("Mutxamel", "Javier", "10101010J"));

        // EXTRANJEROS
        censo.add(new Extranjero("Mutxamel", "Marie", "X1111111A", "Francia"));
        censo.add(new Extranjero("Mutxamel", "Luca", "X2222222B", "Italia"));
        censo.add(new Extranjero("Mutxamel", "Hans", "X3333333C", "Alemania"));
        censo.add(new Extranjero("Mutxamel", "John", "X4444444D", "Reino Unido"));
        censo.add(new Extranjero("Mutxamel", "Sofia", "X5555555E", "Portugal"));
        censo.add(new Extranjero("Mutxamel", "Ali", "X6666666F", "Marruecos"));
        censo.add(new Extranjero("Mutxamel", "Chen", "X7777777G", "China"));
        censo.add(new Extranjero("Mutxamel", "Ivan", "X8888888H", "Rusia"));

    }

    public static void borrarVotante(Votante votante){

        censo.remove(votante);

    }

}
