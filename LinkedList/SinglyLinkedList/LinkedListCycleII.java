class LinkedListCycleII{
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
    public boolean  listcycleII(){
        Node slow=head;
        Node  fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            
        }
        return false;
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
        LinkedListCycleII obj=new LinkedListCycleII();

        obj.insertHead(4);
        obj.insertHead(0);
        obj.insertHead(3);
        obj.insertHead(2);
        obj.display();

        boolean isCycle=obj.listcycleII();
        System.out.println("Is cycle detedted:"+isCycle);
            
    }
    
}
