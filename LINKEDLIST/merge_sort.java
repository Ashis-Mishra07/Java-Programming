package LINKEDLIST;

public class merge_sort {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static int size;
    public static Node head;
    public static Node tail;

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
    public static Node merge(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node right=slow.next;
        Node left=head;
        slow.next=null;

        Node newLeft=merge(left);
        Node newRight=merge(right);
        return mergeSort(newLeft,newRight);

    }
    public static Node mergeSort(Node newLeft,Node newRight){
        Node mergerLL=new Node(-1);
        while(newLeft!=null && newRight!=null){
            if(newLeft.data<=newRight.data){
                mergerLL.next=newLeft;
                newLeft=newLeft.next;
            }
            else{
                mergerLL.next=newRight;
                newRight=newRight.next;
            }
            mergerLL=mergerLL.next;
        }
        while(newLeft!=null){
            mergerLL.next=newLeft;
            newLeft=newLeft.next;
            mergerLL=mergerLL.next;
        }
        while(newRight!=null){
            mergerLL.next=newRight;
            newRight=newRight.next;
            mergerLL=mergerLL.next;
        }

        return mergerLL.next;
    }
    
    public static void main(String[] args) {
        merge_sort ll = new merge_sort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.merge(head);
        ll.print();
    }
}
