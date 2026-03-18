package mercaDAM;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Pedido {
    private HashMap<Producto,Integer> pedido;
    private double importeTotal;

    public Pedido(){

    }

    public void actualizarImporte(double importe){

    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }
}
