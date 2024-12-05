package DP._5;

public class wildcart_matching {
    public static boolean matching(String str1, String str2, boolean dp[][]) {
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1) || str2.charAt(j - 1) == '?') {
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(str2.charAt(j-1)=='*'){
                    dp[i][j]=( dp[i-1][j] || dp[i][j-1] );
                    // dp[i-1][j]= * remain intact  e.g. str1=aaa str2=a*
                    // dp[i][j-1]= * ignored  e.g. str1=a  str2=a*
                }
                else{//character not matches return false ovio .
                    dp[i][j]=false;
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        String str1="baaabab";
        String str2="*****ba*****ab";

        // String str1 = "abcd";
        // String str2 = "*";

        boolean dp[][] = new boolean[str1.length() + 1][str2.length() + 1];

        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = false;
        }
        
        //if i=0 ;
        for (int j = 1; j < dp[0].length; j++) {
            if (str2.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            } 
            // else {
            //     dp[0][j] = false;
            // }
        }

        System.out.println(matching(str1, str2, dp));

    }
}
