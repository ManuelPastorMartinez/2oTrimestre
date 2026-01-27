package Tema5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaCompra {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("La lista está vacía?: "+lista.isEmpty());

        lista.add("Jamon");

        System.out.println("La lista sigue vacia?: "+lista.isEmpty());

        lista.addAll(Arrays.asList("Huevos","Leche","Patatas","Agua","Coca-cola"));
        System.out.println(lista);

        System.out.println(lista.get(2));

        lista.set(1,"Queso");
        System.out.println(lista);

        System.out.println("La lista tiene leche?: "+lista.contains("Leche"));

        System.out.println("Añade un elemento a la lista");
        String elemento = teclado.next();
        if (comprobarElemento(elemento,lista)==-1){
            lista.add(elemento);
        }else {
            System.out.println("El elemento ya está en la lista");
        }
        System.out.println(lista);

        System.out.println("Cantidad de cosas de la lista: "+lista.size());

        ArrayList<String> copia_lista = new ArrayList<>(lista);

        copia_lista.clear();
        System.out.println("La copia de la lista está vacia?: "+copia_lista.isEmpty());


        sonIguales(lista,copia_lista);


        copia_lista.add("Huevos");
        copia_lista.add("Patatas");

        ArrayList<String>faltantes = new ArrayList<>(lista);
        faltantes.removeAll(copia_lista);







    }

    public static int comprobarElemento(String palabra, ArrayList<String > copia ){
        return copia.indexOf(palabra);
    }

    public static boolean sonIguales(ArrayList<String>lista,ArrayList<String>copia_lista){
        if (lista.contains(copia_lista)){
            System.out.println("Las listas son iguales");
            return true;
        }else {
            System.out.println("Las listas no son iguales");
            return false;
        }
    }
}
