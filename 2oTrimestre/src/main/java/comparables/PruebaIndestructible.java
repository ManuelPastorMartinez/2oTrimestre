package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaIndestructible {

    static List<Integer> lista = new ArrayList<>();

    public static void main(String[] args) {
        lista.add(324);
        lista.add(2);


    }
    public static List<Integer> getLista (){
        return Collections.unmodifiableList(lista);
    }
}
