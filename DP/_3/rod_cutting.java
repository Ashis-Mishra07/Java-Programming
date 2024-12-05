package DP._3;

public class rod_cutting {
    //time complexity is O( n * rod_length )
    public static int max_profit(int length[],int value[],int rodLength,int dp[][]){
        for(int i=1;i<value.length+1;i++){
            for(int j=1;j<rodLength+1;j++){
                int currLength=length[i-1];
                if(currLength<=j){
                    dp[i][j]=Math.max(value[i-1]+dp[i][j-currLength] , dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[value.length][rodLength];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int value[]={1,5,8,9,10,17,17,20};

        int rodLength=8;
        int dp[][]=new int[value.length+1][rodLength+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }
        System.out.println(max_profit(length, value, rodLength, dp));
    }
}
