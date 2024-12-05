package RECURSION;

public class factorial {
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        num=num*factorial(num-1);
        return num;
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(factorial(num));
    }
}
