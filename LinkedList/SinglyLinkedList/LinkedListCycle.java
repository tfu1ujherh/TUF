public class LinkedListCycle {
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

    public boolean listcycle() {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
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
        LinkedListCycle obj = new LinkedListCycle();

        obj.insertHead(50);
        obj.insertHead(40);
        obj.insertHead(30);
        obj.insertHead(20);
        obj.insertHead(10);
        obj.display();

        boolean hasCycle = obj.listcycle();
        System.out.println("Cycle detected: " + hasCycle);
    }
}
