package DP._4;

public class edit_distance {

    //time complexity is O( n * m )
    public static int steps(String str1,String str2,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){ // same char at the last posi 
                    dp[i][j]=dp[i-1][j-1];
                }
                else{ // different char at the last posi

                    int add=dp[i][j-1]+1;
                    int delete=dp[i-1][j]+1;
                    int replace=dp[i-1][j-1]+1;

                    dp[i][j]=Math.min(add,Math.min(delete, replace));
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    public static void main(String[] args) {
        String str1="intention";
        String str2="execution";

        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=j;
        }

        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+"   ");
        //     }
        //     System.out.println();
        // }

        System.out.println(steps(str1, str2, dp));
    }
}
