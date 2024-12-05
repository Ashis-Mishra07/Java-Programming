package RECURSION.ASSIGNMENT;

public class _2 {
    public static void print(String str[],int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        
        print(str, num/10);
        System.out.print(str[rem]+" ");
    }
    public static void main(String[] args) {
        int num=2019;
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        print(str, num);
    }
}
