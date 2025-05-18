public class SearchAnElement{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(int target) {
        Node curNode = head;
        while (curNode != null) {
            if (curNode.data == target) {
                return true;
            }
            curNode = curNode.next;
        }
        return false;
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
        SearchAnElement obj = new SearchAnElement();

        obj.insertAtHead(10);
        obj.insertAtHead(20);
        obj.insertAtHead(30);
        obj.insertAtHead(40);
        obj.insertAtHead(50);
        obj.display();

        if (obj.search(10)) {
            System.out.println("Element is found in the list");
        } else {
            System.out.println("Element is not found in the list");
        }

        if (obj.search(60)) {
            System.out.println("Element is found in the list");
        } else {
            System.out.println("Element is not found in the list");
        }
    }
}
