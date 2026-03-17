package reservas;

public class ReservaDuplicada extends RuntimeException {
    public ReservaDuplicada(String message) {
        super(message);
    }
}
