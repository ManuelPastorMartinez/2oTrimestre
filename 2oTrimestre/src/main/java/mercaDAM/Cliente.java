package mercaDAM;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class Cliente {
    private String usuario;
    private String contrasenya;
    private String direccion="Calle falsa, 123";
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario,String contrasenya){
        this.usuario=usuario;
        this.contrasenya=contrasenya;
        this.direccion=getDireccion();
        this.pedido=null;
        this.promociones=false;
    }

    public void crearPedido(){
        this.pedido = new Pedido();
        pedido.setImporteTotal(0);
        System.out.println("Creando nuevo pedido...");
    }

    public void insertarProducto(Producto producto){
        HashMap<Producto,Integer> mapa = pedido.getPedido();
        if (mapa.containsKey(producto)){
            mapa.put(producto,mapa.get(producto)+1);
        }else {
            mapa.put(producto,1);
        }
        System.out.println("Has añadido "+producto+" con un precio de "+producto.getPRECIO()+"€");
        pedido.actualizarImporte(producto.getPRECIO());
        System.out.println("Importe total del pedido: "+pedido.getImporteTotal()+"€");
    }


}
