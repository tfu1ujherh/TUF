public class circularlinkedlist {
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

    // Insert at the head of the circular linked list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point the tail to the head to make it circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail's next to point to the new head
        }
    }

    // Insert at the tail of the circular linked list
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point the tail to the head to make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Update tail's next to point to the head
        }
    }

    // Insert at a specific position in the circular linked list
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position cannot be negative");
            return;
        }
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node currNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (currNode.next == head) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        if (currNode == tail) {
            tail = newNode; // Update the tail if new node is inserted at the end
        }
    }

    // Delete the head of the circular linked list
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head; // Update tail's next to point to the new head
        }
    }

    // Delete the tail of the circular linked list
    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node currNode = head;
            while (currNode.next != tail) {
                currNode = currNode.next;
            }
            currNode.next = head;
            tail = currNode; // Update the tail to the new last node
        }
    }

    // Delete a node at a specific position in the circular linked list
    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            deleteHead();
            return;
        }
        Node currNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (currNode.next == head) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            currNode = currNode.next;
        }
        if (currNode.next == tail) {
            tail = currNode; // Update the tail if last node is being deleted
        }
        currNode.next = currNode.next.next;
    }

    // Print the circular linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        circularlinkedlist cll = new circularlinkedlist();
        cll.insertAtHead(1);
        cll.insertAtHead(2);
        cll.insertAtHead(3);
        cll.printList();

        cll.insertAtTail(4);
        cll.printList();

        cll.insertAtPosition(5, 2);
        cll.printList();

        cll.deleteHead();
        cll.printList();

        cll.deleteTail();
        cll.printList();

        cll.deleteAtPosition(1);
        cll.printList();
    }
}
