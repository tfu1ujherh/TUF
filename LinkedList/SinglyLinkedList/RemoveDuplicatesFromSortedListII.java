public class RemoveDuplicatesFromSortedListII {
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

    public void removeduplicate() {
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node previous = dummyHead;
        
        while (head != null) {
            boolean isDuplicate = false;
            while (head.next != null && head.data == head.next.data) {
                head = head.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                previous.next = head.next; // Skip the duplicates
            } else {
                previous = previous.next; // Move previous to the next node
            }

            head = head.next; // Move head to the next node
        }

        head = dummyHead.next; // Reset head to the start of the modified list
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
        RemoveDuplicatesFromSortedListII obj = new RemoveDuplicatesFromSortedListII();
        
        obj.insertHead(5);
        obj.insertHead(4);
        obj.insertHead(4);
        obj.insertHead(3);
        obj.insertHead(3);
        obj.insertHead(2);
        obj.insertHead(1);
        obj.display();

        obj.removeduplicate();
        obj.display();
    }
}
