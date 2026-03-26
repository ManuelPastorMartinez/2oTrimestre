package lambdas;

public class Programa {

    public static void main(String[] args) {

        Prueba anonima = new Prueba() {
            @Override
            public String  aprobar(int nota) {
                System.out.println("Aprobando programación desde una anónima con un " +nota);
                if (nota >= 5){
                    return "APROBADO";
                }else {
                    return "AL MIÉRCOLES CON ANÓNIMAS";
                }
            }
        };

        Prueba lambda = ( nota) -> {
            System.out.println("Aprobando programación desde una lambda con un "+nota);
            if (nota >=5){
                return "APROBADO";
            }else {
                return "AL MIÉRCOLES CON LAMBDAS";
            }
        };

        System.out.println(anonima.aprobar(4));
        System.out.println(lambda.aprobar(10));

    }
}
