package HEAPS.ASSIGNMENT;

import java.util.*;
public class _4 {
    public static int sum(ArrayList<Integer> arr){
        int result=0;
        for(int i=0;i<arr.size();i++){
            result=result+arr.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(8);
        arr.add(19);

        Collections.sort(arr);
        int oriSum=0;
        for(int i=0;i<arr.size();i++){
            oriSum+=arr.get(i);
        }
        
        int newSum=0;
        while(newSum!=(oriSum/2)){
            
        }

    }
}
