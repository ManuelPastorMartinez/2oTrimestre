package mercaDAM;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PedidoTest {

    @Test
    public void importeTotalTest(){

        Pedido pedido = new Pedido();

        double importeInicial=pedido.getImporteTotal();
        pedido.actualizarImporte(55.0);
        double importeFinal = pedido.getImporteTotal();

        double sumaImporteTotal = (importeInicial + importeFinal);

        assertEquals(importeFinal, sumaImporteTotal);
    }

    @Test
    public void promo10Test(){
        Pedido pedido = new Pedido();
        pedido.actualizarImporte(100);

        pedido.aplicarPromo10();
        double valorFinal = pedido.getImporteTotal();
        double valorComparable = 100 * 0.9;
        assertEquals(valorFinal, valorComparable);

    }

}
