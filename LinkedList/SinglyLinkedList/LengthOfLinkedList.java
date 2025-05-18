public class LengthOfLinkedList {
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

    public int length() {
        int count = 0;
        Node curNode = head;
        while (curNode != null) {
            count++;
            curNode = curNode.next;
        }
        return count;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
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
        LengthOfLinkedList obj = new LengthOfLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        int length = obj.length();
        System.out.println("Length of the linked list: " + length);
    }
}
