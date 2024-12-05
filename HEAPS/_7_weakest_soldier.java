package HEAPS;

import java.util.*;
public class _7_weakest_soldier {
    static class weak_soldier implements Comparable<weak_soldier>{
        int count;
        int index;
        public weak_soldier(int count,int index){
            this.count=count;
            this.index=index;
        }

        @Override
        public int compareTo(weak_soldier s){
            if(this.count==s.count){
                return this.index-s.index;
            }
            return this.count-s.count;
        }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 }, { 1, 1, 0, 0} };;
        PriorityQueue<weak_soldier> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count = count + 1;
                }
            }
            pq.add(new weak_soldier(count, i));
            
        }
        int k=3;
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().index);
        }
    }
}
 