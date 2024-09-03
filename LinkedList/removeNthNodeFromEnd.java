package LinkedList;
// Remove the nth node from end of linked list.
// Remove the 2nd node from end of linkes list.

public class removeNthNodeFromEnd {
    public static void deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(99);
        Node b = new Node(87);
        Node c = new Node(76);
        Node d = new Node(54);
        Node e = new Node(65);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // 99 87 76 54 65 12
        display(a);
        deleteNthFromEnd(a,2);
        display(a);

    }
}
