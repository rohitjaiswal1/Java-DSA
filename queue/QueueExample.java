package queue;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        //add element to the queue
        q.add("apple");
        q.add("banana");
        q.add("cherry");

        //print the queue
        System.out.println("Queue: " + q);

        //remove the element at the front of the queue
        String front = q.remove();
        System.out.println("Remove element: " + front);

        //print the updated queue
        System.out.println("Queue after removal: " +q);

        // add another element to the queue
        q.add("date");
        System.out.println(q);

        //peek at the element at the front of the queue
        String peeked = q.peek();
        System.out.println("Peeked element: " + peeked);

        //print the updated queue
        System.out.println("Queue after peek: " + q);

    }
}
