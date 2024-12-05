package RECURSION;

public class sum_of_first {
    public static int sum(int num){
        int count=0;
        if(num==1){
            return 1;
        }
        count=num+sum(num-1);
        return count;
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(sum(num));;
    }
}
