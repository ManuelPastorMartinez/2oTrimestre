package cuenta_bancaria;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("No tienes saldo suficiente para hacer la operación");
    }
}
