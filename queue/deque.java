package queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        // add, remove/poll peek/element

//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());

            //or

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(2 );
        dq.add(5); // last add
        dq.remove(); // first remove
       // dq.removeAll(dq); // remove everything
        System.out.println(dq);
        dq.removeLastOccurrence(2);
        System.out.println(dq);
    }
}
