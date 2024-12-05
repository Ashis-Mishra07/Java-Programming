package DP._6;

public class absolute_0 {
    public static int knapsac(int arr[],int dp[][],int W){
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<W+1;j++){
                int val=arr[i-1];
                if(val<=j){
                    dp[i][j]=Math.max(val + dp[i-1][j-val], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[arr.length][W];
    }
    public static void main(String[] args) {
        int arr[]={ 1 , 2 , 3 , 4 , 5 };
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        int W=sum/2;
        int dp[][]=new int[arr.length+1][W+1];

        int sum1=knapsac(arr, dp, W);

        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        
        int sum2=sum-sum1;
        
        if(sum1==sum2){
            System.out.println("possible");
        }
        else{
            System.out.println("not possible");
        }
    }
}
