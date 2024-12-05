package LINKEDLIST.ASSIGNMENT;

import java.util.*;

public class assignment {
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

    public static void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    public static void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void evenOdd(LinkedList<Integer> ll) {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        // adding elements in an array
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.data);
            head = head.next;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size() - 1; j++) {
                if (arr.get(j) % 2 != 0 && arr.get(j + 1) % 2 == 0) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        // now adding elements in the Linked List

        ll.addAll(arr);
    }

    public static void swaping(int node1, int node2) {
        if (head == null || head.next == null) {
            System.out.println("cant do the operations");
            return;
        }
        Node start = null;
        Node end = null;
        Node temp = head;
        while (temp.next.data != node1) {
            temp = temp.next;
        }
        start = temp.next;
        temp = head;
        while (temp.next.data != node2) {
            temp = temp.next;
        }
        end = temp.next;
        System.out.println(end.data);
        int data = start.data;
        start.data = end.data;
        end.data = data;
    }

    public static void deleteNodes(int start, int end) {
        try {
            Node temp = head;
            Node temp1 = head;
            while (temp.next.data != start) {
                temp = temp.next;
            }
            while(temp1.data!=end){
                temp1=temp1.next;
            }
            temp.next=temp1.next;
        } catch (Exception e) {
            System.out.println("index not found !!");
        }
    }

    public static void main(String[] args) {
        assignment app = new assignment();
        app.add(1);
        app.add(2);
        app.add(3);
        app.add(4);
        app.add(5);
        app.add(6);
        app.add(7);

        app.print();

        // 4

        // LinkedList<Integer> ll=new LinkedList<>();
        // app.evenOdd(ll);
        // for(int i=0;i<ll.size();i++){
        // System.out.print(ll.get(i)+"->");
        // }
        // System.out.println("null");


        // 3
        // app.swaping(2,4);
        // app.print();


        // 2
        // app.deleteNodes(2, 4);// 1 2 6 7
        // app.print();


        //1
        
    }

}
