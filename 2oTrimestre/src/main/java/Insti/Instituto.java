package Insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter @Setter @ToString

public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante>listaEstudiantes;
    private ArrayList<Curso>listaCurso;

    private void setNombre(String nombre){
        this.nombre=Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }

    public void agregarCurso(Curso curso){

        for ( Curso curso1: listaCurso){
            if (listaCurso.contains(curso1)){
                System.out.println("Ya hay un curso igual");
                return;
            }
        }
        listaCurso.add(curso);
        System.out.println("El curso "+nombre+" ha sido creado en "+getNombre());
    }

    public void agregarEstudiante(Estudiante estudiante){

        listaEstudiantes.add(estudiante);
    }

    public ArrayList<Curso>getListaCursos(){
        return this.listaCurso;
    }


}
