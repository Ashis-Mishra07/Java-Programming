package HEAPS.ASSIGNMENT;

import java.util.*;

public class _5 {
    public static void main(String[] args) {
        int arr1[]={1,3,7};
        int arr2[]={2,4,8};
        int arr3[]={9,10,11};

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            arr.add(arr1[i]);
        }
        for(int i=0;i<arr1.length;i++){
            arr.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            arr.add(arr3[i]);
        }

        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" --> ");
        }
        System.out.println("null");
    }
}
