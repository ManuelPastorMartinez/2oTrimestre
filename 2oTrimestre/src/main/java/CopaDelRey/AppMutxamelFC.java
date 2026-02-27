package CopaDelRey;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class AppMutxamelFC {

    /**
     * El main que no pregunta nada, simplemente sirve para hacer pruebas del código manuales y hacer saltar los errores manualmente
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<MutxamelFC>listaEquipo=new ArrayList<>();

        JugadorFutbol portero = null;
        JugadorFutbol defensa = null;
        JugadorFutbol medio = null;
        JugadorFutbol delantero = null;

        try {
            portero = new JugadorFutbol("Jacobo San Mauro", 30, Equipo.SENIOR, 1, Posicion.PORTERO);
            listaEquipo.add(portero);

            defensa = new JugadorFutbol("Jorge Cuartero", 22, Equipo.SENIOR, 4, Posicion.DEFENSA);
            listaEquipo.add(defensa);

            medio = new JugadorFutbol("Joaquin Magnoli", 18, Equipo.SENIOR, 8, Posicion.CENTROCAMPISTA);
            listaEquipo.add(medio);

            delantero = new JugadorFutbol("Angel Rocamora", 25, Equipo.SENIOR, 10, Posicion.DELANTERO);
            listaEquipo.add(delantero);

            JugadorFutbol prueba = new JugadorFutbol("Prueba", 10, Equipo.SENIOR, 1, Posicion.PORTERO);
            listaEquipo.add(prueba);

        } catch (MismoDorsalException e) {
            System.out.println(e.getMessage());
        }
        Entrenador manuel = null;
        Entrenador entrenadorPrueba = null;
        try {
           manuel = new Entrenador("Manuel Pastor", 18, Equipo.SENIOR, "4-3-3");
           listaEquipo.add(manuel);

           entrenadorPrueba = new Entrenador("Prueba",5,Equipo.SENIOR,"4-1-2-3");
           listaEquipo.add(entrenadorPrueba);
       }catch (FormacionCorrectaException e){
           System.out.println(e.getMessage());
       }
        Masajista david = new Masajista("David Andreica",40,"Fisioterapeuta",1);
        Masajista denis = new Masajista("Denis",21,"master",4);
        Masajista gabriel = new Masajista("Gabriel Tortosa",19,"Grado superior de masajes",8);
        listaEquipo.add(denis);
        listaEquipo.add(david);
        listaEquipo.add(gabriel);
        Acompanyante christian = new Acompanyante("Christian Sanchez",40,defensa,"amigo");
        Acompanyante carlos = new Acompanyante("Carlos Huertas",60,portero,"novio");
        listaEquipo.add(christian);
        listaEquipo.add(carlos);

        for (MutxamelFC equipo : listaEquipo){
            equipo.concentrarse();
            if (equipo instanceof Entrenador || equipo instanceof JugadorFutbol){
                ((AccionesDeportivas) equipo).entrenar();
            }
            if (equipo instanceof  Masajista){
                ((Masajista) equipo).darMasaje(delantero.nombre);
            }
            equipo.viajar("Madrid");
            if (equipo instanceof Entrenador){
                ((Entrenador) equipo).planificarEntrenamiento();
            }
            if (equipo instanceof Entrenador || equipo instanceof JugadorFutbol){
                ((AccionesDeportivas) equipo).entrenar();
            }
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).descansar();
                ((JugadorFutbol) equipo).calentar();
            }

            if(equipo instanceof JugadorFutbol ||equipo instanceof Entrenador){
                ((AccionesDeportivas) equipo).jugarPartido("Madrid");
            }
            if (equipo instanceof Acompanyante){
                ((Acompanyante) equipo).animarEquipo();
            }
            if (equipo instanceof Entrenador){
                ((Entrenador) equipo).hacerCambios();
            }
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).marcarGol();
            }
            equipo.celebrarGol();

            if (equipo instanceof Masajista){
                ((Masajista) equipo).darMasaje(defensa.nombre);
                ((Masajista) equipo).darMasaje(medio.nombre);
                ((Masajista) equipo).darMasaje(portero.nombre);
            }
            equipo.viajar("Mutxamel");
            if (equipo instanceof JugadorFutbol){
                ((JugadorFutbol) equipo).descansar();
            }
        }


    }
}
