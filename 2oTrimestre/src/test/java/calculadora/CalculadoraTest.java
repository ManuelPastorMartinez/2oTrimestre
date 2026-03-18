package calculadora;

import Calculadora.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSuma(){
        Calculadora calculadora = new Calculadora(1,3);

        int resultadoEsperado = 4;
        int resultadoMetodo = calculadora.suma();

        assertEquals(resultadoEsperado,resultadoMetodo);
    }

    @Test
    public void testResta(){
        Calculadora calculadora = new Calculadora(3,2);

        int resultadoEsperado = 1;
        int resultadoMetodo = calculadora.resta();

        assertEquals(resultadoEsperado,resultadoMetodo);
    }

    @Test
    public void testMultiplicacion(){
        Calculadora calculadora = new Calculadora(3,3);

        int reslutadoEsperado = 9;
        int resultadoMetodo = calculadora.multiplica();

        assertEquals(reslutadoEsperado,resultadoMetodo);
    }

    @Test
    public void testDivision(){
        Calculadora calculadora = new Calculadora(35,0);

        int resultadoEsperado = 3;
        int resultadoMetodo = calculadora.divide();

        assertEquals(resultadoEsperado,resultadoMetodo);
    }
}
