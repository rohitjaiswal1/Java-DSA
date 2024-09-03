package LinkedList;

public class doublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){      //Constructor(Isme value assign ki jati hai)
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
             temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(Node random){  //means kisi bhi node pe rahke puri node ko access kar sakte hain.
        Node temp = random;
        // Move this temp backwards to the head
        while (temp.prev!=null){
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;


        display(a);



//        display(a);

//        displayrev(e);

//        displayrandom(c);


    }
}
