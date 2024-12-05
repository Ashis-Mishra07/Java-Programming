package HASHING;

import java.util.*;
public class _8_subarray_sum_is_k {
    public static void main(String[] args) {

        int arr[] = { 10,2,-2,-20,10 };
        int s=-10;
        // int count=0;
        // for (int i = 0; i < arr.length; i++) {

        //     for (int j = i ; j <= arr.length; j++) {
        //         int sum = 0;
        //         for (int k = i; k < j; k++) {
        //             sum = sum + arr[k];
        //         }
        //         if (sum == s) {
        //             count++;
        //         }
        //     }
        // }
        // System.out.println("total count are "+count);


        HashMap<Integer,Integer> map=new HashMap<>();

        
        int count=0;
        int sum=0;

        map.put(0,1 );
        for(int j=0;j<arr.length;j++){     // O(n)
            sum=sum+arr[j];
            if(map.containsKey(sum-s)){
                count=count+map.get(sum-s);
            }

            // the below can also be wriiten in the form of get or default value 
            // as  map.put(sum,map.getOrDefault(sum, 0)+1);
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        System.out.println(count);

    }
}
