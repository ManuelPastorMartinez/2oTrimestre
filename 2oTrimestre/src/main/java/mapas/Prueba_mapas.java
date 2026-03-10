package mapas;

import java.util.HashMap;
import java.util.Map;

public class Prueba_mapas {
    public static void main(String[] args) {

        HashMap<String,String> concejales = new HashMap<>();

        concejales.put("Enrique Pastor","Juventud y tiempo libre");
        concejales.put("Mónica Gil","Familias, fiestas y jardines");

        System.out.println(concejales.keySet());
        System.out.println(concejales.values());
        System.out.println(concejales.get("Enrique Pastor"));

        for (Map.Entry<String,String> mapita : concejales.entrySet()){
            System.out.println("El concejal "+mapita.getKey() + " tiene el cargo "+mapita.getValue());
        }

    }
}
