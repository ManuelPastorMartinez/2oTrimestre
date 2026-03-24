package mercaDAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    private static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        mercadam.generarClientes();
        System.out.println(mercadam);
        autenticacion(mercadam.getClientes());
    }

    public static void autenticacion(Set<Cliente>clientes){
        int intentos = 3;

        while (intentos>0) {
            System.out.println("=== COMRA ONLINE EN MERCADAM ===");
            System.out.print("Usuario: ");
            String usuario = teclado.next();
            System.out.print("Contraseña: ");
            String contrasenya = teclado.next();
            for (Cliente clienteCreado : clientes){
                if (clienteCreado.getUsuario().equals(usuario) && clienteCreado.getContrasenya().equals(contrasenya)){
                    System.out.println("Bienvenido, "+usuario);
                     cliente=clienteCreado;
                    iniciarCompra();
                    break;
                }else {
                    intentos--;
                    System.out.println("Credenciales no válidos. Intentos: "+intentos);
                }
            }
        }
        if (intentos==0){
            System.out.println("ERROR DE AUTENTICACIÓN");
            return;
        }

    }

    public static void iniciarCompra(){
        cliente.crearPedido();
        imprimirProducto();
    }

    public static void imprimirProducto(){
        char opcion = 'S';
        do {
            System.out.println("Elige un producto de la lista...");
            for (Producto producto : Producto.values()) {
                System.out.println(producto + ":" + producto.getPRECIO() + "€");
            }
            System.out.println("===========================================");
            System.out.println("Elige un producto: ");
            boolean anyadir = true;
            Producto producto = null;
            try {
                producto = Producto.valueOf(teclado.next().toUpperCase());
            }catch (Exception e){
                System.out.println("Producto no reconocido. Elige otro...");
                anyadir = false;
            }

            if (anyadir){
                cliente.insertarProducto(producto);
            }
            System.out.println("¿Quieres añadir más productos (S/N)?");
            opcion=teclado.next().toUpperCase().charAt(0);
        }while (opcion=='S');
        imprimirResumen();
    }

    public static void imprimirResumen(){

        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");
        HashMap<Producto,Integer> mapa = cliente.getPedido().getPedido();

        for (Map.Entry<Producto,Integer>mapita : mapa.entrySet()){
            System.out.println(mapita.getValue()+" "+mapita.getKey());
        }

        System.out.println("IMPORTE TOTAL: "+cliente.getPedido().getImporteTotal());
        mostrarOpciones();
    }

    public static void imprimirDespedida(){

    }

    public static void mostrarOpciones(){
        System.out.println("¿Qué desea hacer?");
        System.out.println("[1]. Aplicar promos.");
        System.out.println("[2]. Mostrar resumen ordenado por uds.");
        System.out.println("[3]. Terminar pedido");

        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                cliente.getPedido().aplicarPromo10();
                cliente.getPedido().aplicarPromo3x2();
            case 2:

        }
    }
}
