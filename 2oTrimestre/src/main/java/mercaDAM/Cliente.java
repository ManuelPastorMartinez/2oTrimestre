package mercaDAM;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario,String contrasenya){
        this.usuario=usuario;
        this.contrasenya=contrasenya;
    }

    public void crearPedido(){

    }

    public void insertarProducto(Producto producto){

    }


}
