public class MergeNodeInBetweenZeros {
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
    public void mergeNodes(){
        if(head==null){
            return;
        }
        Node curNode=head.next;
        Node start=head;
        while(start!=null){
            Node end=start;
            int sum=0;
            while(end.data!=0){
                sum=sum+end.data;
                end=end.next;
            }
            start.data=sum;
            start.next=end.next;
            start=start.next;
        }
        head=curNode;

    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        
        MergeNodeInBetweenZeros obj=new MergeNodeInBetweenZeros();

        obj.insertHead(0);
        obj.insertHead(2);
        obj.insertHead(5);
        obj.insertHead(4);
        obj.insertHead(0);
        obj.insertHead(1);
        obj.insertHead(3);
        obj.insertHead(0);
        obj.display();

        obj.mergeNodes();
        obj.display();
    }


}
