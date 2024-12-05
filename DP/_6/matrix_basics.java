package DP._6;

import java.util.Arrays;

public class matrix_basics {
    public static int min_cost(int arr[],int i,int j){
        if(i==j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=min_cost(arr, i, k);
            int cost2=min_cost(arr, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int total=cost1+cost2+cost3;
            min=Math.min(total, min);
        }
        return min;
    }
    public static int min_cost_memo(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            int cost1 = min_cost_memo(arr, i, k, dp);
            int cost2 = min_cost_memo(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j] ;

            int total=cost1+cost2+cost3;

            min=Math.min(min, total);
        }
        return dp[i][j]=min;
    }
    public static void dpPrint(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp.length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        System.out.println(min_cost(arr, 1, arr.length-1));

        int dp[][]=new int[arr.length][arr.length];
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         dp[i][j]=-1;
        //     }
        // }

        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(min_cost_memo(arr, 1, arr.length-1, dp));
        dpPrint(dp);
    }
}
