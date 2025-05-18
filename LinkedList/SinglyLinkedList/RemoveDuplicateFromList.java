public class RemoveDuplicateFromList {
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

    public void removeduplicates() {
        Node curNode = head;
        while (curNode != null && curNode.next != null) {
            if (curNode.data == curNode.next.data) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
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
        RemoveDuplicateFromList obj = new RemoveDuplicateFromList();

        obj.insertHead(6);
        obj.insertHead(6);
        obj.insertHead(5);
        obj.insertHead(4);
        obj.insertHead(4);
        obj.insertHead(4);
        obj.insertHead(3);
        obj.insertHead(3);
        obj.insertHead(2);
        obj.insertHead(1);
        obj.insertHead(1);
        obj.display();

        obj.removeduplicates();
        obj.display();
    }
}
