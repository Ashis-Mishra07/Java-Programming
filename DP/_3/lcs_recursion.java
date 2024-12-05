package DP._3;

public class lcs_recursion {
    // time complexity is O(2^(n*m)) .
    public static int lcs_recur(String str1,String str2,int n,int m){
        if( n==0 || m==0 ){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
           return lcs_recur(str1, str2, n-1, m-1)  +1;
        }

        else{
            int ans1=lcs_recur(str1, str2, n-1, m);
            int ans2=lcs_recur(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
            
        }
    }
    // timr complexity is O( n * m )
    public static int lcs_memo(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            dp[n][m]=lcs_memo(str1, str2, n-1, m-1, dp)+1;
            return dp[n][m];
        }
        else{
            int ans1=lcs_memo(str1, str2, n-1, m, dp);
            int ans2=lcs_memo(str1, str2, n, m-1, dp);
            dp[n][m]=Math.max(ans1,ans2);

            return dp[n][m];
        }
    }

    public static int lcs_tabulation(String str2,String str1,int n,int m,int dp2[][]){
        
        for(int i=1;i<dp2.length;i++){
            for(int j=1;j<dp2[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp2[i][j]=dp2[i-1][j-1]+1;
                }
                else{
                    dp2[i][j]=Math.max(dp2[i-1][j], dp2[i][j-1]);
                }
            }
        }
        return dp2[n][m];
    }
    public static void main(String[] args) {
        String str1="brute";
        String str2="groot";
        int n=str1.length();
        int m=str2.length();
        // System.out.println(lcs_recur(str1, str2, n, m));



        // int dp[][]=new int[n+1][m+1];
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(lcs_memo(str1, str2, n, m,dp));


        int dp2[][]=new int[n+1][m+1];
        for(int i=0;i<dp2.length;i++){
            for(int j=0;j<dp2[0].length;j++){
                if(i==0 || j==0){
                    dp2[i][j]=0;
                }
                else{
                    dp2[i][j]=-1;
                }
            }
        }
        System.out.println(lcs_tabulation(str2, str1, n, m, dp2));

        for(int i=0;i<dp2.length;i++){
            for(int j=0;j<dp2[0].length;j++){
                System.out.print(dp2[i][j]+" ");
            }
            System.out.println();
        }

        // String newStr="";
        // int length=dp2[str1.length()][str2.length()];
        // int i=str1.length();
        // int j=str2.length();

        // while(i>0 && j>0){
        //     if(str1.charAt(i-1)==str2.charAt(j-1)){
        //         newStr+=str1.charAt(i-1);
        //         i--;
        //         j--;
        //     }
        //     else if(dp[i-1][j]>dp[i][j-1]){
        //         i--;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // System.out.println(newStr);
    }
}
