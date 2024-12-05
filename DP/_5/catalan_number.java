package DP._5;

public class catalan_number { 
    public static int catalan_recur(int num){
        if(num==0 || num==1){
            return 1;
        }

        int number=0;
        for(int i=0;i<num;i++){
            number+=catalan_recur(i)*catalan_recur(num-i-1);
        }
        return number;
    }


    public static int catalan_memo(int num,int dp[]){
        if(num==0 || num==1){
            return 1;
        }
        if(dp[num]!=-1){
            return dp[num];
        }
        int number=0;
        for(int i=0;i<num;i++){
            number = number + catalan_memo(i, dp)*catalan_memo(num-i-1, dp);
        }
        return dp[num]=number;
    }
    public static int catalan_tabulation(int num,int dp2[]){ //O(n2)
        for(int i=2;i<=num;i++){
            for(int j=0;j<i;j++){
                dp2[i] = dp2[i] + ( dp2[j]*dp2[i-j-1] );
            }
        }
        return dp2[num];
    }
    public static void main(String[] args) {
        int num=5;
        int dp[]=new int[num+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(catalan_recur(num));
        System.out.println(catalan_memo(num, dp));


        int dp2[]=new int[num+1]; // 0 1 2 3 4 5
        dp2[0]=1;
        dp2[1]=1;
        System.out.println(catalan_tabulation(num,dp2));
    }
}
