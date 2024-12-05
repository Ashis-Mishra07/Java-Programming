package DP._1;

public class climbing_stairs {
    // stepping up to 5 with step count of 1 2 3 only .
    public static int ways_recursion(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return ways_recursion(n-1)+ways_recursion(n-2)+ways_recursion(n-3);

    }
    public static int ways_recursion_dp(int n){
        int dp[]=new int[n+1];
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=ways_recursion_dp(n-1)+ways_recursion_dp(n-2)+ways_recursion_dp(n-3);
        return dp[n];
    }
    public static int ways_tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
            
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(ways_tabulation(n));
        System.out.println(ways_recursion(n));
        System.out.println(ways_recursion_dp(n));
    }
}
