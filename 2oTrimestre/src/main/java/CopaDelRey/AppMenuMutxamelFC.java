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

    public static void menu(){
        imprimirMenu();
        switch (opcion()){
            case 1:

        }
    }

    public static char opcion(){
        System.out.print("Elige una opción: ");
        return teclado.next().charAt(0);
    }
}
