package excepciones;

import com.sun.jdi.VMCannotBeModifiedException;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    public static void main(String[] args) {

        int edad = 15;

        if (edad<18){
            throw new EdadValida("Edad no peritida");
        }


    }
}
