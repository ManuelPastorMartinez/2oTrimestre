package Programas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Invitado {
    static Scanner teclado =new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre,String profesion,int temporada){
        this.nombre=nombre;
        this.profesion=profesion;
        this.temporada=temporada;
        setFecha_visita();
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {
        System.out.println("Introduce el año de visita");
        int anyo_visita=teclado.nextInt();
        System.out.println("Introduce el mes de la visita");
        int mes_visita=teclado.nextInt();
        System.out.println("Introduce el dia de la visita");
        int dia_visita=teclado.nextInt();
        fecha_visita=LocalDate.of(anyo_visita,mes_visita,dia_visita);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
