package RECURSION;

public class friends_pairing {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        return pair(n-1) + (n-1)*pair(n-2);
        // cane be single or pair
        // if single is choosen so recursive call for the rest n-1 people
        // if one pair is selected  remaining call for the rest n-2 people .
    }
    public static void main(String[] args) {
        int friends=4;
        System.out.println(pair(friends));;
    }
}
