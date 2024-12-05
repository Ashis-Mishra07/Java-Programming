package RECURSION;

public class fibonacci {
    public static int print(int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return print(num-1) + print(num-2);
    }
    
    public static void main(String[] args) {
        int num=8;
        System.out.println(print(num));;
    }
}
