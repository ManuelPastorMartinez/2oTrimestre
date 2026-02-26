package CopaDelRey;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {
        ArrayList<MutxamelFC>listaEquipo=new ArrayList<>();

        JugadorFutbol portero = new JugadorFutbol("Jacobo San Mauro",30,Equipo.SENIOR,1,Posicion.PORTERO);
        JugadorFutbol defensa = new JugadorFutbol("Jorge",2,Equipo.SENIOR,4,Posicion.DEFENSA);
        JugadorFutbol medio = new JugadorFutbol("Joaquin Magnoli",18,Equipo.SENIOR,8,Posicion.CENTROCAMPISTA);
        JugadorFutbol delantero = new JugadorFutbol("Angel Rocamora",25,Equipo.SENIOR,10,Posicion.DELANTERO);
        JugadorFutbol prueba = new JugadorFutbol("Prueba",10,Equipo.SENIOR,1,Posicion.PORTERO);

        listaEquipo.add(portero);
        listaEquipo.add(defensa);
        listaEquipo.add(medio);
        listaEquipo.add(delantero);
        listaEquipo.add(prueba);
        Entrenador manuel = new Entrenador("Manuel Pastor",18,Equipo.SENIOR,"4-3-3");
        listaEquipo.add(manuel);
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
