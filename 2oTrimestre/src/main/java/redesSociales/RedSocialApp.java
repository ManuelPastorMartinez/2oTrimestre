package redesSociales;

public class RedSocialApp {
    public static void main(String[] args) {

        Usuario ana = new Usuario("Ana",30,"@ana",231);

        Influencer luis = new Influencer("Luis",25,"@luis_influencer",5000);
        luis.crearColaboraciones("MediaMarkt");
        luis.crearColaboraciones("Yoigo");
        luis.crearColaboraciones("Temu");
        Streamer carlos = new Streamer("Carlos",27,"@carlos_stream",600,150,2000);

        Basico pedro = new Basico("Pedro",22,"@Pedro123",455);

        System.out.println("Información del usuario: ");
        ana.mostrarInfo();

        System.out.println("Información del influencer: ");
        luis.mostrarInfo();

        System.out.println("Información del streamer: ");
        carlos.mostrarInfo();

        System.out.println("Información de la persona normal: ");
        pedro.mostrarInfo();
    }
}
