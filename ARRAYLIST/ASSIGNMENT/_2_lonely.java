package ARRAYLIST.ASSIGNMENT;

import java.util.*;

public class _2_lonely {
    static ArrayList<Integer> newArr2=new ArrayList<>();
    public static void lonely(ArrayList<Integer> arr){
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1) && arr.get(i)+1 != arr.get(i+1) && arr.get(i)-1 != arr.get(i+1)){
                newArr2.add(arr.get(i));
            }
        }
        int curr=arr.get(arr.size()-1);
        boolean b=true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==curr || arr.get(i)+1 == curr || arr.get(i)-1 ==curr){
                b=false;
                break;
            }
        }
        if(b){
            newArr2.add(curr);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> newArr=new ArrayList<>();
        newArr.add(10);
        newArr.add(6);
        newArr.add(5);
        newArr.add(8);
        
        lonely(newArr);
        System.out.println(newArr2);
    }
}
