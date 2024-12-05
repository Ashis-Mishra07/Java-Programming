package DP._5;

public class counting_trees {
    //time complexity is O( n^2 )
    public static int count(int l, int dp[]) {
        for (int i = 2; i <= l; i++) {
            for (int j = 0; j < i; j++) {
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[l];
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int l = arr.length;
        int dp[] = new int[arr.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        System.out.println(count(l, dp));
    }
}
