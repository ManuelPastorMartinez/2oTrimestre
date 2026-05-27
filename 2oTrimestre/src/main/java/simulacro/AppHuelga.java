package simulacro;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppHuelga {
    static Scanner teclado = new Scanner(System.in);
    private static CentroEducativo centro=new CentroEducativo("IES MUTXAMEL",100,150.95);;

    public static void main(String[] args) {
        centro.generarHuelguistasAleatorios();
        centro.mostrarHuelguistasActuales();
        verSeguimiento();

        Docente docente = validacion();
        System.out.println(docente);

        insertarHuelguista();
        calcularDescuentoSalarial();
        abandonarHuelga();
        listadoConselleria();
        centro.sortearServiciosMinimos();
        centro.limpiarRegistro();
        generarEstadisticas();

    }

    public static void verSeguimiento(){
        if (centro.getHuelguistas().size() != centro.getPlantillaTotal()){
            System.out.println("HUELGA PARCIAL: "+(centro.getPlantillaTotal() - centro.getHuelguistas().size())+" docentes trabajando");
        }else{
            System.out.println("HUELGA TOTAL");
        }
    }

    public static Docente validacion(){
        System.out.println("Introduce el DNI del docente");
        String dni=teclado.nextLine();

        Docente docente = centro.validarDocente(dni);

        if (docente!=null){
            System.out.println("Docente validado correctamente");
            return docente;
        }else {
            System.out.println("El docente no existe como huelguista");
            return new Docente(dni,0,EstadoDocente.ACTIVO);
        }
    }

    public static void insertarHuelguista(){

        Docente docente = validacion();
        if (docente.getDiasHuelga()==0){
            docente.secundar();
            centro.insertarHuelguista(docente);
        }else {
            throw new DocenteEnHuelgaException("El docente ya está en huelga");
        }

        centro.mostrarHuelguistasActuales();
    }

    public static void calcularDescuentoSalarial(){

        Docente docente = validacion();

        if (docente.getDiasHuelga()!=0){
            System.out.println("Dias: "+docente.getDiasHuelga()+". Descuento por día: "+centro.getDescuentoSalarialDiario()+"€");
            System.out.println("Importe a retener: "+(docente.getDiasHuelga()* centro.getDescuentoSalarialDiario())+"€");
        }else {
            System.out.println("El docente no ha hecho huelga. No tiene descuento salarial.");
        }
    }

    public static void abandonarHuelga(){
        System.out.println("Introduce el DNI del docente:");
        String dni = teclado.nextLine();

        for (Docente docente : centro.getHuelguistas()){
            if (docente.getDni().equals(dni)){
                docente.finalizar();
                centro.mostrarHuelguistasActuales();
                return;
            }
        }

        System.out.println("No se ha podido finalizar la huelga. El docente no existe en la lista de huelguistas");
    }

    public static void listadoConselleria(){
        List<Docente> listaHuelguistas = new ArrayList<>(centro.getHuelguistas());
        listaHuelguistas.sort(new CompararDiasPorHuelga().reversed());

        int contador = 1;

        System.out.println("*** LISTADO CONSELLERIA");

        for (Docente docente : listaHuelguistas){
            System.out.println(contador+". DNI: "+docente.getDni()+" - dias huelga: "+docente.getDiasHuelga()+" - estado: "+docente.getEstado());
        }
    }

    public static void generarEstadisticas(){

        double estadisticas[][] = new double[2][3];

        for (Docente docente : centro.getHuelguistas()){

            switch (docente.getEstado()){
                case ACTIVO:
                    estadisticas[0][0]++;
                    break;
                case EN_HUELGA:
                    estadisticas[0][1]++;
                    break;
                case SERVICIOS_MINIMOS:
                    estadisticas[0][2]++;
                    break;
            }
        }

        for (int i = 0; i < estadisticas[0].length ; i++) {
            estadisticas[1][i] = estadisticas[0][i]*100/centro.getHuelguistas().size();
        }

//        estadisticas[1][0] = estadisticas[0][0]*100/centro.getHuelguistas().size();
//        estadisticas[1][1] = estadisticas[0][1]*100/centro.getHuelguistas().size();
//        estadisticas[1][2] = estadisticas[0][2]*100/centro.getHuelguistas().size();

        System.out.println("Estadísticas de seguimiento: ");
        System.out.println("- ACTIVO: " + estadisticas[0][0] + " docentes (" + estadisticas[1][0] + "%)");
        System.out.println("- EN_HUELGA: " + estadisticas[0][1] + " docentes (" + estadisticas[1][1] + "%)");
        System.out.println("- SERVICIOS_MINIMOS: " + estadisticas[0][2] + " docentes (" + estadisticas[1][2] + "%)");
        System.out.println("----------------------------------------------------------");
        System.out.println("Total huelguistas: " + centro.getHuelguistas().size());
    }

}
