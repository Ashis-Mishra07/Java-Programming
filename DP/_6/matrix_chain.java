package DP._6;

public class matrix_chain {
    public static int cost_min(int arr[],int dp[][]){
        int n=dp.length; // arr.length 
        for(int len=2;len<=n-1;len++){  //row motion 
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;    //col motion
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];

                    int totalCost=cost1+cost2+cost3;

                    dp[i][j]=Math.min(dp[i][j] , totalCost);
                }
            }
        }

        //final answrer will get stored in i=1 and j=4 ==> from A1 to A4 ;
        return dp[1][4];
    }
    
    public static void dpPrint(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n=arr.length;
        int dp[][]=new int[n][n];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==j){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }

        System.out.println(cost_min(arr, dp));
        dpPrint(dp);

    }
}
