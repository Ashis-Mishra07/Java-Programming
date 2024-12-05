package DP._5;

public class mountain_ranges {

    // time complexity is O( n^2 ) ;
    public static int ways(int dp[],int pair){
        for(int i=2;i<dp.length;i++){
            for(int j=0;j<i;j++){
                int inside=dp[j];
                int outside=dp[i-j-1];
                dp[i] += inside*outside;
            }
        }
        return dp[pair];
    }
    public static void main(String[] args) {
        int pair=4;
        int dp[]=new int[pair+1];
        dp[0]=1;
        dp[1]=1;
        System.out.println(ways(dp, pair));
    }
}
