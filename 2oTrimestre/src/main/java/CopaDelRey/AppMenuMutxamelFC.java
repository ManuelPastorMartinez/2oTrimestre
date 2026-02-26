package CopaDelRey;

import java.util.Scanner;

public class AppMenuMutxamelFC {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void imprimirMenu(){
        System.out.println("=== App de mantenimiento de Mutxamel FC ===");
        System.out.println("[1]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("        Dentro podremos añadir masajistas y modificar sus datos");
        System.out.println("[2]. Consultar equipos");
        System.out.println("        Dentro se deben listar los tipos de equipos del club y elegir uno");
        System.out.println("[X]. Salir");
    }

    public static void menuMantenimiento(){
        System.out.println("=== Mantenimiento de Entrenadores. ");
        System.out.println("[1]. Añadir nuevo entrenador");
        System.out.println("[2]. Modificar datos de entrenador existente.");
        System.out.println("[3]. Crear masajista");
        System.out.println("[X]. Volver al menú principal");
    }

    public static void menu(){
        imprimirMenu();
        switch (opcion()){
            case '1':

                break;
            case '2':

                break;

            case 'X':
                System.out.println("Saliendo del programa...");
                return;
            default:
                System.out.println("Por favor pon una opción válida.");
        }
    }

    public static char opcion(){
        System.out.print("Elige una opción: ");
        return teclado.next().toUpperCase().charAt(0);
    }
}
