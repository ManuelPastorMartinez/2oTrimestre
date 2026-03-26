package lambdas;

@FunctionalInterface
public interface VerificadorVoto {
    public Boolean puedeVotar(String nombre,int edad);
}
