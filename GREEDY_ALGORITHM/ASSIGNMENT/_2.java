package GREEDY_ALGORITHM.ASSIGNMENT;

public class _2 {
    public static void main(String[] args) {
        int m=-3;
        int n=3;
        int k=1;
        int count=0;
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                count++;
            }
        }
        if(count>k){
            if(n%2==0){
                System.out.println(n-1);
            }
            else{
                System.out.println(n);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
