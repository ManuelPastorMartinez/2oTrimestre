package carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona{
    static Scanner teclado = new Scanner(System.in);

    private String empresa;
    private ArrayList<String>armas;

    public Seguridad(int codigo_emp, String nombre, double sueldo,String empresa) {
        super(codigo_emp, nombre, sueldo);
        this.empresa=empresa;
        armas=new ArrayList<>();
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa=empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    public void insertarArmas(String arma){
        armas.add(arma);
    }
    @Override
    public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("La empresa de donde viene el de seguridad es "+empresa);
        System.out.println("Las armas que tiene son: ");
        for (String arma : armas ){
            System.out.print(arma);
        }
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }
}
