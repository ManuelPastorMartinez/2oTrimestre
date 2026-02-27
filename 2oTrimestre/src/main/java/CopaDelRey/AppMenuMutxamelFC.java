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
        System.out.println("==================================");
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
        System.out.println("===============================================");
        menuMantenimiento();
    }

    public static void menuMantenimiento(){
        switch (opcion()){
            case '1':
                anyadirJugador();
                imprimirMenu();
                break;
            case '2':
                imprimirMantenimientoJugadores();
                imprimirMenu();
                break;

            case '3':
                crearAcompanyante();
                imprimirMenu();
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
            return;
        }

        System.out.println("Por último, cuál es la posición del jugador");
        String posicionJugador = teclado.next().toUpperCase();

        Posicion posicion = Posicion.valueOf(posicionJugador);

        JugadorFutbol nuevo = new JugadorFutbol(nombre,edad,equipo,dorsal,posicion);
        listaJugadores.add(nuevo);

    }

    public static void imprimirMantenimientoJugadores(){

        System.out.println("De qué jugador quieres hacer cambios?");

        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("["+i+", Nombre: "+listaJugadores.get(i).nombre+", Edad: "+listaJugadores.get(i).getEdad()
                    +", Categoria: "+listaJugadores.get(i).getCategoria()+", Dorsal: "+listaJugadores.get(i).getDorsal()
                    +", Posición: "+listaJugadores.get(i).getPosiciones()+"]");
        }

        System.out.println("================================================");

        mantenimientoJugadores(opcionJugadores());
    }


    public static void mantenimientoJugadores(int opcion){

        System.out.println("=== Mantenimiento de jugadores. Modificar datos de jugador existente ===");

        for (int i = 0; i < listaJugadores.size(); i++) {

            if (opcion==i){
                System.out.println("Modificando jugador: ["+listaJugadores.get(i).nombre+", Edad: "+listaJugadores.get(i).getEdad()
                        +", Categoria: "+listaJugadores.get(i).getCategoria()+", Dorsal: "+listaJugadores.get(i).getDorsal()
                        +", Posición: "+listaJugadores.get(i).getPosiciones()+"]");

                System.out.println("Que quieres modificar? [nombre, edad,categoria,dorsal,posicion]");

                System.out.println("================================");

                switch (opcionModificar()){

                    case "nombre":
                        System.out.print("Nuevo nombre -->");
                        String nuevoNombre = teclado.next();
                        listaJugadores.get(i).setNombre(nuevoNombre);
                        System.out.println("¡Nombre modificado con éxito! Nuevo nombre: "+listaJugadores.get(i).getNombre());
                        break;
                    case "edad":
                        System.out.print("Nueva edad -->");
                        int nuevaEdad = teclado.nextInt();
                        listaJugadores.get(i).setEdad(nuevaEdad);
                        System.out.println("¡Edad modificada con éxito! Nueva edad: "+listaJugadores.get(i).getEdad());
                        break;
                    case "categoria":
                        System.out.print("Nueva categoria -->");
                        String categoria = teclado.next().toUpperCase();
                        Equipo nuevaCategoria = Equipo.valueOf(categoria);
                        listaJugadores.get(i).setCategoria(nuevaCategoria);
                        System.out.println("¡Categoria modificada con éxito! Nueva categoria: "+listaJugadores.get(i).getCategoria());
                        break;
                    case "dorsal":
                        System.out.print("Nuevo dorsal-->");
                        int nuevoDorsal = teclado.nextInt();
                        try {
                            for (JugadorFutbol jugador : listaJugadores){
                                if (nuevoDorsal==jugador.getDorsal()){
                                    throw new MismoDorsalException();
                                }
                            }
                        }catch (MismoDorsalException e){
                            System.out.println("¡Lo siento! Ese dorsal ya está ocupado por un jugador del mismo equipo "
                                    +listaJugadores.get(i).getCategoria());
                            return;
                        }
                        listaJugadores.get(i).setDorsal(nuevoDorsal);
                        System.out.println("¡Dorsal modificado con éxito! Nuevo dorsal: "+listaJugadores.get(i).getDorsal());
                        break;

                    case "posicion":
                        System.out.print("Nueva posicion-->");
                        String posicion = teclado.next();
                        Posicion nuevaPosicion=Posicion.valueOf(posicion);
                        listaJugadores.get(i).setPosiciones(nuevaPosicion);
                        System.out.println("¡Posicion modificada con éxito! Nueva posición: "+listaJugadores.get(i).getPosiciones());
                        break;
                    default:
                        System.out.println("Por favor pon una opción correcta");
                }
            }
        }


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

    public static void crearAcompanyante(){
        System.out.print("Introduce el nombre del acompañante: ");
        String nombre = teclado.next();

        System.out.print("Introduce la edad de "+nombre+": ");
        int edad = teclado.nextInt();

        JugadorFutbol jugadorAux = null;

        System.out.print("Introduce el jugador del acompañante: ");
        teclado.nextLine();
        String nombreJugador = teclado.nextLine();


        for (JugadorFutbol jugador : listaJugadores) {
            if (nombreJugador.equals(jugador.nombre)) {
                jugadorAux = jugador;
            }
        }

        if (jugadorAux == null){
            System.out.println("No se ha encontrado a ningún jugador que coincida con el nombre de este acompañante");
            return;
        }


        System.out.print("Que parentesco tiene "+nombre+" con "+nombreJugador+": ");
        String parentesco = teclado.next();

        Acompanyante acompanyante = new Acompanyante(nombre,edad,jugadorAux,parentesco);

        System.out.println("¡Acompanyante creado! Nombre: "+nombre+", Edad: "+edad+", Jugador: "+jugadorAux.nombre+", Parentesco: "+parentesco);
    }

    public static String opcionModificar(){

        System.out.print("Selecciona una opcion-->");
        return teclado.next().toLowerCase();
    }

    public static int opcionJugadores(){
        System.out.print("Selecciona una opción -->");
        return teclado.nextInt();
    }


    public static char opcion(){
        System.out.print("Selecciona una opción --> ");
        return teclado.next().toUpperCase().charAt(0);
    }
}
