package examen_abril;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public abstract class Votante {
    static Scanner teclado = new Scanner(System.in);
    private String poblacion;
    private String nombre;
    private boolean votado;


    public Votante(String poblacion,String nombre){
        this.poblacion=poblacion;
        this.nombre=nombre;
        votado=false;
    }

    public abstract String votar();

    public static int encuestaSatisfaccion(){

        int contador = 1;

        for (Experiencia experiencia : Experiencia.values()){
            System.out.println(contador+" - "+experiencia);
            contador++;
        }

        System.out.println("Valora tu experiencia: ");
        return teclado.nextInt();
    }

}
