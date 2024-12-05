package LINKEDLIST;

public class doubly_linked_list {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            Node next = null;
            Node prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("empty");
            return -1;
        }
        if (size == 1) {
            System.out.println("now it is empty");
            return head.data;
        }
        Node temp = head;
        Node temp2 = head.next;
        head = head.next;
        head.prev = null;

        return temp.data;
    }

    public static int removeLast() {
        if (head == null) {
            System.out.println("already empty");
            return -1;
        }
        if (size == 1) {
            System.out.println("now it is empty");
            return head.data;
        }
        Node temp = tail;
        tail.prev = null;
        Node temp2 = head;
        while (temp2.next != tail) {
            temp2 = temp2.next;
        }
        temp2.next = null;

        return temp.data;

    }

    public static void reverse() {
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void print() {
        if (head == null) {
            System.out.println("empty");
        }
        if (head.next == null) {
            System.out.println("null <-> " + head.data + " <-> null");
        }
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doubly_linked_list dll = new doubly_linked_list();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addLast(6);
        dll.print();
        // System.out.println(dll.removeFirst());;
        // dll.print();
        // System.out.println(dll.removeLast());
        // dll.print();
        dll.reverse();
        ;
        dll.print();
    }
}
