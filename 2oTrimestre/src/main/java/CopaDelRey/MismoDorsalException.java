package CopaDelRey;

public class MismoDorsalException extends RuntimeException {
    public MismoDorsalException() {
        super("No se puede crar 2 jugadores con el mismo dorsal");
    }
}
