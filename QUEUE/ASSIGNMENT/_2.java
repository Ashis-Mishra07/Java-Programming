package QUEUE.ASSIGNMENT;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class _2 {
    public static int price(int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int size=pq.size();
        for(int i=0;i<size;i++){
            arr[i]=pq.remove();
        }
        
        ArrayList<Integer> sumArr=new ArrayList<>();
        for(int i=1;i<size;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+arr[j];
            }
            sumArr.add(sum);
        }

        int cost=0;
        for(int i=0;i<sumArr.size();i++){
            cost=cost+sumArr.get(i);
        }
        return cost;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        System.out.println(price(arr));
    }
}
