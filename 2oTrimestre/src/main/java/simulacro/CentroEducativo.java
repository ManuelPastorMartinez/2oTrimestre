package simulacro;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;


@Getter
@Setter
@ToString
public class CentroEducativo {

    static Random random = new Random();
    private String nombre;
    private int plantillaTotal;
    private double descuentoSalarialDiario;
    private HashSet<Docente> huelguistas;

    public CentroEducativo(String nombre, int plantillaTotal, double descuentoSalarialDiario){

        this.nombre=nombre;
        this.plantillaTotal=plantillaTotal;
        this.descuentoSalarialDiario=descuentoSalarialDiario;
        huelguistas= new HashSet<>();
    }

    public void generarHuelguistasAleatorios(){

        int cantidad_docentes = random.nextInt(10)+5;


        for (int i = 0; i < cantidad_docentes; i++) {

            String dni = generarDniAleatorio();

            int dias_huelga = random.nextInt(7)+1;

            huelguistas.add(new Docente(dni,dias_huelga,EstadoDocente.EN_HUELGA));
        }
    }

    public static String generarDniAleatorio(){
        String letras ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        String dni = "";
        for (int i = 0; i < 8; i++) {
            dni+=numeros.charAt(random.nextInt(numeros.length()));
        }

        dni+=letras.charAt(random.nextInt(letras.length()));

        return dni;
    }

    public void mostrarHuelguistasActuales(){
        int contador = 1;

        System.out.println("*** DOCENTES EN HUELGA ***");
        for (Docente docente : huelguistas ){
            System.out.println(contador+". DNI: " + docente.getDni()+" - días huelga: "+docente.getDiasHuelga()+" - estado: "+docente.getEstado());
            contador++;
        }
    }

    public Docente validarDocente(String dni){
        System.out.println("Validando...");

        for (Docente docente : huelguistas){
            if (docente.getDni().equals(dni)){
                return docente;
            }
        }
        return null;
    }

    public void sortearServiciosMinimos(){
        ArrayList<Docente> listaDocentes = new ArrayList<>(getHuelguistas());

        Docente docente = listaDocentes.get(random.nextInt(huelguistas.size()));

        docente.asignarServiciosMinimos();

        System.out.println("Servicios minimos asignados a "+docente);

        mostrarHuelguistasActuales();
    }

    public void limpiarRegistro(){
        System.out.println("Borrando huelguistas activos");
        Iterator<Docente> it = huelguistas.iterator();

        while (it.hasNext()){
            if (it.next().getEstado().equals(EstadoDocente.ACTIVO)){
                it.remove();
            }
        }
        mostrarHuelguistasActuales();
    }

    public void insertarHuelguista(Docente docente){
        huelguistas.add(docente);
    }


}
