package redesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario {

    private ArrayList<String >colaboraciones;
    public Influencer(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
        colaboraciones=new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    public void crearColaboraciones(String colaboracion){
        colaboraciones.add(colaboracion);
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Colaboraciones: ");
        for (String colabo:colaboraciones){
            System.out.println(colabo);
        }
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }
}
