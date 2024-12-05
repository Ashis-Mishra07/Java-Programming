package DP._6;
import java.util.*;
public class min_array_jump {
    public static int min_jump(int arr[],int dp[],int len){
        for(int i=len-2;i>=0;i--){
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1 ; j<=i+steps && j<len ; j++){ // j<len is imp , or else we will move out of the array
                //j ==i+1 coz we will move from the next step o last index 
                if(dp[j]!=-1){
                    ans=Math.min(ans, dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){ // check if ans is not updated .
                dp[i]=ans;
            }
        }

        return dp[0];
    }
   
    public static void main(String[] args) {
        int arr[]={ 2 , 3 , 1 , 1 , 4 };
        int l=arr.length;
        int dp[]=new int[l];
        
        Arrays.fill(dp,-1);
        dp[l-1]=0;
        System.out.println(min_jump(arr, dp, l));
    }
}
