package BITWISE_MANIPULATION.ASSIGNMENT;

public class all {
    public static void swap(int a ,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void add1ToInteger(int val){
        val=-(~val);
        System.out.println(val);
    }
    public static void  upper_to_lower(){
        for(char i='A';i<='Z';i++){
            System.out.print((char)(i |' ')+" ");
        }
    }
    public static void main(String[] args) {
        int a =4;
        int b=5;
        swap(a, b);
        System.out.println();
        add1ToInteger(a);
        System.out.println();
        upper_to_lower();
    }
}
