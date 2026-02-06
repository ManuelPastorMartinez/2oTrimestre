package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoApp {

    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cuenta> listaCuentas = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n--- BANC MUTXAMEL ---");
            System.out.println("1. Mantenimiento Clientes");
            System.out.println("2. Mantenimiento Cuentas");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuCuentas();
                    break;
            }

        } while (opcion != 0);
    }

    public static void menuClientes() {
        int opcion;

        System.out.println("\n1. Alta cliente");
        System.out.println("2. Baja cliente");
        System.out.println("3. Listado clientes");
        System.out.println("4. Modificar cliente");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1:
                altaCliente();
                break;
            case 2:
                bajaCliente();
                break;
            case 3:
                listarClientes();
                break;
            case 4:
                modificarCliente();
                break;
        }
    }

    public static void altaCliente() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        listaClientes.add(new Cliente(nombre, apellidos));
        System.out.println("Cliente añadido correctamente");
    }

    public static void bajaCliente() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre) &&
                    cliente.getApellidos().equalsIgnoreCase(apellidos)) {

                for (Cuenta cuenta : listaCuentas) {
                    if (cuenta.getTitular() == cliente) {
                        cuenta.setTitular(null);
                    }
                }
                listaClientes.remove(cliente);
                System.out.println("Cliente eliminado");
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }

    public static void listarClientes(){
        for (Cliente cliente : listaClientes){
            System.out.println(cliente);
        }
    }

    public static void modificarCliente(){
        listarClientes();
        System.out.print("ID del cliente: ");
        int id = teclado.nextInt();
        teclado.nextLine();

        for (Cliente cliente : listaClientes){
            if (cliente.getId()==id){
                System.out.print("Nuevo nombre: ");
                cliente.setNombre(teclado.nextLine());
                System.out.print("Nuevos apellidos: ");
                cliente.setApellidos(teclado.nextLine());
                System.out.println("Cliente modificado");
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }

    public static void menuCuentas(){
        System.out.println("1. Ver todas las cuentas");
        System.out.println("2. Crear cuenta nueva");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion){

            case 1:
                for (Cuenta cuenta : listaCuentas){
                    System.out.println(cuenta);
                }
                break;
            case 2:
                Cuenta cuenta = new Cuenta();
                listaCuentas.add(cuenta);
                System.out.println("Cuenta creada: "+ cuenta.getIban());
                break;
            default:
                System.out.println("Saliendo del programa...");
        }
    }



}
