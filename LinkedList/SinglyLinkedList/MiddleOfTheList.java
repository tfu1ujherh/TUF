public class MiddleOfTheList {
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

    public Node middleElement() {
        if (head == null) {
            return null;
        }
        Node curNode = head;
        int length = 0;
        while (curNode != null) {
            curNode = curNode.next;
            length++;
        }
        int n = length / 2;
        curNode = head;
        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
        }
        return curNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
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
        MiddleOfTheList obj = new MiddleOfTheList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        Node middle = obj.middleElement();
        if (middle != null) {
            System.out.println("Middle element is: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
