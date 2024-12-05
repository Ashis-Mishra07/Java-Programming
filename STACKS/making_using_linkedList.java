package STACKS;

import RECURSION.remove_duplicated;

public class making_using_linkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    static class Stack{
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){// pushing is to be done from first coz operation are easier on head node.
            Node newNode =new Node(data);
            size++;
            if(head==null){
                tail=head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            size--;
            int data=head.data;
            head=head.next;
            return data;
        }
        public static int peek(){
            return head.data;
        }
        public static void print(){
            if(head==null){
                System.out.println("null");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
    }
}
