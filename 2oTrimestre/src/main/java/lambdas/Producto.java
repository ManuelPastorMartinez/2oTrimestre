package lambdas;

import lombok.Getter;

@Getter
public class Producto implements FiltroProducto{
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre,double precio, String categoria){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    @Override
    public boolean filtrar(Producto producto) {
        if (producto.getPrecio()>100){
            return true;
        }

        return false;
    }
}
