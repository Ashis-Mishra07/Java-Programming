package HEAPS;

import java.util.*;

public class _8_sliding_window_maximum {
    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            // return this.value-p2.value; --> ascending order
            return p2.value - this.value; // --> descending order
            // the above written will store the value at the 0th index which is greater ... means the greater element is stored at the 0th index
        }
    }

    public static void main(String[] args) {
        /*
          

          int arr[]={1,3,-1,-3,5,3,6,7};
          ArrayList<Integer> arr2=new ArrayList<>();
          int k=4;
          for(int i=0;i<arr.length-k+1;i++){
          int max=Integer.MIN_VALUE;
          for(int j=i;j<i+k;j++){
          if(arr[j]>max){
          max=arr[j];
          }
          
          }
          arr2.add(max);
          }
          for(int i=0;i<arr2.size();i++){
          System.out.println(arr2);
          break;
          }
        
          
         */

        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int newArr[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();  // O(n logk)

        // 1st traversing --> for first k elements
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }


        newArr[0]=pq.peek().value;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().index<=(i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            newArr[i-k+1]=pq.peek().value;
        }


        //result

        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
