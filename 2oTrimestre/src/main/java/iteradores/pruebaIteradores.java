package iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class pruebaIteradores {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(9);
        numeros.add(9);

        ListIterator<Integer> it = numeros.listIterator();

        while (it.hasNext()){
           Integer numero = it.next();
            System.out.println(numero);
//            if (numero==9){
//                it.remove();
//            }
        }
        System.out.println(numeros);
        while (it.hasPrevious()){
            Integer numero = it.previous();
            System.out.println(numero);
            if (numero==3){
                it.add(10);
            }
        }
        System.out.println(numeros);
    }
}
