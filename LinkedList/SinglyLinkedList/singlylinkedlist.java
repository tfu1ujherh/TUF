class SinglyLinkedList {
    Node head = null;

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

    public void insertTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        if (curNode == null) {
            System.out.println("Position is greater than the length of the list");
            return;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        head = head.next;
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curNode = head;
        while (curNode.next.next != null) {
            curNode = curNode.next;
        }
        curNode.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        if (curNode.next == null) {
            System.out.println("Position is greater than the length of the list");
            return;
        }
        curNode.next = curNode.next.next;
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
        SinglyLinkedList obj = new SinglyLinkedList();

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
