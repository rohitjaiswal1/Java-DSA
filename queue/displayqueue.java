package queue;
// Print all the element present in given queue only using add(), remove(), peek.size() & extra queue.

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear-> 5 4 3 2 1 <-front
        System.out.println(q);
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());
        }
        while (helper.size()>0){
            q.add(helper.poll());
        }
    }
}
