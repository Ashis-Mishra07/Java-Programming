 package DP._2;


public class _0_1_knapsac {
    public static int solution_recursion(int value[],int weight[],int W,int index){   //O(2^n)
        if(W==0 || index==weight.length){
            return 0;
        }
        if(weight[index]<=W){
            //include
            int ans1=value[index]+solution_recursion(value, weight, W-weight[index], index+1);

            //exclude
            int ans2=solution_recursion(value, weight, W, index+1);

            // we need to check which value is more in adding the curr item or excluding the curr item and including the next item .
            return Math.max(ans1, ans2);
        }
        else{ // not valid means no option is left to add the value so only is to exclude the value
            //exclude
            return solution_recursion(value, weight, W, index+1);
        }
    }

    public static int solution_memoization(int value[],int weight[],int W,int index,int dp[][]){  // O(n)
        if(W==0 || index==weight.length){
            return 0;
        }

        if(dp[index][W]!=-1){
            return dp[index][W];
        }

        if(W>=weight[index]){
            int ans1= value[index] + solution_memoization(value, weight, W-weight[index], index+1,dp);
            int ans2= solution_memoization(value, weight, W, index+1,dp);
            dp[index][W]= Math.max(ans1, ans2);
            return dp[index][W];
        }

        else{
            dp[index][W]= solution_memoization(value, weight, W, index+1,dp);
            return dp[index][W];
        }
    }
    public static void main(String[] args) {
        int value[]={ 15, 14, 10, 45, 30};
        int weight[]={ 2, 5, 1, 3, 4};
        int W=7;
        System.out.println(solution_recursion(value, weight, W, 0));




        //2

        int dp[][]=new int[weight.length+1][W+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(solution_memoization(value, weight, W, 0,dp));
    }
}
