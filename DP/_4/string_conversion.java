package DP._4;

public class string_conversion {
    public static int steps(String str1,String str2,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{

                    int addition=dp[i][j-1] +1;
                    int deletion=dp[i-1][j] +1;
                    dp[i][j]=Math.min(addition, deletion);
                    
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }




    public static int lcs(String str1,String str2,int dp[][]){
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    public static int steps2(String str1,String str2,int dp[][]){

        int lcs_value=lcs(str1, str2, dp);
        int count1=str1.length()-lcs_value; // this will count the total nodes that has to be deleted .
        int count2=str2.length()-lcs_value; // this will count the no of nodes that has to get added .

        return count1+count2;

    }
    public static void main(String[] args) {
        String str1="abcdef";
        String str2="aceg";

        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        int dp2[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp2[i][0]=i;
        }
        for(int j=0;j<dp[0].length;j++){
            dp2[0][j]=j;
        }

        // for(int i=0;i<dp2.length;i++){
        //     for(int j=0;j<dp2[0].length;j++){
        //         System.out.print(dp2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        System.out.println(steps(str1, str2, dp2));
        System.out.println(steps2(str1, str2,dp));;
        
    }
}
