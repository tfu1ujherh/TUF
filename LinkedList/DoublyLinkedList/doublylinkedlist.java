public class doublylinkedlist {
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

    // Insert at the head of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    // Insert at the tail of the list
    public void insertAtTail(int data) {
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
        newNode.previous = curNode;
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        if (position < 0) {
            System.out.println("Position cannot be negative");
            return;
        }
        Node newNode = new Node(data);
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        if (curNode.next != null) {
            curNode.next.previous = newNode;
        }
        curNode.next = newNode;
        newNode.previous = curNode;
    }

    // Delete the head of the list
    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
        }
    }

    // Delete the tail of the list
    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) { // Single node case
            head = null;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.previous.next = null; // Update second-last node's next pointer
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (position < 0) {
            System.out.println("Position cannot be negative");
            return;
        }
        if (position == 0) {
            deleteHead();
            return;
        }
        Node curNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (curNode == null || curNode.next == null) {
                System.out.println("Position is greater than the length of the list");
                return;
            }
            curNode = curNode.next;
        }
        if (curNode.next == null) { // Last position
            deleteTail();
            return;
        }
        curNode.next = curNode.next.next;
        if (curNode.next != null) {
            curNode.next.previous = curNode;
        }
    }

    // Display the elements of the list
    public void displayList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }


    public void reverse(){

        Node curNode=head;
        Node previous=null;
        while(curNode!=null){
            Node curNext=curNode.next;
            curNext.next=previous;
            curNode=curNext;
        }
        head=previous;
    }

    public static void main(String[] args) {
        doublylinkedlist obj = new doublylinkedlist();
        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.insertAtHead(30);
        obj.insertAtTail(40);
        obj.insertAtPosition(25, 2);
        System.out.println("List after insertions:");
        obj.displayList();

        obj.deleteHead();
        System.out.println("List after deleting the head:");
        obj.displayList();

        obj.deleteTail();
        System.out.println("List after deleting the tail:");
        obj.displayList();

        obj.deleteAtPosition(1);
        System.out.println("List after deleting at position 1:");
        obj.displayList();


        System.out.println("Reverse List");


        obj.reverse();
        obj.displayList();
    }
}
