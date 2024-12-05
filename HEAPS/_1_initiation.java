package HEAPS;

import java.util.*;

public class _1_initiation {
    public static void main(String[] args) {
        // PriorityQueue <Integer> pq=new PriorityQueue<>();
        PriorityQueue <Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(3);
        pq.add(5);
        pq.add(4);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" "); // 1 2 3 4 5
            pq.remove();
        }
    }
}
