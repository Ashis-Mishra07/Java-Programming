package PRIORITY_QUEUE;

import java.util.*;

public class _2_implementing_class {
    static class student implements Comparable<student>{
        String name;
        int roll;
        public student(String name, int roll){
            this.name=name;
            this.roll=roll;
        }

        @Override
        public int compareTo(student s2){
            return this.roll-s2.roll;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        // also can be reversed by adding --> comparator.reverseOrder();
        pq.add(new student("Ashis1", 1));
        pq.add(new student("Ashis3", 3));
        pq.add(new student("Ashis4", 4));
        pq.add(new student("Ashis2", 2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"-->"+pq.peek().roll);
            pq.remove();
        }
    }
}
