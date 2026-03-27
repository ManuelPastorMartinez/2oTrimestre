package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan",16));
        personas.add(new Persona("Ana",18));
        personas.add(new Persona("Pedro",25));
        personas.add(new Persona("María",17));
        personas.add(new Persona("Luis",30));

        VerificadorVoto verificador = persona -> persona.getEdad() >= 18;

        List<String> personasQuePuedenVotar = new ArrayList<>();

        for (Persona persona : personas){
            if (verificador.puedeVotar(persona)){
                personasQuePuedenVotar.add(persona.getNombre());
            }
        }

        System.out.println("Personas que pueden votar:");
        for (String nombre : personasQuePuedenVotar){
            System.out.println(nombre);
        }
    }
}
