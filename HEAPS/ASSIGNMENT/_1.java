package HEAPS.ASSIGNMENT;

import java.util.*;

public class _1 {
    static class largest implements Comparable<largest> {
        int index;
        int value;

        public largest(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(largest l) {
            return this.value - l.value;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<largest> pq = new PriorityQueue<>();
        int k = 4;
        arr.add(10);
        arr.add(20);
        arr.add(3);
        arr.add(1);
        arr.add(8);
        arr.add(18);
        arr.add(4);
        // arr.add(2);
        // arr.add(6);
        // arr.add(9);
        // arr.add(81);
        // arr.add(5);
        // arr.add(7);

        try {
            for (int i = 0; i < arr.size(); i++) {
                pq.add(new largest(i, arr.get(i)));
            }
            for (int i = 0; i < k - 1; i++) {
                pq.remove();
            }
            System.out.println("the " + k + "th largest value is :" + pq.remove().value);
        } 
        catch (Exception e) {
            System.out.println("length is less than k");
        }

    }
}
