package LINKEDLIST;

import java.util.ArrayList;

public class making {
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

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = null;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static void print() {
        if (isEmpty()) {
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

    public static void addMiddle(int index, int data) {
        Node node = new Node(data);
        size++;
        if (isEmpty()) {
            node = head = tail;
        }
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            i++;
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public static int size() {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count + 1;
    }

    public static int removeFirst() {
        if (isEmpty()) {
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

    public static int removeLast() {
        if (isEmpty()) {
            System.out.println("empty");
            return 0;
        }
        if (size == 1) {
            size = 0;
            int data = head.data;
            head = tail = null;
            return data;
        }
        int data = tail.data;
        Node temp = head;
        size--;
        for (int i = 0; i < size() - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;
        return data;
    }

    public static int iterativeSearch(int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) {
                return count;
            }
            count++;
            temp = temp.next;

        }
        return -1;
    }

    public static int helper(Node head, int key, int index) {
        if (head.data == key) {
            return index;
        }
        if (index == size - 1) {
            return -1;
        }
        return helper(head.next, key, index + 1);
    }

    public static int recursionSearch(int key, int index) {
        return helper(head, key, index);
    }

    public static void reverse() {
        Node prev = null;// head prev is null here so assigned it as prev as null value .
        Node curr = tail = head;
        Node next; // not assigning here making it inside the loop .
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // becoz curr is now null so its prev is now its head as it is reversed .
    }

    public static int removeFromEnd(int index) {
        if (size() == 0 || index > size()) {
            return -1;
        }
        if (size() == 1 && index != 0) {
            return -1;
        }
        if (size() == 1 && index == 0) {
            Node temp = head;
            size = 0;
            head = tail = null;
            return temp.data;
        }

        Node temp = head;
        for (int i = 0; i < size() - index - 2; i++) {
            temp = temp.next;
        }
        int data = temp.data;
        temp.next = temp.next.next;
        return data;
    }

    public static boolean pallindrome() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        for (int i = 0; i < arr.size() / 2; i++) {
            if (arr.get(i) != arr.get(arr.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static Node findMid() {
        /*
        
        if(head==null){
            return null;
        }
        Node temp=head;
        for(int i=0;i<size()/2;i++){
            temp=temp.next;
        }
        return temp;
        
        */
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean pallindrome_new(){
        if(head==null || head.next==null){
            return false;
        }
        Node mid=findMid();

        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        making ll = new making();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(2);
        ll.addMiddle(2, 3);
        ll.addMiddle(3, 1);
        ll.addFirst(2);
        ll.addLast(2);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // System.out.println(size()); // or can be ll.size()
        // System.out.println(ll.removeLast());;
        // ll.print();
        // System.out.println(size());;
        // System.out.println(iterativeSearch(10));
        // System.out.println(recursionSearch(10, 0));
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.removeFromEnd(3));
        // ll.print();
        // System.out.println(pallindrome());;
        ll.print();
        System.out.println(ll.pallindrome_new());

    }
}
