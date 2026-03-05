package colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4_queue {
    static Scanner teclado = new Scanner(System.in);
    static Deque<String> compra = new LinkedList<>();
    public static void main(String[] args) {
        imprimirMenu();
    }

    public static void menu(){

        switch (opcion()){

            case '1':
                anyadirProductoPrincipio();
                menu();
                break;
            case '2':
                eliminarPrimerProducto();
                menu();
                break;
            case '3':
                eliminarProductoPorNombre();
                menu();
                break;
            case '4':
                verPrimerProducto();
                menu();
                break;
            case '5':

                break;
            case '6':

                break;
            case 'x':

                break;
        }
    }

    public static void imprimirMenu(){
        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");
        menu();

    }

    public static void anyadirProductoPrincipio(){

        System.out.print("Producto a añadir: ");

        String producto = teclado.next();

        compra.offerLast(producto);
    }

    public static void eliminarPrimerProducto(){
        System.out.println("Eliminando "+compra.pollFirst());
    }

    public static void eliminarProductoPorNombre(){

        System.out.print("Producto a eliminar: ");

        String producto = teclado.next();

        compra.remove(producto);

        if (!compra.contains(producto)){
            System.out.println("Este producto no se encuentra en la lista");
        }
    }

    public static void verPrimerProducto(){
        System.out.println("El primer producto es: "+compra.peekFirst());
    }

    public static char opcion(){
        System.out.print("Seleccione una opción: ");
        return teclado.next().toLowerCase().charAt(0);
    }

    public static void mostarProducto(){

    }
}
