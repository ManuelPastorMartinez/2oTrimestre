package interfaces;

public class Superman extends Superheroe implements Volador,Ataques{

    @Override
    public void volar(){
        System.out.println("Patrullando la ciudad vigilando a los enemigos");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando láser con los ojos!!");
    }

    @Override
    public void alientoHelado() {
        System.out.println("Escupìendo hielos!!");
    }
}
