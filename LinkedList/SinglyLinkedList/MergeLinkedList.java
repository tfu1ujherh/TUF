public class MergeLinkedList {
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
    
    public Node mergeLinkedList(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node curNode = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                curNode.next = list1;
                list1 = list1.next;
            } else {
                curNode.next = list2;
                list2 = list2.next;
            }
            curNode = curNode.next;
        }
        if (list1 != null) {
            curNode.next = list1;
        } else {
            curNode.next = list2;
        }
        return dummyHead.next;
    }
    
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        MergeLinkedList list1 = new MergeLinkedList();
        MergeLinkedList list2 = new MergeLinkedList();
        
        System.out.println("List1:");
        list1.insertHead(80);
        list1.insertHead(60);
        list1.insertHead(40);
        list1.insertHead(30);
        list1.insertHead(20);
        list1.display();
        
        System.out.println("List2:");
        list2.insertHead(90);
        list2.insertHead(70);
        list2.insertHead(50);
        list2.insertHead(10);
        list2.display();
        
        MergeLinkedList mergedList = new MergeLinkedList();
        mergedList.head = mergedList.mergeLinkedList(list1.head, list2.head);
        
        System.out.println("Merged List:");
        mergedList.display();
    }
}
