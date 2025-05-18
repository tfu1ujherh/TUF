public class RotateList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void rotatelist(int n) {
        if (head == null || head.next == null || n == 0) {
            return;
        }

        Node curNode = head;
        int length = 1;

        while (curNode.next != null) {
            length++;
            curNode = curNode.next;
        }
        curNode.next = head; 

        n = n % length;

        curNode = head;
        for (int i = 0; i < length - n - 1; i++) {
            curNode = curNode.next;
        }

        head = curNode.next;
        curNode.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty:");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        RotateList obj = new RotateList();
        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.rotatelist(1);
        obj.display();
    }
}
