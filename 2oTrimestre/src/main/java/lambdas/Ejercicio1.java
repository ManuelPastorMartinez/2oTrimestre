package lambdas;

public class Ejercicio1 {

    public static void main(String[] args) {
        Ejecutor ejecutor = (numero)->{
            System.out.println("Comparando para "+numero+":");
            if (numero>10) {
                return true;
            }
            else {
                return false;
            }

        };

        System.out.println(ejecutor.ejecutar(15));
        System.out.println(ejecutor.ejecutar(5));
        System.out.println(ejecutor.ejecutar(10));
    }
}
