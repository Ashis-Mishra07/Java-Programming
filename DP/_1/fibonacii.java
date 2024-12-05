package DP._1;

public class fibonacii {
    public static int fib(int num,int fibarr[]) { //  O(2^n)--->O(n)  (TC is reduced)
        
        // using recursion . 
        
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        if(fibarr[num]!=0){ // here the value of fib(num) is stored and in finding fib for some other value this value is simply get returned .
            return fibarr[num];
        }
        fibarr[num]= fib(num - 1,fibarr) + fib(num - 2,fibarr); // here if it is not calculated then it is calculating here .
        return fibarr[num];
    }
    public static void fibMemo(int n){  // O(n)
        // using memoization
        
        int dp[] = new int[n + 1];
        // dp[0]--> 0th fibonacii
        // dp[1]--> 1st fibonacii
        // dp[2]--> 2nd fibonacii
        // dp[3]--> 3rd fibonacii

        // dp[n]--> nth fibonacii

        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n=1;
        int fibarr[]=new int[n+1];
        // System.out.println(fib(n,fibarr));


        fibMemo(n);
    }
}
