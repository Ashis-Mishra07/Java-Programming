package BITWISE_MANIPULATION;

public class count_no_of_1 {
    public static int count1(int val){
        int count=0;
        while(val!=0){
            if((val&1)==1){
                count++;
            }
            val=val>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int val=8;
        System.out.println(count1(val));
    }
}
