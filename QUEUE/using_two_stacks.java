package QUEUE;

import java.util.Stack;

public class using_two_stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data) {
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    int result = s1.pop();
                    s2.add(result);
                }
                // now here s1 is empty
                s1.add(data);
                while (!s2.isEmpty()) {
                    int result = s2.pop();
                    s1.add(result);
                }
            } else {
                s1.add(data);
            }
        }

        public static int remove() {
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
