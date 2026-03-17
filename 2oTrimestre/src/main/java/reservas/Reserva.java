package reservas;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Objects;

public class Reserva {


    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha_hora;

    public Reserva(Usuario usuario,Pista pista){
        this.usuario=usuario;
        this.pista=pista;
        this.fecha_hora=fecha_hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(pista, reserva.pista) && Objects.equals(fecha_hora, reserva.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha_hora);
    }
}
