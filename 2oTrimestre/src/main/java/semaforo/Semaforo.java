package semaforo;

import java.util.Scanner;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(){

        Semaforo color_siguiente = null;

        switch (this){
            case ROJO:
                return VERDE;
            case VERDE:
                return AMARILLO;
            case AMARILLO:
                return ROJO;
            default:
                return null;
        }

    }
}
