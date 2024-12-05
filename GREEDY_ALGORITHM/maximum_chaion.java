package GREEDY_ALGORITHM;

import java.util.*;

public class maximum_chaion {
    public static void main(String[] args) {
        int arr[][]={ {5,24} , {39,60} , {5,28} , {27,40} , {50,90} };
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        
        int count=1;
        int lastIndex=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>lastIndex){
                count+=1;
                lastIndex=arr[i][1];
            }
        }
        System.out.println(count);
    }
}
