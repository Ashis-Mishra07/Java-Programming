package DP._2;

public class _0_1_knapsac_using_tabulation {
    public static int total_profit(int value[],int weight[],int W,int dp[][]){
        for(int i=1;i<value.length+1;i++){
            for(int j=1;j<W+1;j++){
                int val=value[i-1];
                int wt=weight[i-1];
                if(wt<=j){//valid
                    dp[i][j]=Math.max( val + dp[i-1][j-wt]  ,  dp[i-1][j] );
                }
                else{//invalid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[value.length][W]; // the max value will be at the last position 
    }
    public static void main(String[] args) {
        int value[]={15,14,10,45,30};
        int weight[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[value.length+1][W+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(i==0 || j==0){  // these are the base condition when item count=0  and bag weight remain =0;
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }
        System.out.println(total_profit(value, weight, W, dp));
    }
}
