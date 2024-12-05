package BITWISE_MANIPULATION;

public class power_of_2 {
    public static void isPower(int val){
        if( (val & (val-1))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        int val=8;
        isPower(val);
    }
}
