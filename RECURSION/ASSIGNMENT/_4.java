package RECURSION.ASSIGNMENT;

public class _4 {
    public static int same_end_strings(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int count=same_end_strings(str, i+1, j, n-1)+same_end_strings(str, i, j-1, n-1)-same_end_strings(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="abcab";
        int i=0;
        int j=str.length()-1;
        int n=str.length();
        System.out.println(same_end_strings(str, i, j, n));
    }
}
