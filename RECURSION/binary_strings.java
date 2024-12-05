package RECURSION;

public class binary_strings {
    public static void printBinaryStrings(int n,int lastplace,String str){ //no consecutive one
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1, 0, str+"0");
        if(lastplace==0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void noConsecutive1(int lastplace,int n,String str){ // no consecutive zero
        if(n==0){
            System.out.println(str);
            return;
        }
        noConsecutive1(1, n-1, str+"1");
        if(lastplace==1){
            noConsecutive1(0, n-1, str+"0");
        }
    }
    public static void noOne(int n, String str,int last){
        if(n==0){
            System.out.println(str);
            return;
        }
        noOne(n-1,str+"0",0);
        if(last==0){
            noOne(n-1,str+"1",1);
        }
    }
    public static void main(String[] args) {
        // printBinaryStrings(3, 0, "");
        // System.out.println("......");
        // noConsecutive1(1,3,"");
        noOne(3,"",0);
    }
}
