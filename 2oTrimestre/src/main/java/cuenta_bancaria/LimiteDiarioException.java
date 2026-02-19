package cuenta_bancaria;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("No se puede superar el límite diario (600€)");
    }
}
