package RECURSION;
import java.util.*;
public class x_power_n {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=x*power(x, n-1);
        return ans;
    }
    public static int powerOptimised(int x,int n){
        if(n==0){
            return 1;
        }
        int sub=powerOptimised(x, n/2);
        int ans=1;
        if(n%2==0){
             ans=sub*sub;
        }
        else{
            ans=x*sub*sub;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        double num=(double)5/2;
        System.out.println(num);
        System.out.println(Math.ceil(num));

    }
}
