package Tema5;

import java.util.Random;

public class Paciente {

    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO=-1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;

    public Paciente(String nombre,int edad, char genero, double peso, int altura){
        this.nombre=nombre;
        this.edad=edad;
        dni=generarDNI();
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
    }

    public Paciente(){
        this(null,0,DEF_GENERO,0,0);
    }

    private static String generarDNI(){

        String dni = "";

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;

        }

        return dni + letras[Integer.parseInt(dni)%23];
    }

    public  int calcularIMC(){
        double res = peso/Math.pow(altura,2);

        if (res<20){
            return INFRAPESO;
        }else if (res>25){
            return SOBREPESO;
        }else {
            return PESO_IDEAL;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }







}
