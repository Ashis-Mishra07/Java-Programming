package DIVIDE_CONQUER.ASSIGNMENT;

import java.util.*;

public class _2 {
    static class info implements Comparable<info> {
        int node;
        int freq;

        public info(int node, int freq) {
            this.node = node;
            this.freq = freq;
        }

        @Override
        public int compareTo(info i) {
            return i.freq - this.freq;
        }
    }

    public static int maximum_int(int arr[]) {
        PriorityQueue<info> pq = new PriorityQueue<>();
        // frequency arr
        int freq[][] = new int[10][10];
        for (int i = 0; i < freq.length; i++) {
            freq[0][i] = i;
        }
        int k = 0;
        while (k < arr.length) {
            freq[1][arr[k]]++;
            k++;
        }

        for (int i = 0; i < freq.length; i++) {
            pq.add(new info(freq[0][i], freq[1][i]));

        }
        return pq.remove().node;
    }

    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2};
        System.out.println(maximum_int(arr));
        ;

    }
}
