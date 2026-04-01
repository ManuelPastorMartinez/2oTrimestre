package ticketmutxa;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Evento {

    protected String nombre;
    protected LocalDate fecha;
    protected double precio;

    public Evento(String nombre, LocalDate fecha, double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public LocalDate getFecha() { return fecha; }
    public double getPrecio() { return precio; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return nombre.equals(evento.nombre) && fecha.equals(evento.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }
}
