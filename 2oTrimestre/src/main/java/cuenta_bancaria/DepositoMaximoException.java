package cuenta_bancaria;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("No se ha podido realizar la operación, supera el límite de ingreso (3000€).");
    }
}
