package STACKS;

import java.util.*;

public class stocks_stays {
    // public static void staying(int arr[]){
    //     int newArr[]=new int[arr.length];
    //     newArr[0]=1;
    //     for(int i=1;i<newArr.length;i++){
    //         int index=i;
    //         for(int j=i;j>=0;j--){
    //             while(arr[j]>arr[index] ){
    //                 index--;
    //             }
                
    //         }
    //         newArr[i]=i-index;
    //     }
    //     for(int i=0;i<newArr.length;i++){
    //         System.out.print(newArr[i]+" ");
    //     }
    // }
    
    public static void staying(int arr[]){
        Stack<Integer> s=new Stack<>();
        int newArr[]=new int[arr.length];
        newArr[0]=1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            while(!s.empty() && curr>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                newArr[i]=i+1;
            }
            else{
                newArr[i]=i-s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        staying(arr);
    }
}
