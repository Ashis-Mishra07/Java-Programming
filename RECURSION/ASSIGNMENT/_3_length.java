package RECURSION.ASSIGNMENT;

public class _3_length {
    static int count=0;
    public static void length(String str){
        if(str.length()==0){
            return ;
        }
        count+=1;
        length(str.substring(0, str.length()-1));
        
    }
    public static void main(String[] args) {
        String str="amit";
        length(str);
        System.out.println(count);
    }
}
