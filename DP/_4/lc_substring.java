package DP._4;

public class lc_substring {
    public static int lcs(String str1,String str2,int n,int m,int dp[][]){
        // int ans=0;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    //ans=Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        int max=0;
        int i_index=0;
        int f_index=0;
        for(int k=0;k<dp.length;k++){
            for(int l=0;l<dp[0].length;l++){
                if(dp[k][l]>max){
                    max=dp[k][l];
                    i_index=k;
                    f_index=l;
                }
            }
        }

        return dp[i_index][f_index];
        //return ans;
    }
    public static void main(String[] args) {
        String str1="ABCDGH";
        String str2="ACDGHE";

        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0 ){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }
        System.out.println(lcs(str1, str2, n, m, dp));
    }
}
