

class Node {
    int data;
    Node next;
    Node prev;

    public Node(Node prev,int data,Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDoublyLL {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverseDoublyLL(Node head) {
        Node current = head;
        Node temp = null; // A pointer which will always be behind current
        
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev; //because the old next is now new prev
        }

        if (temp != null) head = temp.prev;
        System.out.println("Linked List Reversed Successfully");
        return head;
    }
    public static void main(String []args) {
        Node head = new Node(5);
        // head.next = new Node(10);
        // head.next.prev = head;
        // head.next.next = new Node(15);
        // head.next.next.prev = head.next;
        System.out.println("Printing Linked List :-");
        printLL(head);
        System.out.println("Reversing Linked List :-");
        head =  reverseDoublyLL(head);
        System.out.println("Printing Linked List After Reversal :-");
        printLL(head);
    }    
}
