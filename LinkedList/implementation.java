package LinkedList;
// Implement a method to insert a node at the end of a linked list.
// Implement a method to insert a node at the start of a linked list.

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //Constructor

            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }
        void inserAtHead(int val){
            Node temp = new Node(val);
            if (head==null){ // empty list
                insertAtEnd(val);
            }
            else { // non empty list
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
         int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
         }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4); // 4
       // ll.display();
        ll.insertAtEnd(5); // 4 -> 5
      //  ll.display();
        //System.out.println(ll.size());
        ll.insertAtEnd(12); //4 -> 5 -> 12
       // ll.display();
        ll.inserAtHead(13); // 13 -> 4 -> 5 -> 12
        ll.display();
        ll.insertAt(2,10);
        ll.display();

    }
}
