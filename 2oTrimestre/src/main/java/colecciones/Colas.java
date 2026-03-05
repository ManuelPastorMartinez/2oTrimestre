package colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {
    public static void main(String[] args) {
        Deque<String> cola = new LinkedList<>();

        cola.offer("Blessd");
        cola.offer("Yatra");
        cola.offer("Morat");
        cola.offer("Shakira");


        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Pirlo");
        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        Queue<String>cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Juan");
        cola2.offer("Jorge");
        cola2.offer("Adrián");

        System.out.println(cola2);
    }
}
