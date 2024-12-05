package ARRAYLIST;

import java.util.*;

public class maximum_water {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> list1 = new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //list1.add(j - i);
                max=Math.max(Math.abs(j-i)*Math.min(arr[i],arr[j]),max);
                
            }
        }
        System.out.println(max);
    }
}
