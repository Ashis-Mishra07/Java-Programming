package HEAPS;

import java.util.*;

public class _6_min_roaps {
    public static void cost(int arr[],ArrayList<Integer>pq,int sum){
        ArrayList<Integer> array=new ArrayList<>();
        while(pq.size()!=1){
            int ele1=pq.remove(1);
            int ele2=pq.remove(0);
            array.add(ele1+ele2);
            pq.add(ele1+ele2);
            Collections.sort(pq);
            
        }
        for(int i=0;i<array.size();i++){
            sum=sum+array.get(i);
        }
        System.out.println("the cost is "+sum);
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,4,6};
        ArrayList<Integer> pq=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        Collections.sort(pq);
        cost(arr, pq,0);
    }
}
