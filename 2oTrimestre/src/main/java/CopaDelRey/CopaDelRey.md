# Práctica 1. Sistema de pago e-commerce
## ÍNDICE
1. [Intro](https://github.com/ManuelPastorMartinez/2oTrimestre/new/main/2oTrimestre/src/main/java/CopaDelRey#1-Intro)
2. [Estructura de clases](#2-estructura-de-clases)
- Diagrama de clases UML
- Contenido de clases (.java)
4. [Programa principal (CommerceApp)](#3-programa-principal)
5. [pruebas](#4-pruebas)
6. [Entrega](#5-Entrega)

  ### 1. Intro
> La práctica consiste en crear un equipo con sus jugadores y su entrenador y el equipo técnico
> También hay que crear un menú de mantenimiento para poder crear o modificar jugadores
> El objetivo de esta práctica era aprender el uso de las interfaces, de los enums y de las excepciones personalizadas
### 2. Estructura de clases

#### Diagrama de clases UML
![](img/Diagrama.png)

#### Contenido de las clases (.java)
- Clase **JugadorFutbol.java**

package CopaDelRey;

public interface AccionesDeportivas {

    /**
     * Este método sirve para poder sobreescribirlo en las clases que utilicen acciones deportivas y es obligatorio implementarlo
     */
    public void entrenar();

    /**
     * Método que sirve para sobreescribirlo en las clases que utilicen esta, también obligatorio implementarlo
     * @param rival
     */
    public void jugarPartido(String rival);
}


- Clase **Acompanyante.java**
package CopaDelRey;

public class Acompanyante extends MutxamelFC {
    private JugadorFutbol integrante;
    private String parentesco;

    /**
     * El constructor de acompañante, hereda los atributos de MutxamelFC y también añade los suyos propios
     * @param nombre
     * @param edad
     * @param integrante
     * @param parentesco
     */
    public Acompanyante(String nombre, int edad, JugadorFutbol integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    /**
     * Método exclusivo de acompañante para animar al equipo
     */
    public void animarEquipo(){
        System.out.println(nombre+ " animando con toda su alma al equipo");
    }

    /**
     * Método para poder llamar a integrante
     * @return
     */
    public JugadorFutbol getIntegrante() {
        return integrante;
    }

    /**
     * Método para cambiar el integrante del acompañante
     * @param integrante
     */
    public void setIntegrante(JugadorFutbol integrante) {
        this.integrante = integrante;
    }

    /**
     * Método para poder llamar al parentesco del jugador con el acompañante
     * @return
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Método para cambiar el parentesco de un acompañante con el jugador
     * @param parentesco
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Método que sobreescribe a concentrarse y personalizado para el acompañante
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante del jugador está ayudandole a concentrarse para su partido");
    }

    /**
     * Método para sobreescribir ciudad y decir donde viaja el acompañante
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante "+nombre+" está viajando con el jugador a "+ciudad);
    }

    /**
     * Método para sobreescribir celebrarGol y personalizado al acompañante
     */

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante "+ nombre+" está celebrando el gol de su "+parentesco);
    }


}


- Clase **AppMenuMutxamelFC.java**
package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenuMutxamelFC {
    static Scanner teclado = new Scanner(System.in);

    public static ArrayList<JugadorFutbol>listaJugadores = new ArrayList<>();

    /**
     * El main contiene jugadores y los añade a la lista de jugadores y llama a imprimir menu para comencar la app
     * @param args
     */
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

    /**
     * Método para imprimir el menu y que llama a menú
     */
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

    /**
     * 1er menú que da la opción de mantenimiento de jugadores, de mostrar los jugadores o de salir del programa
     */
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

    /**
     * Método que sirve para imprimir el menú de mantenimiento de los jugadores y llama para hacer el switchCase
     */
    public static void imprimirMenuMantenimiento(){
        System.out.println("=== Mantenimiento de Jugadores. ");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador existente.");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");
        System.out.println("===============================================");
        menuMantenimiento();
    }

    /**
     * Método que sirve para llamar al switchCase y dependiendo de que eligas llama a un método u a otro
     */
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

    /**
     * Método que sirve para crear un jugador y añadirlo a la lista de jugadores
     */
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

    /**
     * Método para imprimir el menú de mantenimiento de los jugadores
     */
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

    /**
     * El método de mantenimiento de los jugadores, si la opción que has elegido coincide con un jugador te pregunta lo que quieres modificar
     * @param opcion
     */

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

    /**
     * Método que sirve para imprimir todos los jugadores del equipo
     */
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

    /**
     * Método que sirve para crear un acompañante para el jugador preguntando su información y añddiendolo al final
     */
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

    /**
     * Método que sirve para preguntar por un número y devolverlo para el menú
     * @return
     */
    public static String opcionModificar(){

        System.out.print("Selecciona una opcion-->");
        return teclado.next().toLowerCase();
    }

    /**
     * Método que sirve para preguntar por lo que quieres modificar del jugador y te lo devuelve para modificar la opción que hayas elegido
     * @return
     */
    public static int opcionJugadores(){
        System.out.print("Selecciona una opción -->");
        return teclado.nextInt();
    }

    /**
     * Método para preguntar por un carácter  y te lo devuelve para el menú
     * @return
     */
    public static char opcion(){
        System.out.print("Selecciona una opción --> ");
        return teclado.next().toUpperCase().charAt(0);
    }
}


- Clase **AppMutxamel.java**
package CopaDelRey;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class AppMutxamelFC {

    /**
     * El main que no pregunta nada, simplemente sirve para hacer pruebas del código manuales y hacer saltar los errores manualmente
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<MutxamelFC>listaEquipo=new ArrayList<>();

        JugadorFutbol portero = null;
        JugadorFutbol defensa = null;
        JugadorFutbol medio = null;
        JugadorFutbol delantero = null;

        try {
            portero = new JugadorFutbol("Jacobo San Mauro", 30, Equipo.SENIOR, 1, Posicion.PORTERO);
            listaEquipo.add(portero);

            defensa = new JugadorFutbol("Jorge Cuartero", 22, Equipo.SENIOR, 4, Posicion.DEFENSA);
            listaEquipo.add(defensa);

            medio = new JugadorFutbol("Joaquin Magnoli", 18, Equipo.SENIOR, 8, Posicion.CENTROCAMPISTA);
            listaEquipo.add(medio);

            delantero = new JugadorFutbol("Angel Rocamora", 25, Equipo.SENIOR, 10, Posicion.DELANTERO);
            listaEquipo.add(delantero);

            JugadorFutbol prueba = new JugadorFutbol("Prueba", 10, Equipo.SENIOR, 1, Posicion.PORTERO);
            listaEquipo.add(prueba);

        } catch (MismoDorsalException e) {
            System.out.println(e.getMessage());
        }
        Entrenador manuel = null;
        Entrenador entrenadorPrueba = null;
        try {
           manuel = new Entrenador("Manuel Pastor", 18, Equipo.SENIOR, "4-3-3");
           listaEquipo.add(manuel);

           entrenadorPrueba = new Entrenador("Prueba",5,Equipo.SENIOR,"4-1-2-3");
           listaEquipo.add(entrenadorPrueba);
       }catch (FormacionCorrectaException e){
           System.out.println(e.getMessage());
       }
        Masajista david = new Masajista("David Andreica",40,"Fisioterapeuta",1);
        Masajista denis = new Masajista("Denis",21,"master",4);
        Masajista gabriel = new Masajista("Gabriel Tortosa",19,"Grado superior de masajes",8);
        listaEquipo.add(denis);
        listaEquipo.add(david);
        listaEquipo.add(gabriel);
        Acompanyante christian = new Acompanyante("Christian Sanchez",40,defensa,"amigo");
        Acompanyante carlos = new Acompanyante("Carlos Huertas",60,portero,"novio");
        listaEquipo.add(christian);
        listaEquipo.add(carlos);

        for (MutxamelFC equipo : listaEquipo){
            equipo.concentrarse();
            if (equipo instanceof Entrenador || equipo instanceof JugadorFutbol){
                ((AccionesDeportivas) equipo).entrenar();
            }
            if (equipo instanceof  Masajista){
                ((Masajista) equipo).darMasaje(delantero.nombre);
            }
            equipo.viajar("Madrid");
            if (equipo instanceof Entrenador){
                ((Entrenador) equipo).planificarEntrenamiento();
            }
            if (equipo instanceof Entrenador || equipo instanceof JugadorFutbol){
                ((AccionesDeportivas) equipo).entrenar();
            }
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).descansar();
                ((JugadorFutbol) equipo).calentar();
            }

            if(equipo instanceof JugadorFutbol ||equipo instanceof Entrenador){
                ((AccionesDeportivas) equipo).jugarPartido("Madrid");
            }
            if (equipo instanceof Acompanyante){
                ((Acompanyante) equipo).animarEquipo();
            }
            if (equipo instanceof Entrenador){
                ((Entrenador) equipo).hacerCambios();
            }
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).marcarGol();
            }
            equipo.celebrarGol();

            if (equipo instanceof Masajista){
                ((Masajista) equipo).darMasaje(defensa.nombre);
                ((Masajista) equipo).darMasaje(medio.nombre);
                ((Masajista) equipo).darMasaje(portero.nombre);
            }
            equipo.viajar("Mutxamel");
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).descansar();
            }
        }


    }
}

- Clase **Entrenador.java**
package CopaDelRey;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private static final String FORMATO_FORMACION= "\\d-\\d-\\d";

    private Equipo equipo;
    private String formacionPreferida;

    /**
     * Constructor de entrenador que hereda la clase MutxamelFC y también añade sus atributos propios al constructor
     * @param nombre
     * @param edad
     * @param equipo
     * @param formacionPreferida
     */
    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        setFormacionPreferida(formacionPreferida);

    }

    /**
     * Método que sirve para poder llamar a equipo
     * @return
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Método que sirve para poder cambiar equipo
     * @param equipo
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Método que sirve para llamar a formaciónPreferida
     * @return
     */
    public String getFormacionPreferida() {
        return formacionPreferida;
    }


    /**
     * Método que sirve para cambiar la formación preferida de entrenador
     * @param formacionPreferida
     */
    public void setFormacionPreferida(String formacionPreferida) {

        if (!formacionPreferida.matches(FORMATO_FORMACION)){
            throw new FormacionCorrectaException();
        }
        this.formacionPreferida=formacionPreferida;
    }

    /**
     * Método del entrenador que sirve para mostrar el mensaje de planificar el entrenamiento
     */
    public void planificarEntrenamiento(){
        System.out.println(nombre+ " ha decidido hacer un pre partido en el entrenamiento con la alineación "+formacionPreferida);
    }

    /**
     * Método que sirve para imprimir el mensaje para hacer los cambios
     */
    public void hacerCambios(){
        System.out.println(nombre+" ha decidido hacer cambios ya que el equipo está cansado y necesita piernas frescas");
    }

    /**
     * Método que sirve para sobreescribir concentrarse y con un mensaje personificado para el entrenador
     */
    @Override
    public void concentrarse() {
        System.out.println(nombre+" preparandose mentalmente para el partido");
    }

    /**
     * Método para sobreescribir viajar y con el mensaje para entrenador
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre+" viajando a "+ciudad+" después de la concentración del equipo");
    }

    /**
     * Método que sobreescribe celebrarGol y con mensaje personal para entrenador
     */
    @Override
    public void celebrarGol() {
        System.out.println(nombre+" celebrando el gol del equipo");
    }

    /**
     * Método que sobreescribe entrenar y con mensaje personificado para entrenador
     */
    @Override
    public void entrenar() {
        System.out.println("Preparando el último entrenamiento antes del partido");
    }

    /**
     * Método para sobreescribir jugarPartido personificado para entrenador
     * @param rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Preparando las tácticas del partido contra el "+rival);
    }
}

-Clase **Equipo.java**
package CopaDelRey;

public enum Equipo {
    BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR
}

-Clase **FormacionCorrectaException.java**
package CopaDelRey;

public class FormacionCorrectaException extends RuntimeException {
    public FormacionCorrectaException() {
        super("La formación del entrenador no es válida");
    }
}

-Clase **FuncionesIntegrantes.java**
package CopaDelRey;

public interface FuncionesIntegrantes {

    /**
     * Este método sirve para poder sobreescribirlo cada vez que una clase se relacione con esta y es obligatorio que lo contenga
     * y sirve para cada vez que una persona quiera concentrarse
     */
    public void concentrarse();



    /**
     * Este método también sirve para poder sobreescribirlo cada vez que se relacione con esta clase y sirve para cada vez que un
     * equipo viaje
     * @param ciudad
     */
    public void viajar(String ciudad);

    /**
     * Este método sirve también para sobreescribir y que la clase que lo llame celebre el gol personalizado para cada tipo de clase
     */
    public void celebrarGol();
}

-Clase **JugadorFutbol.java**
package CopaDelRey;

import java.util.ArrayList;

public class JugadorFutbol extends MutxamelFC implements AccionesDeportivas{
    private Equipo categoria;
    private int dorsal;
    private Posicion posiciones;
    private static ArrayList<JugadorFutbol>listaJugadores=new ArrayList<>();

    /**
     * Este es el constructor de un jugador de fútbol, tiene los atributos de la clase madre y también implementa los suyos
     * @param nombre
     * @param edad
     * @param categoria
     * @param dorsal
     * @param posiciones
     */
    public JugadorFutbol(String nombre, int edad, Equipo categoria, int dorsal, Posicion posiciones) {
        super(nombre, edad);
        this.categoria=categoria;
        this.posiciones=posiciones;
        setDorsal(dorsal);

    }


    /**
     * Este método sirve para imprimir el mensaje de arriba cada vez que se le llama (cuando un jugador está calentando)
     */
    public void calentar(){
        System.out.println(nombre+ " calentando antes del partido para evitar lesionarse ");
    }
    /**
     * Este método también es único de jugador e imprime el mensaje cada vez que se le llama, que es cuando un jugador se va al descanso después de la primera parte
     */
    public void descansar(){
        System.out.println(nombre+" yendose al descanso después de la primera parte");
    }

    /**
     * Este método imprime el mensaje de arriba cada vez que se le llama y es único de Jugador, que es cada vez que alguien marca gol
     */
    public void marcarGol(){
        System.out.println(nombre+ " ha marcado gol y lo está celebrando con su afición");
    }


    /**
     * Método que sirve para poder llamar a la categoria del jugador
     * @return
     */
    public Equipo getCategoria() {
        return categoria;
    }
    /**
     * Método que sirve para cambiar la categoria del jugador
     * @param categoria
     */
    public void setCategoria(Equipo categoria) {
        this.categoria = categoria;
    }
    /**
     * Método que sirve para poder llamar al dorsal.
     * @return
     */
    public int getDorsal() {
        return dorsal;
    }
    /**
     * Este método sirve para poder el cambiar el dorsal cuando se le llama, pero también comprueba que no haya ningún dorsal repetido y añade al jugador a la lista si no está ya.
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        for ( JugadorFutbol jugador : listaJugadores){
            if (jugador.categoria.equals(this.categoria) && jugador.dorsal==dorsal){
                throw new MismoDorsalException();
            }
        }

        this.dorsal = dorsal;

        if (!listaJugadores.contains(this)){
            listaJugadores.add(this);
        }
    }

    /**
     * Método que sirve para poder llamar a posiciones
     * @return
     */
    public Posicion getPosiciones() {
        return posiciones;
    }

    /**
     * Método que sirve para cambiar la posición de un jugador
     * @param posiciones
     */

    public void setPosiciones(Posicion posiciones) {
        this.posiciones = posiciones;


    }

    /**
     * Método que sirve para sobreescribir concentrarse y personalizado para jugador
     */
    @Override
    public void concentrarse() {
        System.out.println(nombre+" preparandose física y mentalmente para el partido");
    }

    /**
     * Método para sobreescribir viajar de la interfaz y personalizado para el jugador
     * @param ciudad
     */

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre+" viajando a "+ciudad);
    }

    /**
     * Método que sobreescribe celebrarGol y personalizado para el jugador
     */
    @Override
    public void celebrarGol() {
        System.out.println(nombre+" celebrando el gol");
    }

    /**
     * Método que sobreescribe entrenar y personalizado para el jugador
     */
    @Override
    public void entrenar() {
        System.out.println(nombre+" entrenando duramente antes del partido");
    }

    /**
     * Método que sobreescribe jugarPartido y personalizado para jugador, también se le pasa el rival
     * @param rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugando partido contra el " + rival);
    }
}

-Clase **MismoDorsalException.java**
package CopaDelRey;

public class MismoDorsalException extends RuntimeException {
    public MismoDorsalException() {
        super("No se puede crar 2 jugadores con el mismo dorsal");
    }
}

-Clase **Masajista.java**
package CopaDelRey;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int anyosExperiencia;

    /**
     * Este es el constructor del masajista, tiene los métodos de la clase madre que los llama con super y después titulación y experiencia que son del propio masajista
     * @param nombre
     * @param edad
     * @param titulacion
     * @param anyosExperiencia
     */
    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }

    /**
     * Este método es para imprimir el mensaje cada vez que un masajista de un masaje
     * @param jugador
     */
    public void darMasaje(String jugador){
        System.out.println("El masajista "+nombre +" está dando un masaje a "+jugador);
    }

    /**
     * Método para llamar a titulación.
     * @return
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * Método para cambiar la titulación
     * @param titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * Método para llamar a AnyosExperiencia
      * @return
     */
    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    /**
     * Método para cambiar anyosExperiencia
     * @param anyosExperiencia
     */
    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    /**
     * Método que sobreescribe concentrarse y personalizado para masajista
     */
    @Override
    public void concentrarse() {
        System.out.println("El masajista "+nombre+" está preparandose para dar masajes al equipo");
    }

    /**
     * Método que sobreescribe viajar y personalizado para masajista
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista"+nombre+" está viajando con el equipo a "+ciudad);
    }

    /**
     * Método para sobreescribir celebrarGol y personalizado para masajista
     */
    @Override
    public void celebrarGol() {
        System.out.println("El masajista "+ nombre+" grita el gol del Equipo");
    }
}

