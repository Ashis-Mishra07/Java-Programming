package ARRAYS.ASSIGNMENT;

import java.util.*;

public class _5 {
    static class files{
        int start;
        int mid;
        int end;
        public files(int start,int mid,int end){
            this.start=start;
            this.mid=mid;
            this.end=end;
        }
    }
    public static void triplet(int arr[]){

        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
       int arr[]={-1,0,1,2,-1,-4};
        triplet(arr);
    }
}




