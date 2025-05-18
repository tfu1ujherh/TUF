class AddTwoNumbers{
    Node head;
    static class Node{
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

    public static Node addTwoNumbers(Node list1,Node list2){
        Node dummyHead=new Node(0);
        Node curNode=dummyHead;
        int carry=0;
        Node p=list1;
        Node q=list2;
        while(p!=null || q!=null){
            int x=0;
            int y=0;
            if(p!=null){
                x=p.data;
                p=p.next;
            }
            if(q!=null){
                y=q.data;
                q=q.next;
            }

            int sum =x+y+carry;
            carry=sum/10;

            curNode.next=new Node(sum%10);
            curNode=curNode.next;
        }
        if(carry>0){
            curNode.next=new Node(carry);
        }
        return  dummyHead.next;
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
        AddTwoNumbers list1=new AddTwoNumbers();
        AddTwoNumbers list2=new AddTwoNumbers();

        list1.insertHead(5);
        list1.insertHead(3);
        list1.display();

        list2.insertHead(9);
        list2.insertHead(9);
        list2.insertHead(5);
        list2.insertHead(4);
        list2.display();

        AddTwoNumbers newlist=new AddTwoNumbers();
        Node result=addTwoNumbers(list1.head, list2.head);
        while(result!=null){
            newlist.insertHead(result.data);
            result=result.next;
        }

        newlist.display();
    }
}