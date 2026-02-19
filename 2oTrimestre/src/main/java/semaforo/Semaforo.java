package semaforo;

import java.util.Scanner;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(){
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
