package interfaces;

public class Spiderman extends Superheroe implements Volador {
    @Override
    public void volar() {
        System.out.println("Saltando edificios con la tela de araña");
    }
}
