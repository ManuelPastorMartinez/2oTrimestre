package e_commerce;

import java.util.Scanner;

public class Tienda extends MetodoPago{
    static Scanner teclado = new Scanner(System.in);

    static void iniciarPago(){
        System.out.println("Que método quieres utilizar?");
        String metodo = teclado.nextLine();
    }


    static void realizarPago(MetodoPago metodo){
        iniciarPago();

    }

    @Override
    public void procesarPago(double importe) {

    }
}
