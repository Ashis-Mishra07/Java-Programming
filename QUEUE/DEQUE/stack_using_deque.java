package QUEUE.DEQUE;

import java.util.*;
public class stack_using_deque {
    static class Stack{
        static Deque<Integer> deq=new LinkedList<>();
        public static boolean isEmpty(){
            return deq.isEmpty();
        }
        public static void add(int data){
            deq.addFirst(data);
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return deq.remove();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return deq.peek();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        while(!s.isEmpty()){
            System.out.println(s.remove());
        }
    }
}
