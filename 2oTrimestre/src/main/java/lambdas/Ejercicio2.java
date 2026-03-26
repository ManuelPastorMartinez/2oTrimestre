package lambdas;

public class Ejercicio2 {
    public static void main(String[] args) {
        VerificadorVoto verificar = new VerificadorVoto() {
            @Override
            public Boolean puedeVotar(String nombre, int edad) {
                System.out.print("Probando "+nombre+" con "+edad+" años... ");
                if (edad<18){
                    return false;
                }else {
                    return true;
                }
            }
        };

        System.out.println(verificar.puedeVotar("Maria",14));
        System.out.println(verificar.puedeVotar("Manuel",18));
    }
}
