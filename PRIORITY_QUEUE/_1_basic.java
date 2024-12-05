package PRIORITY_QUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1_basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        /* 
        in PQ 
        Comparator.reverseOrder() --> reverse the order of adding the elements in the PQ.
        
        add takes O(log n)
        peek takes O(1)
        remove takes O(log n)
    */ 
        pq.add(23);
        pq.add(22);
        pq.add(35);
        pq.remove();
        System.out.println(pq);
    }
}
