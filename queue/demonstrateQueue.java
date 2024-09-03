package queue;

import java.util.LinkedList;
import java.util.Queue;

public class demonstrateQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add element {0,1,2,3,4} to the queue
        for (int i=0; i<5; i++)
            q.add(i);

        //Display contents of the queue.
        System.out.println("Element of queue " +q);

        //to remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" +removedele);

        System.out.println(q);

        //to view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" +head);

        int size = q.size();
        System.out.println("Size of queue-" +size);
    }
}
