package mercaDAM;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Pedido {
    private HashMap<Producto,Integer> pedido;
    private double importeTotal;

    public Pedido(){
        this.pedido=new HashMap<>();
    }

    public void actualizarImporte(double importe){
        importeTotal+=importe;
    }

    public void aplicarPromo3x2(){
        for (Map.Entry<Producto,Integer>mapa : pedido.entrySet()){
            int unidades = mapa.getValue();
            int gratis = unidades/3;
            double precio = mapa.getKey().getPRECIO();

            importeTotal -= gratis*precio;
        }
    }

    public void aplicarPromo10(){
        importeTotal = importeTotal * 0.9;
    }
}
