package DP._6;

public class minimum_partitioning {
    public static int knapsac(int arr[],int dp[][],int W){
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<W+1;j++){
                int wt=arr[i-1];
                if(wt<=j){
                    dp[i][j]=Math.max(wt+dp[i-1][j-wt], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[arr.length][W];

        // for (int i = 1; i < dp.length; i++) {
        //     for (int j = 1; j < dp[0].length; j++) {
        //         int wt = arr[i - 1];
        //         if (wt <= j) {
        //             dp[i][j] = Math.max(wt + dp[i - 1][j - wt], dp[i - 1][j]);
        //         } else {
        //             dp[i][j] = dp[i - 1][j];
        //         }
        //     }
        // }
        // return dp[arr.length][W];
    }
    public static void main(String[] args) {
        int arr[]={36,-36};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int W=sum/2;
        int dp[][]=new int[arr.length+1][W+1];

        int sum1=knapsac(arr, dp, W);
        int sum2=sum-sum1;

        int differ=Math.abs(sum2-sum1);

        System.out.println("the difference is "+differ);

    }

}
