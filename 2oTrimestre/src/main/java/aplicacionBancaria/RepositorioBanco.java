package aplicacionBancaria;

public interface RepositorioBanco {
    public double obtenerSaldo(String cuenta);
    public void actualizarSaldo(String cuenta, double nuevoSaldo);
}
