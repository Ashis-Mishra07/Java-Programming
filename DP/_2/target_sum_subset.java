package DP._2;

public class target_sum_subset {
    // O( n * sum )
    public static boolean subset(int numbers[],int target,boolean dp[][]){
        for(int i=1;i<numbers.length+1;i++){
            for(int j=1;j<target+1;j++){
                int num=numbers[i-1];
                if(num<=j && dp[i-1][j-num]==true){ // less than the target and including the value
                    dp[i][j]=true;
                }
                else if(num<=j && dp[i-1][j]==true){ // less but excluding the value
                    dp[i][j]=true;
                }
                else{                           // if the value id more than the sum , then only option is to exclude the value only
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }
                }
            }
        }
        return dp[numbers.length][target];  // returning the ;ast index of last value of the dp 2d array .
    }
    public static void main(String[] args) {
        int numbers[]={4,2,7,1,3};
        int target=10;
        boolean dp[][]=new boolean[numbers.length+1][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        

        System.out.println(subset(numbers, target, dp));
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
