package Tema5;

import java.util.Scanner;

public class PacienteApp {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();

        System.out.println(paciente1.getDni());

        Paciente prueba  = new Paciente("Neymar",20,'H',56,166);

        System.out.println(prueba.calcularIMC());

        System.out.println(paciente1.esMayorDeEdad());

        if (paciente1.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }

        Paciente pepe = new Paciente("Pepe",80,'G',40,160);

        System.out.println(pepe.getGenero());

        System.out.println(paciente1);
        porDefecto();
        pedirVariables();



    }

    public static void pedirVariables(){
        System.out.println("¿Cuál es el nombre del paciente?");
        String nombre = teclado.next();

        System.out.println("¿Cuál es la edad de "+nombre+"?");
        int edad = teclado.nextInt();
        System.out.println("Cuál es el género de "+nombre+"?");
        char genero = teclado.next().charAt(0);
        System.out.println("Cuál es el peso de "+nombre+"?");
        double peso = teclado.nextDouble();
        System.out.println("Cuál es la altura de "+nombre+"?");
        int altura = teclado.nextInt();
        Paciente persona1 = new Paciente(nombre,edad,genero,peso,altura);
        persona1.imprimirPacientes();
    }

    public static void porDefecto(){
        Paciente persona2 = new Paciente();
        persona2.setNombre("Manuel");
        persona2.setEdad(18);
        persona2.setAltura(163);
        persona2.setPeso(75.5);
        persona2.imprimirPacientes();
    }


}
