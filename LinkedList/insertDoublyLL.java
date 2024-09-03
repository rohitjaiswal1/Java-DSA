package LinkedList;

public class insertDoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){ //Constructor
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
    public static Node insertAtHead(Node head, int x){
        //Insertion at head in doubly linklist.
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        //Insertion at tail in doubly linklist.
        Node temp = head;
        //temp ko tail tak leke jaate hai
        while (temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void inserAtIdx(Node head, int idx, int x){
        //INsertion at any/middle index in doubly linklist.
        Node s = head;
        for (int i=1;i<=idx-1;i++){
            s = s.next;
        }
        // s is at idx-1 position
        Node r = s.next; //idx
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void main(String[] args) {
        // 5 11 24 99 13
        Node a = new Node(5);
        Node b = new Node(11);
        Node c = new Node(24);
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

        Node newHead = insertAtHead(a,35);
        display(newHead);


//        insertAtTail(a,90);
//        display(a);

//        inserAtIdx(a,3,56);
//        display(a);

    }
}
