public class CircularLinkedList {
    Node head;
    Node tail;

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
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertHead(data);
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 0) {
            insertHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode.next == head) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
        if (newNode.next == head) {
            tail = newNode;
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node curNode = head;
            while (curNode.next != tail) {
                curNode = curNode.next;
            }
            curNode.next = head;
            tail = curNode;
        }
    }

    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 0) {
            deleteHead();
            return;
        }
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode.next == head) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        if (curNode.next == head) {
            System.out.println("Position is greater than the length of the list");
            return;
        }
        curNode.next = curNode.next.next;
        if (curNode.next == head) {
            tail = curNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node curNode = head;
        do {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        } while (curNode != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.insertTail(100);
        obj.display();

        obj.insertAtPosition(1000, 2);
        obj.display();

        obj.deleteHead();
        obj.display();

        obj.deleteTail();
        obj.display();

        obj.deleteAtPosition(2);
        obj.display();
    }
}
