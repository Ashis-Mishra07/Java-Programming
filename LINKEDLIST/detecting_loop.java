package LINKEDLIST;

public class detecting_loop {
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

    public static void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
    }
    
    public static void print() {
        if (size==0) {
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
    
    public static int removeFirst() {
        if (size==0) {
            System.out.println("already empty");
            return 0;
        }
        if (size == 1) {
            Node temp = head;
            head = tail = null;
            size = 0;
            return temp.data;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }
    public static boolean isCycle(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        if(!isCycle()){
            return ;
        }
        Node slow=head;
        Node fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=head;
        Node temp=null;
        while(slow!=fast){
            temp=fast;
            slow=slow.next;
            fast=fast.next;

        }
        temp.next=null;
        tail=temp;
    }
    public static void main(String[] args) {
        detecting_loop d=new detecting_loop();
        
        d.addlast(1);
        d.addlast(2);
        d.addlast(3);
        d.addlast(4);
        d.addlast(5);
        d.print();
        System.out.println(d.isCycle());
    }
}
