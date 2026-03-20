package diccionario;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    static Scanner teclado = new Scanner(System.in);
    private HashMap<String, String> diccionario;
    private Random random;

    // Constructor
    public Diccionario() {
        diccionario = new HashMap<>();
        random = new Random();
    }

    // Añadir nueva pareja
    public void nuevoPar() {
        System.out.println("Introduce una palabra");
        String esp = teclado.next();

        System.out.println("Introduce otra palabra");
        String eng = teclado.next();
        diccionario.put(esp, eng);
    }

    // Traducir palabra
    public String traduce() {
        String esp = teclado.next();
        return diccionario.getOrDefault(esp, "No encontrada");
    }

    // Obtener palabra aleatoria en español
    public String palabraAleatoria() {
        Object[] claves = diccionario.keySet().toArray();
        return (String) claves[random.nextInt(claves.length)];
    }

    // Obtener primera letra de la traducción
    public char primeraLetraTraduccion(String esp) {
        if (diccionario.containsKey(esp)) {
            return diccionario.get(esp).charAt(0);
        }
        return '?';
    }

    // Obtener traducción correcta (para comprobar)
    public String getTraduccion(String esp) {
        return diccionario.get(esp);
    }
}