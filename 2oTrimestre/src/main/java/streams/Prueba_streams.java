package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prueba_streams {

    public static void main(String[] args) {

        Stream<String> pruebaStream = Stream.of("Ibai","IlloJuan","Falete","ParadoxKaiser")
            .filter(persona -> persona.startsWith("I"))
//            .filter(persona -> persona.contains("o"))
            .map(String::toUpperCase);
        List<String> lista = pruebaStream.toList();
        System.out.println(lista);

        List<String> lista2 = Arrays.asList("Jijona","Yema","Piedra","Duro");


        System.out.println(lista2.stream().filter(turron -> turron.contains("o")).toList());
    }
}
