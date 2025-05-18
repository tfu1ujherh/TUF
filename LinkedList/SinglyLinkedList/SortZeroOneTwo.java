public class SortZeroOneTwo {
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
    public void sort(){
        Node curNode=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while(curNode!=null){
            if(curNode.data==0){
                count0++;
            }
            if(curNode.data==1){
                count1++;
            }
            if(curNode.data==2){
                count2++;
            }
            curNode=curNode.next;

        }
        curNode=head;
        while(count0>0){
            curNode.data=0;
            curNode=curNode.next;
            count0--;
        }
        while(count1>0){
            curNode.data=1;
            curNode=curNode.next;
            count1--;
        }
        while(count2>0){
            curNode.data=2;
            curNode=curNode.next;
            count2--;
        }
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
        
        SortZeroOneTwo obj=new SortZeroOneTwo();
        obj.insertHead(1);
        obj.insertHead(2);
        obj.insertHead(1);
        obj.insertHead(0);
        obj.insertHead(1);
        obj.insertHead(0);
        obj.insertHead(2);
        obj.insertHead(0);
        obj.insertHead(0);
        obj.insertHead(1);
        obj.insertHead(2);
        obj.insertHead(0);
        System.out.println("Orginal List:");
        obj.display();

        obj.sort();
        System.out.println("Sorted List");
        obj.display();
    }
    
}
