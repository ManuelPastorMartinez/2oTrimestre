package Tema5;

public class MainTema5 {

    public static void main(String[] args) {
        Bocadillo pepito = new Bocadillo("pepito","Normal","bacon","Bigmac",10);


        pepito.imprimirInfoBocata();

        System.out.println(pepito.getNombre()+" "+pepito.getPrecio()+"€");

        Bocadillo vacio = new Bocadillo();

        vacio.setNombre("chivito");

        vacio.imprimirInfoBocata();


    }
}
