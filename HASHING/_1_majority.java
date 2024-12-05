package HASHING;

import java.util.*;
public class _1_majority {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
//        int arr[]={1,2};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){   // O(n) --> only the loop runs , rest functions are O(1).             
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }


            // shortcut
            //map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            //the above will put the value as arr[i] if the key doesn't exits and 
            // if it exits it will send the default_value and then increase it by 1 .

        }
        Set<Integer> keys=map.keySet();
        for (Integer key : keys) {
            if(map.get(key)>=(arr.length/3)){
                System.out.println(key);
            }
        }

       

        /* 

        SHORTCUT
        
        for(Integer key:map.keySet()){
            if(map.get(key)>=arr.length/3){
                System.out.println(key);
            }
        }

       */


    }      

}
