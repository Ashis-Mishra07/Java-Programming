package GREEDY_ALGORITHM.ASSIGNMENT;

public class _1 {
    public static void equal_Substring(String str){
        int l=0;
        int count=0;
        int r=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L'){
                l++;
            }
            else if(str.charAt(i)=='R'){
                r++;
            }
            if(l==r){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str="LLRRRLLRRL";
        equal_Substring(str);
    }
}
