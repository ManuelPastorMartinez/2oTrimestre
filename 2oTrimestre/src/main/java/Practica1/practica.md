

# Práctica 1. Práctica del formiguero y la rebelión
## ÍNDICE
1. [Intro](https://github.com/ManuelPastorMartinez/2oTrimestre/blob/main/2oTrimestre/src/main/java/Practica1/practica.md#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
- Diagrama de clases UML
- Código de UML
- Contenido de clases (.java)
4. [Programa principal (InmoApp)](#3-programa-principal)
5. [pruebas](#4-pruebas)
6. [Entrega](#5-Entrega)

### 1. Intro
> La práctica consiste en una app ...
### 2. Estructura de clases

#### Diagrama de clases UML
![](img/biblio.png)

#### Código de PlantUML

````
@startuml

package Biblio {

 class Editorial {
        - editorial : String
        - Pais : String
        - listaLibros : ArrayList<Libro>
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
        + toString() : String
    }

    class Estudiante {
        - CORREO_FORMAT : String <<static>>
        - contador_estudiantes : int <<static>>
        - nombre : String
        - curso : String
        - nia : int
        - email : String
        - listaLibros : ArrayList<Libro>


        + obtenerTotalEstudiantes() : int <<static>>
        + validarCorreo(correo : String) : boolean <<static>>
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
        + toString() : String
    }



    class Libro {
        - DEF_LIBRO_PRESTADO : int <<static>>
        - DEF_LIBRO_SIN_PRESTAR : int <<static>>
        - contadorLibrosDisponibles : int <<static>>
        - contadorCantidadLibros : int <<static>>
        - CADENA_ID : String <<static>>
        - id : String
        - titulo : String
        - autor : String
        - disponible : boolean
        - cantidadLibros : int <<static>>
        - librosDisponibles : int <<static>>
        - estudiantePrestado : Estudiante
        - editorial : Editorial
        - listaLibros : ArrayList<Libro>


        - generarId() : String
        + estaDisponible() : boolean
        + prestar(estudiante : Estudiante) : Prestamo
        + devolver() : void
        + toString() : String
    }

    class Prestamo {
        - libro : Libro
        - estudiante : Estudiante
        - fecha : LocalDateTime

        + toString() : String
    }

    class Editorial {
        - editorial : String
        - Pais : String
        - listaLibros : ArrayList<Libro>

        + Editorial(editorial : String, pais : String)
        + Editorial()
        + insertarLibro(libro : Libro) : void
        + borrarLibro(libro : Libro) : void
        + toString() : String
    }
}

Estudiante "1" -- "*" Libro: >
Libro "*" -- "1" Editorial: pertenece a >
Prestamo "1" o--> "1" Libro
Prestamo "1" o--> "1" Estudiante

@enduml
````
#### Contenido de las clases (.java)
- Clase **java.java**
package Inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;


    public Casa(String direccion){
        this.direccion=direccion;
        this.listaHabitaciones=new ArrayList<>();
        setPropietario();

    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion: listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación "+ nombre+" ya existe");
                return;
            }

        }
        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion "+nombre+" creada.");
    }

    public void eliminarHabitacion(String nombre){


        for (Habitacion habitacion: listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación "+nombre+" eliminada con éxito");
                return;
            }
        }

        System.out.println("La habitación "+nombre+" no existe");

    }

    public void mostrarHabitacion(){
        System.out.println("Casa en "+direccion+" y propietario "+ getPropietario().getNombre()+" tiene "+listaHabitaciones.size()+" habitaciones.");
        for (Habitacion habitacion: listaHabitaciones){
            System.out.println("- "+ habitacion.getNombre()+" ("+habitacion.getMetros()+") m2");
        }
    }

    public void getHabitacionMayorConsumo(){

        Habitacion masConsumo = listaHabitaciones.get(0);
        for (Habitacion habitacion: listaHabitaciones){
            if (masConsumo.calcularConsumo()<habitacion.calcularConsumo()){
                masConsumo= habitacion;
            }
        }

        System.out.println("La habitación con más consumo es "+masConsumo+" con "+ masConsumo.calcularConsumo()+" kWh");
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);

        for (Habitacion habitacion: listaHabitaciones) {
            if (habitacion.getMetros()>mayor.getMetros()){
                mayor=habitacion;
            }
        }

        return mayor;
    }

    public Propietario getPropietario(){
        return propietario;
    }

    public void setPropietario(){
        System.out.println("Introduce el nombre del propietario");
        String nombre = teclado.next();
        System.out.print("Edad:");
        int edad = teclado.nextInt();
        teclado.nextLine();
        Propietario propietario = new Propietario(nombre, edad);
        this.propietario= propietario;
        System.out.println("Propietario " +nombre+" añadido.");
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario='"+propietario+'\''+
                '}';
    }




}
[Link a la clase casa en *GitHub*](https://github.com/ManuelPastorMartinez/2oTrimestre/blob/main/2oTrimestre/src/main/java/Inmobiliaria/Casa.java)



### 3. Programa principal (InmoApp)

### 4. Pruebas

### 5. Entrega

- [X] Código fuente en GitHub: [Link]()
- [ ] Documentación
- [ ] Pruebas
