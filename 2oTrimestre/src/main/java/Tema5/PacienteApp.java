package Tema5;

public class PacienteApp {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();

        System.out.println(paciente1.getDni());

        Paciente prueba  = new Paciente("Neymar",20,'H',100,16);

        System.out.println(prueba.calcularIMC());
    }
}
