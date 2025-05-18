public class ArrayToLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertatTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    public void fromArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insertatTail(arr[i]);
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
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
        int arr[] = {1, 2, 3, 4, 5};
        ArrayToLinkedList obj = new ArrayToLinkedList();
        obj.fromArray(arr);
        obj.display();
    }
}
