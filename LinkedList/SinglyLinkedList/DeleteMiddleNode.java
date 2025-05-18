public class DeleteMiddleNode {
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

    public void deletemiddle1() {
        if (head == null || head.next == null) {
            return;
        }
        Node previous = head;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = slow.next;
    }

    // Method-2
    public void deletemiddle2() {
        if (head == null || head.next == null) {
            return;
        }
        Node curNode = head;
        int length = 0;
        while (curNode != null) {
            length++;
            curNode = curNode.next;
        }
        int mid = length / 2;
        curNode = head;
        for (int i = 0; i < mid - 1; i++) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return; // Added return statement
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DeleteMiddleNode obj = new DeleteMiddleNode();

        obj.insertHead(6);
        obj.insertHead(2);
        obj.insertHead(1);
        obj.insertHead(7);
        obj.insertHead(4);
        obj.insertHead(3);
        obj.insertHead(1);
        obj.display();

        obj.deletemiddle2();
        obj.display();
    }
}
