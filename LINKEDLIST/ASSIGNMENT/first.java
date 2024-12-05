package LINKEDLIST.ASSIGNMENT;

public class first {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public static Node intersection(Node head1,Node head2){
        
        while(head2!=null){
            Node temp=head1;
            while(temp!=null){
                if(head2.data==temp.data){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        first one =new first();

        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        Node newNode=new Node(6);
        head1.next.next.next=newNode;
        head1.next.next.next.next=new Node(7);
        head1.next.next.next.next.next=null;

        Node head2=new Node(4);
        head2.next=new Node(5);
        head2.next.next=newNode;

        Node point=one.intersection(head1, head2);
        if(point==null){
            System.out.println("null");
        }
        else{
            System.out.println(point.data);
        }
        
    }
}
