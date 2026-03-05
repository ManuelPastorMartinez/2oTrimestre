package colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2_queue {
    public static void main(String[] args) {
        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Gasolina - Daddy Yankee");
        playlist.offer("Perros salvajes");
        playlist.offer("Dale");
        playlist.offer("Let me love you - Justin Bieber");

        System.out.println("Estado incial de la playlist: "+playlist);
        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: "+playlist.poll());
            System.out.println("Estado de la playlist después de reproducir la canción: "+playlist);
        }
        System.out.println("La playlist ha terminado.");
    }
}
