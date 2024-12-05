package BITWISE_MANIPULATION;

public class even_or_odd {
    public static void main(String[] args) {
        int val=2;
        int ope=val & 1;
        if(ope==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
