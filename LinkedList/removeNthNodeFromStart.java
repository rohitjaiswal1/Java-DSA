package LinkedList;

public class removeNthNodeFromStart {
    public static Node deleteNodeFromStart(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i=1;i<=n;i++){
            fast = fast.next;
        }
        if (fast==null){
            head = head.next;
            return head;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        removeNthNodeFromStart.Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(78);
        Node b = new Node(23);
        Node c = new Node(45);
        Node d = new Node(43);
        Node e = new Node(55);
        Node f = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 78 23 45 43 55 34
          display(a);
          a = deleteNodeFromStart(a,6);
          display(a);



    }
}
