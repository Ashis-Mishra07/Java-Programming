package DP._3;

public class coin_change {
    //time complexity O( n * sum )
    public static int No_of_ways(int coin[],int sum,int dp[][]){
        for(int i=1;i<coin.length+1;i++){
            for(int j=1;j<sum+1;j++){
                int curr_coin=coin[i-1];
                if(curr_coin<=j){
                    // include or exclude --> calculate its both value
                    dp[i][j] = dp[i][j-curr_coin] + dp[i-1][j];
                               // include            // exclude
                }
                else{
                    dp[i][j]=dp[i-1][j];
                    // exclude 
                }
            }
        }
        return dp[coin.length][sum];
    }
    public static void main(String[] args) {
        int coin[]={2,5,3,6};
        int sum=10;

        int dp[][]=new int [coin.length+1][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=0;
                }
            }
        }

        System.out.println(No_of_ways(coin, sum, dp));
    }
}
