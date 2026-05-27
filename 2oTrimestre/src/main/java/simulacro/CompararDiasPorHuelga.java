package simulacro;

import java.util.Comparator;

public class CompararDiasPorHuelga implements Comparator<Docente> {

    @Override
    public int compare(Docente o1, Docente o2){
        return o1.getDiasHuelga().compareTo(o2.getDiasHuelga());
    }
}
