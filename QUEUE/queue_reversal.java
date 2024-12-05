package QUEUE;

import java.util.*;
public class queue_reversal {
     
    public static void reversing(Queue<Integer> q){
        int arr[]=new int[q.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=q.remove();
        }
        for(int i=0;i<arr.length;i++){
            q.add(arr[arr.length-i-1]);
        }
    }
    public static void reversing2(Queue<Integer>q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reversing(q);
        reversing2(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