-Clase **MutxamelFC.Java**
package CopaDelRey;

abstract class MutxamelFC implements FuncionesIntegrantes{
    protected String nombre;
    private int edad;

    /**
     * @Auhor Manuel Pastor
     * @Version 1.0
     * Este es el constructor de la clase madre, que se reutiliza en todas las hijas
     * @param nombre
     * @param edad
     */
    public MutxamelFC(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    /**
     * Este método sirve para poder llamar al nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método sirve para cambiar al nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método sirve para llamar a edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Este método sirve para poder cambiar la edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

-Clase **Posicion.java**
package CopaDelRey;

public enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

[Link a las clases de copa del rey en *GitHub*](https://github.com/ManuelPastorMartinez/2oTrimestre/tree/main/2oTrimestre/src/main/java/CopaDelRey)

### 3. Programa principal (AppMenuMutxamelFC)
````
package CopaDelRey;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenuMutxamelFC {
    static Scanner teclado = new Scanner(System.in);

    public static ArrayList<JugadorFutbol>listaJugadores = new ArrayList<>();

    /**
     * El main contiene jugadores y los añade a la lista de jugadores y llama a imprimir menu para comencar la app
     * @param args
     */
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

    /**
     * Método para imprimir el menu y que llama a menú
     */
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

    /**
     * 1er menú que da la opción de mantenimiento de jugadores, de mostrar los jugadores o de salir del programa
     */
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

    /**
     * Método que sirve para imprimir el menú de mantenimiento de los jugadores y llama para hacer el switchCase
     */
    public static void imprimirMenuMantenimiento(){
        System.out.println("=== Mantenimiento de Jugadores. ");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador existente.");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");
        System.out.println("===============================================");
        menuMantenimiento();
    }

