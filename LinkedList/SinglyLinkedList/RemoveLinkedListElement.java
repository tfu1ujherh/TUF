public class RemoveLinkedListElement {
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

    public void removeElement(int n) {
        if (head == null) {
            return;
        }
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node curNode = dummyNode;
        while (curNode.next != null) {
            if (curNode.next.data == n) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        head = dummyNode.next;
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
        RemoveLinkedListElement obj = new RemoveLinkedListElement();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.removeElement(50);
        obj.display();
        
        obj.removeElement(30);
        obj.display();
        
        obj.removeElement(10);
        obj.display();
        
        obj.removeElement(100);
        obj.display();
    }
}
