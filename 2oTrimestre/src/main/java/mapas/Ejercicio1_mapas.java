package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1_mapas {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        HashMap<String,Integer> mapita = new HashMap<>();
        for (String palabra : frase.split(" ")){

            if (mapita.containsKey(palabra)){
                mapita.put(palabra,mapita.get(palabra)+1);
            }
            else {
                mapita.put(palabra, 1);
            }

            mapita.put(palabra,mapita.getOrDefault(palabra,0)+1);
        }

        for (Map.Entry<String,Integer> mapa:  mapita.entrySet()){

            System.out.println(mapa.getKey() + " : "+ mapa.getValue() + " veces");
        }
    }
}
