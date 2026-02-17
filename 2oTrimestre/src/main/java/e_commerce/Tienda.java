package e_commerce;

import java.util.Scanner;

public class Tienda{
    static Scanner teclado = new Scanner(System.in);

    static void iniciarPago(){
        System.out.println("Que método quieres utilizar?");
        System.out.println("1- Tarjeta de crédito");
        System.out.println("2- PayPal");
        System.out.println("3- Bizum");
        String metodo = teclado.next();


        switch (metodo.toLowerCase()){
            case "tarjeta":
                System.out.println("Número de tarjeta (16 dígitos)");
                String numero = teclado.next();

                System.out.println("Tipo de tarjeta (VISA, MASTERCARD, MAESTRO)");
                String tipo = teclado.next();

                TarjetaCredito tarjeta = new TarjetaCredito(numero,tipo);

                if (tarjeta.validarTarjeta()){
                    realizarPago(tarjeta);
                }else {
                    System.out.println("Tipo de tarjeta incorrecto");
                }

                break;
            case "paypal":
                System.out.println("Email PayPal: ");
                String email = teclado.next();

                PayPal paypal = new PayPal(email);

                System.out.println("Importe: ");
                double importeIntroducido = teclado.nextDouble();

                if (paypal.validarPayPal(importeIntroducido)){
                    paypal.procesarPago(importeIntroducido);
                }
                break;

            case "bizum":
                System.out.print("Teléfono (9 dígitos): ");
                String telefono = teclado.next();
                Bizum bizum = new Bizum(telefono);

                System.out.print("Introduce el PIN: ");
                int pin = teclado.nextInt();

                if (bizum.validarBizum(pin)) {
                    realizarPago(bizum);
                }
                break;

            default:
                System.out.println("Método no válido.");

        }
    }


    static void realizarPago(MetodoPago metodo){

        System.out.println("Introduce importe: ");
        double importe = teclado.nextDouble();

        metodo.procesarPago(importe);
    }
}
