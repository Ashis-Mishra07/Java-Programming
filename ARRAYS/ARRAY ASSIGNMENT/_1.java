package ARRAYS.ASSIGNMENT;

import java.util.*;

public class _1 {
    public static boolean isDistinct(int arr[]){
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        if(hash.size()==arr.length){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4};
        if(isDistinct(arr)){
            System.out.println("all distinct ");
        }
        else{
            System.out.println("not all distinct");
        }
    }
}