    /**
     * Método que sirve para llamar al switchCase y dependiendo de que eligas llama a un método u a otro
     */
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

    /**
     * Método que sirve para crear un jugador y añadirlo a la lista de jugadores
     */
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

    /**
     * Método para imprimir el menú de mantenimiento de los jugadores
     */
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

    /**
     * El método de mantenimiento de los jugadores, si la opción que has elegido coincide con un jugador te pregunta lo que quieres modificar
     * @param opcion
     */

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

    /**
     * Método que sirve para imprimir todos los jugadores del equipo
     */
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

    /**
     * Método que sirve para crear un acompañante para el jugador preguntando su información y añddiendolo al final
     */
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

    /**
     * Método que sirve para preguntar por un número y devolverlo para el menú
     * @return
     */
    public static String opcionModificar(){

        System.out.print("Selecciona una opcion-->");
        return teclado.next().toLowerCase();
    }

    /**
     * Método que sirve para preguntar por lo que quieres modificar del jugador y te lo devuelve para modificar la opción que hayas elegido
     * @return
     */
    public static int opcionJugadores(){
        System.out.print("Selecciona una opción -->");
        return teclado.nextInt();
    }

    /**
     * Método para preguntar por un carácter  y te lo devuelve para el menú
     * @return
     */
    public static char opcion(){
        System.out.print("Selecciona una opción --> ");
        return teclado.next().toUpperCase().charAt(0);
    }
}

````
### 4. Pruebas
En clase

### 5. Entrega

- [X] Código fuente en GitHub: [Link](https://github.com/ManuelPastorMartinez/2oTrimestre/tree/main/2oTrimestre/src/main/java/CopaDelRey)
- [X] Documentación
- [X] Pruebas
