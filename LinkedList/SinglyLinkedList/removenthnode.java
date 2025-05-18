public class RemoveNthNode {
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
    public void remove(int n){
        Node first=head;
        Node second=head;
        for(int i=0;i<n;i++){
            first=first.next;
            if(first==null){
                if(i==n-1){

                head=head.next;
                }
            }
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
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
        RemoveNthNode obj=new RemoveNthNode();

        obj.insertHead(50);
        obj.insertHead(40);
        obj.insertHead(30);
        obj.insertHead(20);
        obj.insertHead(10);
        obj.display();

        obj.remove(3);
        obj.display();
    }
}
