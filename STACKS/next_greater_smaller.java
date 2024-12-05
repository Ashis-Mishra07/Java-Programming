package STACKS;

import java.util.*;
public class next_greater_smaller {
    public static void nextGreater(int arr[]){
        Stack<Integer> s=new Stack<>();
        int newArr[]=new int[arr.length];
        newArr[newArr.length-1]=-1;
        s.push(arr[arr.length-1]);
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr >= s.peek() ){
                s.pop();
            }
            if(s.isEmpty()){
                newArr[i]=-1;
            }
            else{
                newArr[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= { 1, 3, 2, 4 };
        nextGreater(arr);
        
    }
}
