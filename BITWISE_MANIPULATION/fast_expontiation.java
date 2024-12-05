package BITWISE_MANIPULATION;

public class fast_expontiation {
    public static void expontiation(int base,int power){
        int ans=1;
        while(power!=0){
            if((power &1)!=0){ 
                ans=ans*base;
                base=base*base;
            }
            else{
                ans=ans*1;
                base=base*base;
            }
            power=power>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int base=5;
        int power=5;
        expontiation(base, power);
    }
}
