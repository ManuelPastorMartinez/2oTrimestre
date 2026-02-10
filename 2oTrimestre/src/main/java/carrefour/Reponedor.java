package carrefour;

import java.util.Scanner;

public class Reponedor extends Persona {
    static Scanner teclado = new Scanner(System.in);
    private String pasillo;

    public Reponedor(int codigo_emp, String nombre, double sueldo,String pasillo) {
        super(codigo_emp, nombre, sueldo);
        this.pasillo=pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo=pasillo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El reponedor está asginado al pasillo "+pasillo);
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }
}
