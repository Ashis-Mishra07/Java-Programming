package ARRAYLIST.ASSIGNMENT;

import java.util.ArrayList;

public class _3 {
    static int count=0;
    public static void freqeuncy(int arr[],int key){
        int newArr[]=new int[1000];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                newArr[arr[i+1]]++;
            }
        }
        int max=0;
        int count=0;
        for(int i=0;i<newArr.length;i++){
            if(newArr[i]>max){
                max=newArr[i];
                count=i;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={1,200,200,1,200};
        freqeuncy(arr, 1);
    }
}
