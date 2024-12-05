package DP._4;

import java.util.*;
public class longest_increasing_subseq {
    public static int lis(int arr[],Object newArr[],int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr[i-1]==(int)newArr[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};

        //making a hashset
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        //System.out.println(set);



        // copying the value of  hashset to an array
        Object newArr[]=set.toArray();

        // or u can do it as this to store the value in an array from an hashset
        /*
         
        int i=0;
        for(int num: set){ // here we have applied the for each loop .
            newArr[i]=num;
            i++;
        }

        */



        // for(int i=0;i<newArr.length;i++){
        //     System.out.println(newArr[i]);;
        // }



        //sorting the array
        Arrays.sort(newArr);



        //making dp
        int dp[][]=new int[arr.length+1][newArr.length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }

        //calling the function
        System.out.println(lis(arr, newArr, dp));
    }
}
