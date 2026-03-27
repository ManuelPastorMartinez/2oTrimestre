package mercaDAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Clase que tiene todo el proceso del mercado
 */
public class AppZonaClientes {

    private static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);

    /**
     * Se crea el mercado y se genera un cliente nuevo y te lo imprime y llama a el método de autenticación para verificar al cliente
     * @param args
     */
    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        mercadam.generarClientes();
        System.out.println(mercadam);
        autenticacion(mercadam.getClientes());
    }

    /**
     * A este método le pasas la lista de clientes y te pide el usuario y la contraseña para verificar, tienes 3 intentos para verificar al usuario y si no el programa se acaba
     * @param clientes
     */
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

    /**
     * Método sencillo que sirve para crear el pedido del cliente y llamar a la lista de productos
     */
    public static void iniciarCompra(){
        cliente.crearPedido();
        imprimirProducto();
    }

    /**
     * Te imprime la lista de productos y te pregunta que producto quieres añadir y si quieres añadir otro, si no quieres añadir pasa a imprimirResumen
     */
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

    /**
     * Te imprime un resumen del pedido del cliente y pasa a mostrarOpciones
     */
    public static void imprimirResumen(){

        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");
        HashMap<Producto,Integer> mapa = cliente.getPedido().getPedido();

        for (Map.Entry<Producto,Integer>mapita : mapa.entrySet()){
            System.out.println(mapita.getValue()+" "+mapita.getKey()+" "+mapita.getKey().getPRECIO());
        }

        System.out.println("IMPORTE TOTAL: "+cliente.getPedido().getImporteTotal());
        mostrarOpciones();
    }

    /**
     * Te imprime la despedida y te dice que llegará a la dirección y el programa acaba
     */
    public static void imprimirDespedida(){
        System.out.println("=== GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección "+cliente.getDireccion());
    }

    /**
     * Te da 3 opciones a elegir y depende de lo que elijas te aplica las promociones, te muestra el pedido ordenado por unidades o termina el pedido
     */
    public static void mostrarOpciones(){
        System.out.println("¿Qué desea hacer?");
        System.out.println("[1]. Aplicar promos.");
        System.out.println("[2]. Mostrar resumen ordenado por uds.");
        System.out.println("[3]. Terminar pedido");

        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                if (cliente.isPromociones()){
                    System.out.println("Ya has aplicado tus promociones anteriormente.");
                }else {
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.setPromociones(true);
                }
                break;
            case 2:
                imprimirResumen();
                break;
            case 3:
                imprimirDespedida();
                return;
            default:
                System.out.println("Opción no válida, elige otra opción");
                mostrarOpciones();
                break;
        }
    }
}
