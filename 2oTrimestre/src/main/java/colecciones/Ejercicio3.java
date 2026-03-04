package colecciones;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String expresion=teclado.nextLine();

        if (esBalanceado(expresion)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i <expresion.length() ; i++) {

            if (expresion.charAt(i)=='('){
                pila.push('(');
            }else if (expresion.charAt(i)==')'){
                if (pila.contains('(')){
                    pila.pop();
                }else {
                    return false;
                }
            }


        }
    if (pila.isEmpty()){
        return true;
    }else {
        return false;
    }

    }
}
