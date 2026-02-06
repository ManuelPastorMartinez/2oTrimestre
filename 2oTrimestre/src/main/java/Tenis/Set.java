package Tenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;


    public Set(int puntosJ1,int puntosJ2){
        controlarPuntuacion(puntosJ1,puntosJ2);
        this.puntosJ1=puntosJ1;
        this.puntosJ2=puntosJ2;
    }

    public boolean controlarPuntuacion(int puntosJ1,int puntosJ2){
        if (puntosJ1<0 || puntosJ2<0){
            System.out.println("La puntuación de los jugadores no es válida: "+puntosJ1+" - "+puntosJ2);
            return false;
        }

        if ((puntosJ1==6 && puntosJ2<=4)||(puntosJ2==6 && puntosJ1<=4)){
            System.out.println(puntosJ1+" - "+puntosJ2);
            return true;
        }

        if ((puntosJ1==7 && (puntosJ2==6 || puntosJ2==5)) ||(puntosJ2==7 && (puntosJ1==6 || puntosJ1==5))){
            System.out.println(puntosJ1+" - "+puntosJ2);
            return true;
        }

        System.out.println("La puntuación de los jugadores no es válida: "+puntosJ1+" - "+puntosJ2);
        return false;
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntosJ1=" + puntosJ1 +
                ", puntosJ2=" + puntosJ2 +
                '}';
    }

}
