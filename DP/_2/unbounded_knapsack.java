package DP._2;

public class unbounded_knapsack {

    //time complexicity is O(n * W)

    public static int maxProfit(int value[],int weight[],int W,int dp[][]){
        for(int i=1;i<value.length+1;i++){
            for(int j=1;j<W+1;j++){
                int wt=weight[i-1];
                int val=value[i-1];
                if(wt<=j){
                    int include=val + dp[i][j-wt];
                    int exclude=dp[i-1][j];

                    dp[i][j]=Math.max(include, exclude);
                }
                else{
                    int exclude=dp[i-1][j];
                    dp[i][j]=exclude;
                }
            }
        }
        
        return dp[value.length][W];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int value[] = { 15, 14, 10, 45, 30 };
        int weight[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int dp[][]=new int[value.length+1][W+1];
        for(int i=0;i<value.length+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        System.out.println(maxProfit(value, weight, W, dp));
        print(dp);
    }
}
