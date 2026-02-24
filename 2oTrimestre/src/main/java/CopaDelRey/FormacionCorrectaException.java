package CopaDelRey;

public class FormacionCorrectaException extends RuntimeException {
    public FormacionCorrectaException() {
        super("La formación del entrenador no es válida");
    }
}
