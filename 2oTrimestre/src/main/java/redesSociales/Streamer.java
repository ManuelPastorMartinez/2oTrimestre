package redesSociales;

public class Streamer extends Usuario{
    private int numero_retransmisiones;
    private int horas_directo;
    public Streamer(String nombre, int edad, String nombre_usuario, int seguidores,int numero_retransmisiones,int horas_directo) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.numero_retransmisiones=numero_retransmisiones;
        this.horas_directo=horas_directo;
    }

    public int getNumero_retransmisiones() {
        return numero_retransmisiones;
    }

    public void setNumero_retransmisiones(int numero_retransmisiones) {
        this.numero_retransmisiones = numero_retransmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas: "+numero_retransmisiones);
        System.out.println("Horas directo: "+horas_directo);
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numero_retransmisiones=" + numero_retransmisiones +
                ", horas_directo=" + horas_directo +
                '}';
    }
}
