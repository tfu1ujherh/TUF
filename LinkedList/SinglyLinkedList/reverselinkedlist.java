public class ReverseLinkedList {
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
    public void reverse(){
        Node curNode=head;
        Node next=null;
        Node previous=null;
        while(curNode!=null){
            next=curNode.next;
            curNode.next=previous;
            previous=curNode;
            curNode=next;
        }
        head=previous;
    }
    public static void main(String[] args) {
        ReverseLinkedList obj=new ReverseLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();


        obj.reverse();
        obj.display();
    }
}
