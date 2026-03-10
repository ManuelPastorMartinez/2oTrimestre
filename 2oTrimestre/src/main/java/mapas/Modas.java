package mapas;

import java.util.HashMap;
import java.util.Map;

public class Modas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int numero = in.nextInt();
        in.nextLine();
        if (numero==0)
        return false;
        else {
            HashMap<Integer,Integer> mapa = new HashMap<>();
            // CÓDIGO PRINCIPAL AQUÍ
            for (int i=0; i<numero;i++){
                Integer numeros = in.nextInt();
                if (mapa.containsKey(numeros)){
                    mapa.put(numeros,mapa.get(numeros)+1);
                }else {
                    mapa.put(numeros,1);
                }
            }

            for (Map.Entry<Integer,Integer> numeroGrande : mapa.entrySet()){
                HashMap<Integer,Integer> aux = new HashMap<>();
            }
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
