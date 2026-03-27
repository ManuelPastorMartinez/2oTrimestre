package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Desodorante",4.99,"Higiene"));
        listaProductos.add(new Producto("Ordenador",949.99,"electrónica"));
        listaProductos.add(new Producto("Tobogán",200,"entretenimiento"));
        listaProductos.add(new Producto("Aros de oro plateado",499.99,"estética"));
        listaProductos.add(new Producto("Pendientes de oro falso",49.99,"estética"));
        listaProductos.add(new Producto("Perro de juguete",10,"entretenimiento"));
        listaProductos.add(new Producto("Disco duro externo SSD ",100,"electrónica"));
        listaProductos.add(new Producto("Zapatillas Jordan",99.99,"ropa"));
        List<Producto>productosFiltrados = new ArrayList<>();
        for (Producto productito : listaProductos){
            FiltroProducto filtro = producto -> producto.getPrecio()>=100;
            FiltroProducto filtroProducto = producto -> producto.getCategoria().equals("electrónica");

            if (filtro.filtrar(productito) && filtroProducto.filtrar(productito)){
                productosFiltrados.add(productito);
            }
        }


        System.out.println();
        System.out.println("Productos filtrados (Electrónica y precio > 100): ");
        for (Producto producto : productosFiltrados){
            System.out.println("Nombre: "+producto.getNombre()+", Precio: "+producto.getPrecio());
        }
    }


}
