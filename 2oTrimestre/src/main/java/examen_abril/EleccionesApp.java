package examen_abril;

import java.util.*;

public class EleccionesApp {
    static Scanner teclado = new Scanner(System.in);
    private static double matriz[][] = new double[0][0];
    private static LinkedHashSet<Votante> yaHanVotado = new LinkedHashSet<>();
    private static TreeMap<String,Integer> votosPorPueblos = new TreeMap<>();

    static int votoSI = 0;
    static int votoNO = 0;
    public static void main(String[] args) {
        Censo.generarCenso();

        yaHanVotado.add(new Nacional("Agost", "Ana", "11111111A"));
        yaHanVotado.add(new Extranjero("Agost", "John", "X1111111A", "Reino Unido"));
        yaHanVotado.add(new Nacional("Agost", "Luis", "22222222B"));
        yaHanVotado.add(new Nacional("Mutxamel", "Carmen", "33333333C"));
        yaHanVotado.add(new Extranjero("Mutxamel", "Marie", "X2222222B", "Francia"));
        yaHanVotado.add(new Nacional("Mutxamel", "Pedro", "44444444D"));
        yaHanVotado.add(new Extranjero("Mutxamel", "Luca", "X3333333C", "Italia"));
        yaHanVotado.add(new Extranjero("Mutxamel", "Hans", "X4444444D", "Alemania"));
        yaHanVotado.add(new Nacional("Mutxamel", "Miguel", "66666666F"));
        yaHanVotado.add(new Nacional("Alicante", "Sara", "77777777G"));
        yaHanVotado.add(new Extranjero("Alicante", "Emma", "X5555555E", "Irlanda"));
        yaHanVotado.add(new Nacional("Alicante", "David", "88888888H"));
        yaHanVotado.add(new Extranjero("Alicante", "Noah", "X6666666F", "EEUU"));
        yaHanVotado.add(new Nacional("Alicante", "Laura", "99999999I"));
        yaHanVotado.add(new Extranjero("Alicante", "Sofia", "X7777777G", "Portugal"));
        yaHanVotado.add(new Nacional("Alicante", "Carlos", "10101010J"));
        yaHanVotado.add(new Extranjero("Alicante", "Ali", "X8888888H", "Marruecos"));
        yaHanVotado.add(new Nacional("Alicante", "Elena", "12121212K"));
        yaHanVotado.add(new Nacional("Alicante", "Javier", "13131313L"));


        System.out.println("**** ELECCIONES APP ****");

        System.out.println("Introduce la población:");
        String poblacion = teclado.nextLine();

        System.out.println("Empieza la votación en "+poblacion+"!!");

        while (true){
            System.out.println("Introduce el tipo de documento a validar [DNI, NIE] ó SALIR para finalizar la votación:");
            String tipoDocumento=teclado.nextLine();

            if (tipoDocumento.equalsIgnoreCase("salir")){
                break;
            }

            System.out.println("Introduce el número del DNI/NIE que has presentado");
            String documento = teclado.nextLine();

            if (!validarDocumento(tipoDocumento,documento)){
                continue;
            }



            Votante votante;
            if (documento.equalsIgnoreCase("DNI")){
                votante = new Nacional(documento);
            }else {
                votante= new Extranjero(documento,"MUNDO");
            }

            if (!verificarEmpadronamiento(votante)){
                continue;
            }

            if (!comprobarFraude(votante)){
                continue;
            }

            String respuesta ="";

            do {
                votante.votar();
                System.out.println("¿SÍ o NO a la Guerra? [SI, NO]");
                respuesta=teclado.nextLine();
            }while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));

            System.out.println("Respuesta registrada. Gracias. ");

            if (respuesta.equalsIgnoreCase("SI")){
                votoSI++;
            }else {
                votoNO++;
            }

            yaHanVotado.add(votante);
            votante.setVotado(true);
            Censo.borrarVotante(votante);

            int opcion = Votante.encuestaSatisfaccion();
            contabilizarDatosEncuesta(opcion);

        }

        recuento();

    }

    public static boolean validarDocumento(String tipoDocumento,String documento){

        if (tipoDocumento.equalsIgnoreCase("DNI")){
            if (documento.matches("\\d{8}[A-Z]")){
                return true;
            }
        }else if (documento.matches("[A-Z]\\d{7}[A-Z]")){
            return true;
        }

        System.out.println("El DNI/NIE no es correcto");
        return false;
    }

    public static boolean verificarEmpadronamiento(Votante votante){

        for (Votante v: Censo.censo){
            if (v.equals(votante)){
                System.out.println("Votante "+votante.getNombre()+" censado correctamente");
                return true;
            }
        }

        System.out.println("La persona no está empadronada en Mutxamel");
        return false;
    }

    public static boolean comprobarFraude(Votante votante){
        System.out.println("Comprobando datos...");

        if (votante.isVotado()){
            System.out.println(votante.getNombre()+" puede votar");
            votante.setVotado(true);
            return true;
        }

        System.out.println("¡AVISO A LA GUARDIA CIVIL! Intento de doble voto detectado");
        return false;
    }

    public static void contabilizarDatosEncuesta(int opcion){
        switch (opcion){
            case 1:
            matriz[0][0]++;
            break;
            case 2:
                matriz[0][1]++;
                break;

            case 3:
                matriz[0][2]++;
                break;

            case 4:
                matriz[0][3]++;
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Gracias por tu valoración. Nos sirve para mejorar.");
    }

    public static void recuento(){
        imprimirResultadosVotacion();
        imprimirVotosPorPoblacion();
        imprimirExperiencia();
    }

    public static void imprimirResultadosVotacion(){

        System.out.println("--------------------------");
        System.out.println("RECUENTO!");
        System.out.println("Votos SÍ a la guerra: "+votoSI);
        System.out.println("Votos NO a la guerra: "+votoNO);
    }

    public static void imprimirVotosPorPoblacion(){
        System.out.println("-----------------------------");
        System.out.println("Datos de voto (por población): ");

        for (Map.Entry<String,Integer> mapita : votosPorPueblos.entrySet()){
            System.out.println(mapita.getKey()+": "+mapita.getValue());
        }
    }



    public static void imprimirExperiencia(){

    }
}
