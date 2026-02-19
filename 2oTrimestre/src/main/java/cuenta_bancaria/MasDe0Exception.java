package cuenta_bancaria;

public class MasDe0Exception extends RuntimeException {
    public MasDe0Exception() {
        super("La cantidad debe ser mayor que 0");
    }
}
