package Tema5;

public class Televisor {
    private static final int DEF_CANAL = 1;
    private static final int DEF_VOLUMEN=5;
    private int canal;
    private int volumen;



    public Televisor(int valorCanal, int volumen){
        this.canal=valorCanal;
        this.volumen=volumen;
    }

    public Televisor(){
        canal=DEF_CANAL;
        volumen=DEF_VOLUMEN;
    }

    public  void subirCanal(){
        if (canal==100) {
             canal=1;

        }else {
            canal=canal+1;
        }

        System.out.println("Canal: "+canal);

    }
    public void bajarCanal(){
        if (canal==1 ){
            canal=99;
        }else {
            canal=canal-1;
        }
    }

    public void subirVolumen(){
        if (volumen<100){
            volumen = volumen+1;
        }
        System.out.println("Volumen: "+volumen);
    }

    public void bajarVolumen(){
        if (volumen>=0){
            volumen=volumen-1;
        }

        System.out.println("Volumen: "+volumen);
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

    public void imprimirDatosTelevisor(){
        System.out.println("Canal : "+canal);
        System.out.println("Volumen: "+volumen);
    }
}
