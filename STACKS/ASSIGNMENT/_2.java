package STACKS.ASSIGNMENT;
import java.util.*;
public class _2 {
    public static String url(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        if(s.pop()=='.' && s.pop()=='.' && s.pop()=='/'){
            while(!s.isEmpty() && s.peek()!='/'){
                s.pop();
            }
        }
        String newStr=new String();
        for(int i=0;i<s.size();i++){
            newStr=newStr+s.get(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="/apnaclg/..";
        String str2="/apna/";
       System.out.println(url(str));
    }
}
