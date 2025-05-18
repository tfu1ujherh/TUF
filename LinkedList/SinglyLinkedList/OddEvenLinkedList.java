public class OddEvenLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertHead(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void oddevenlinkedlist(){
        if(head==null&& head.next==null){
            return;
        }
        Node odd=head;
        Node even=head.next;
        Node evenHead=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
    }
    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        
        OddEvenLinkedList obj=new OddEvenLinkedList();

        obj.insertHead(6);
        obj.insertHead(5);
        obj.insertHead(4);
        obj.insertHead(3);
        obj.insertHead(2);
        obj.insertHead(1);
        System.out.println("Orginal List:");
        obj.display();

        obj.oddevenlinkedlist();
        System.out.println("Odd-Even List:");
        obj.display();
    }
}
