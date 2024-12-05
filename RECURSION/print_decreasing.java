package RECURSION;

public class print_decreasing {
    public static void print_decreasing(int num){
        if(num<1){
            return;
        }
        System.out.print(num+" ");
        print_decreasing(num-1);
    }
    public static void print_increasing(int num){
        if(num<1){
            return;
        }
        print_increasing(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int start=10;
        print_decreasing(start);
        System.out.println();
        print_increasing(start);
    }
}
