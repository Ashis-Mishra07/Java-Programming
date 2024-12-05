package QUEUE;

public class using_linkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size=0;
    public static boolean isEmpty(){
        return size==0;
    }
    public static void add(int data){
        Node newNode=new Node(data);
        size=size+1;
        if(head==null){
            head=tail=newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("can't remove");
            return -1;
        }
        size=size-1;
        Node temp=head;
        head=head.next;
        return temp.data;
    }
    public static int peek(){
        return head.data;
    }
    public static void main(String[] args) {
        using_linkedList ll=new using_linkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        while(!ll.isEmpty()){
            System.out.println(ll.remove());
        }

    }
}
