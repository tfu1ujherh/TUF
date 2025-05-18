public class SortLinkedList {
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

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMiddle(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node left, Node right) {
        Node dummyNode = new Node(0);
        Node curNode = dummyNode;

        while (left != null && right != null) {
            if (left.data < right.data) {
                curNode.next = left;
                left = left.next;
            } else {
                curNode.next = right;
                right = right.next;
            }
            curNode = curNode.next;
        }
        if (left != null) {
            curNode.next = left;
        }
        if (right != null) {
            curNode.next = right;
        }

        return dummyNode.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node curNode = head;
            while (curNode != null) {
                System.out.print(curNode.data + "->");
                curNode = curNode.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        SortLinkedList obj = new SortLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.head = obj.sortList(obj.head);
        obj.display();
    }
}
