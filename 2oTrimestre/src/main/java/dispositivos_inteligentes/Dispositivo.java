package dispositivos_inteligentes;

abstract class Dispositivos {
    private String nombre;
    private boolean estado;

    abstract public void encender();

    abstract public void apagar();

    abstract public void mostrarEstado();
}
