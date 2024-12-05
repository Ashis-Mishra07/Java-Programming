package STACKS;

import java.util.ArrayList;

public class making_using_arraylist {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int ele=list.get(list.size()-1);
            list.remove(list.size()-1);
            return ele;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static void print(Stack s){
            while(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(12);
        s.push(3);
        s.push(51);
        s.push(17);
        s.push(13);
        System.out.println(s.pop());
        
        s.print(s);


    }
}
