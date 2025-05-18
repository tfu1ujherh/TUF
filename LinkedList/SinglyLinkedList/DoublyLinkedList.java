public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }

    public void insertHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
        }
    }
    public void insertTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
        newNode.previous=curNode;
    }

    public void insertatPosition(int data,int position){
        Node newNode=new Node(data);
        if(position<0){
            System.out.println("invalid Position");
        }
        if(position==0){
            insertHead(data);
        }
        if(head==null){
            newNode.next=head;
            head.previous=newNode;
            head=newNode;

        }
        Node curNode=head;
        for(int i=0;i<position-1;i++){
            if(curNode==null){
                System.out.println("Position is greater than the length of the list");
            }
            curNode=curNode.next;
        }
        newNode.next=curNode.next;
        curNode.next=newNode;
        curNode.next.previous=newNode;
        newNode.previous=curNode;
    }
    public void deleteHead(){
        if(head==null){
            System.out.println("Linked List is empty");
        }else{
        head=head.next;
        }
    }

    public void deleteTail(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        Node curNode=head;
        while(curNode.next.next!=null){
            curNode=curNode.next;
        }
        curNode.next=null;
    }

    public void deleteatPosition(int position){
        if(position<0){
            System.out.println("Invalid Position");
        }
        if(position==0){
            deleteHead();
        }
        Node curNode=head;
        for(int i=0;i<position-1;i++){
            if(curNode==null){
                System.out.println("Position is greater than the the length of the list");
            }
            curNode=curNode.next;
            if(curNode.next==null){
                System.out.println("Position is greater than the length of the list");
            }
            curNode.next=curNode.next.next;
        }

    }
    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+"<->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();

        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.insertHead(40);
        obj.insertHead(50);
        obj.display();

        obj.insertTail(100);
        obj.display();

        obj.insertatPosition(1000,2);
        obj.display();

        obj.deleteHead();
        obj.display();

        obj.deleteTail();
        obj.display();

        obj.deleteatPosition(2);
        obj.display();
    }
}
