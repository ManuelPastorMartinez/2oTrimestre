package mercaDAM;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString

/**
 * La clase pedido sirvce para mirar el pedido del cliente y el precio total del pedido
 */
public class Pedido {
    private HashMap<Producto,Integer> pedido;
    private double importeTotal;

    /**
     * El constructor del pedido, inicializa el mapa del pedido
     */
    public Pedido(){
        this.pedido=new HashMap<>();
    }

    /**
     * Método que sirve para ir actualizando el importe el importe
     * @param importe
     */

    public void actualizarImporte(double importe){
        importeTotal+=importe;
    }

    /**
     * Este método sirve para aplicar la promoción del 3x2 y llama para aplicar la del 10%, aunque yo no la tengo porque no se cómo se hace ahora mismo
     */
    public void aplicarPromo3x2(){
        setImporteTotal(0);
        System.out.println("================================================");
        System.out.println("PROMO 3x2 Y 10% DESC. APLICADAS");
        System.out.println("================================================");

        aplicarPromo10();
    }

    /**
     * Esta promo lo único que hace es multiplicar el importe total por 0,9 ya que si se aplica un 10% de descuento significa que te cobran el resto
     */
    public void aplicarPromo10(){
        importeTotal = importeTotal * 0.9;
        AppZonaClientes.imprimirResumen();
    }
}
