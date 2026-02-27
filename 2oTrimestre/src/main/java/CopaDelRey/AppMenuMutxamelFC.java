package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenuMutxamelFC {
    static Scanner teclado = new Scanner(System.in);

    public static ArrayList<JugadorFutbol>listaJugadores = new ArrayList<>();
    public static void main(String[] args) {

        JugadorFutbol portero = new JugadorFutbol("Jacobo San Mauro", 30, Equipo.SENIOR, 1, Posicion.PORTERO);
        JugadorFutbol defensa = new JugadorFutbol("Jorge Cuartero", 22, Equipo.SENIOR, 4, Posicion.DEFENSA);
        JugadorFutbol medio = new JugadorFutbol("Joaquin Magnoli", 18, Equipo.SENIOR, 8, Posicion.CENTROCAMPISTA);
        JugadorFutbol delantero = new JugadorFutbol("Angel Rocamora", 25, Equipo.SENIOR, 10, Posicion.DELANTERO);

        listaJugadores.add(portero);
        listaJugadores.add(defensa);
        listaJugadores.add(medio);
        listaJugadores.add(delantero);
        imprimirMenu();
    }
    public static void imprimirMenu(){
        System.out.println("=== App de mantenimiento de Mutxamel FC ===");
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("        Dentro podremos añadir jugadores, modificar sus datos y añadir acompañantes (sólo seniors).");
        System.out.println("[2]. Consultar equipos");
        System.out.println("        Dentro se deben listar los tipos de equipos del club y elegir uno");
        System.out.println("[X]. Salir");
        menu();
    }

    public static void menu(){
        switch (opcion()){
            case '1':
                imprimirMenuMantenimiento();
                break;
            case '2':
                consultarEquipo();
                break;

            case 'X':
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Por favor pon una opción válida.");
        }
    }

    public static void imprimirMenuMantenimiento(){
        System.out.println("=== Mantenimiento de Jugadores. ");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador existente.");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");
        menuMantenimiento();
    }

    public static void menuMantenimiento(){
        switch (opcion()){
            case '1':
                anyadirJugador();
                imprimirMenu();
                break;
            case '2':

                break;

            case '3':

                break;

            case 'X':
                imprimirMenu();
                break;
            default:
                System.out.println("Por favor pon una opción válida.");
        }
    }

    public static void anyadirJugador(){

        System.out.println("Cuál es el nombre del jugador a añadir: ");
        String nombre = teclado.next();

        System.out.println("Cuál es la edad de "+nombre);
        int edad = teclado.nextInt();

        System.out.println("Cuál es la categoria del jugador");
        String categoria = teclado.next().toUpperCase();
        Equipo equipo = Equipo.valueOf(categoria);

        System.out.println("Cuál es el dorsal del jugador");
        int dorsal = teclado.nextInt();

        try {
            for (JugadorFutbol jugador : listaJugadores){
                if (jugador.getDorsal()==dorsal){
                    throw new MismoDorsalException();
                }
            }
        }catch (MismoDorsalException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Por último, cuál es la posición del jugador");
        String posicionJugador = teclado.next().toUpperCase();

        Posicion posicion = Posicion.valueOf(posicionJugador);

        JugadorFutbol nuevo = new JugadorFutbol(nombre,edad,equipo,dorsal,posicion);
        listaJugadores.add(nuevo);

    }

    public static void consultarEquipo(){

        if (listaJugadores.size()==0){
            System.out.println("No hay jugadores en el equipo");
        }else {
            for (JugadorFutbol jugador : listaJugadores){
                System.out.print(jugador.nombre+", ");
                System.out.print(jugador.getEdad()+", ");
                System.out.print(jugador.getCategoria()+", ");
                System.out.print(jugador.getDorsal()+", ");
                System.out.println(jugador.getPosiciones());
            }
            imprimirMenu();
        }
    }



    public static char opcion(){
        System.out.print("Elige una opción: ");
        return teclado.next().toUpperCase().charAt(0);
    }
}
