package HEAPS;

import java.util.*;

public class _2_PQ_for_objects {
    static class Student implements Comparable<Student>{
        String name;
        int roll;
        public Student(String name,int roll){
            this.name=name; 
            this.roll=roll;
        }
        @Override
        public int compareTo(Student s2){
            return this.roll-s2.roll;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("a", 1));
        pq.add(new Student("b", 3));
        pq.add(new Student("c", 0));
        pq.add(new Student("d", 2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name);
            pq.remove();
        }

    }
}
