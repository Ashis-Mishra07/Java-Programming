package QUEUE.ASSIGNMENT;

public class _1 {
    public static void num_to_binary(int num){
        int binary=0;
        int pow=0;
        while(num>0){
            int rem=num%2;
            binary= binary + (int)Math.pow(10,pow)* rem;
            num=num/2;
            pow++;
        }

        System.out.println(binary);
    }
    public static void binaryRange(int num){
        for(int i=1;i<=num;i++){
            num_to_binary(i);
        }
    }
    public static void main(String[] args) {
        binaryRange(8);
    }
}
