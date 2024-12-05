package LINKEDLIST;

public class zig_zag {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public static void print() {
        if (size == 0) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node getMid(){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static void zig_zag(){
        Node mid=getMid();
        Node right=mid.next;
        mid.next=null;

        Node newleft=head;
        
        
        Node prev=null;
        Node curr=right;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node newRight=prev;

        Node newNode=new Node(-1);
        Node temp=newNode;
        while(newleft!=null && newRight!=null){
            temp.next=newleft;
            temp=temp.next;
            newleft=newleft.next;

            temp.next=newRight;
            temp=temp.next; 
            newRight=newRight.next;
        }

        while(newleft!=null){
            temp.next=newleft;
            temp=temp.next;
            newleft=newleft.next;
        }
        while(newRight!=null){
            temp.next=newRight;
            temp=temp.next;
            newRight=newRight.next;
        }
    }
    public static void main(String[] args) {
        zig_zag z=new zig_zag();
        z.addFirst(1);
        z.addFirst(2);
        z.addFirst(3);
        z.addFirst(4);
        z.addFirst(5);
    
        z.print();

        z.zig_zag();
        z.print();
    }
}
