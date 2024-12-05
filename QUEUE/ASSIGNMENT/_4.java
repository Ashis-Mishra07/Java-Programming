package QUEUE.ASSIGNMENT;
import java.util.*;
public class _4 {
    public static void custom_reversing(Deque<Integer> q,int upto){
        Deque<Integer> temp=new LinkedList<>();
        for(int i=0;i<upto;i++){
            temp.add(q.remove());
        }
        while(!temp.isEmpty()){
            q.addFirst(temp.remove());
        }

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        custom_reversing(q, 5);
    }
}
