package lambdas;

@FunctionalInterface
public interface VerificadorVoto {
    public Boolean puedeVotar(Persona persona);
}
