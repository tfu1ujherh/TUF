public class ReverseDoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public void reverse() {
        Node curNode = head;
        Node next = null;
        Node previous = null;

        while (curNode != null) {
            next = curNode.next;
            curNode.next = previous;
            curNode.previous = next; // Update the previous pointer
            previous = curNode;
            curNode = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        ReverseDoublyLinkedList obj= new ReverseDoublyLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.reverse();
        obj.display();
    }
}
