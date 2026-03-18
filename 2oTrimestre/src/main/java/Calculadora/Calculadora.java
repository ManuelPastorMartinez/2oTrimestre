package Calculadora;

public class Calculadora {

    private int primerNumero;
    private int segundoNumero;

    public Calculadora(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int suma() {
        int resultado = primerNumero + segundoNumero;
        return resultado;

        // 1. Coger el primer num
        //2 . coger el segundo num
        // 3. sumar
        // 4. Comprobar
    }

    public int resta() {
        // Error introducido de forma intencionada para detectarlo con JUnit
        int resultado = primerNumero - segundoNumero;
        return resultado;
    }

    public int multiplica() {
        int resultado = primerNumero * segundoNumero;
        return resultado;
    }

    public int divide() {
        // Error introducido de forma intencionada para detectarlo con JUnit
        if (segundoNumero==0){
            throw new ArithmeticException("División por 0");
        }else {
            int resultado = primerNumero / segundoNumero;
            return resultado;
        }
    }
}


