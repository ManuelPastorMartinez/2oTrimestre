package Tema5;

public class Televisor {
    private int canal=1;
    private int volumen=5;

    public Televisor(){

    }

    public Televisor(int valorCanal, int volumen){
        this.canal=valorCanal;
        this.volumen=volumen;
    }

    public  void subirCanal(int canal){
        if (canal==100) {
             canal=1;
        }else {
            this.canal=canal+1;
        }

    }
    public void bajarCanal(int canal){
        if (canal<0){
            canal=99;
        }else {
            this.canal=canal-1;
        }
    }

    public void subirVolumen(int volumen){
        if (volumen==100){
            volumen=1;
        }else{
            this.volumen=volumen+1;
        }
    }

    public void bajarVolumen(int volumen){
        if (volumen<0){
            volumen=99;
        }else{
            this.volumen=volumen-1;
        }
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int valorCanal){
        this.canal=valorCanal;
    }

    public int getVolumen(){
        return volumen;
    }

    public void setVolumen(int volumen){
        this.volumen=volumen;
    }

    public void imprimirCosas(){
        System.out.println();
    }
}
