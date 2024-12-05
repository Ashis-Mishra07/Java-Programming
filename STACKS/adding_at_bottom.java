package STACKS;

import java.util.*;

public class adding_at_bottom {
    public static void adding( Stack <Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int ele=s.pop();
        adding(s, data);
        s.push(ele);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int x=4;
        Deque<Integer> q = new LinkedList<>();
        s.push(5);
        s.push(3);
        s.push(1);

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        s.push(x);
        while (!q.isEmpty()) {
            s.push(q.removeLast());
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" "); // 3 <- 2 <- 1 <- 4  4 is pushed at the bottom .
        }
        System.out.println();
    }
}
