package STACKS;

import java.util.*;

public class reversing {
    
    public static void reverse(Stack<Integer> s){
        ArrayList<Integer> arr=new ArrayList<>();
        while(!s.isEmpty()){
            arr.add(s.pop());
        }
        
        while(!arr.isEmpty()){
            s.push(arr.get(0));
            arr.remove(0);
        }
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int ele=s.pop();
        pushAtBottom(s, data);
        s.push(ele);
    }
    public static void reverse2(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int ele=s.pop();
        reverse2(s);
        pushAtBottom(s, ele);
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // while(!s.isEmpty()){
        //     System.out.print(s.pop()+" "); // 4 3 2 1
        // }
        // System.out.println();
        // reverse(s);
        // while(!s.isEmpty()){
        //     System.out.print(s.pop()+" "); // 1 2 3 4
        // }
        // System.out.println();
        reverse2(s);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" "); // 1 2 3 4
        }
        System.out.println();
    }
}
