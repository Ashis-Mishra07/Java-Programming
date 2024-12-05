package STACKS;

import java.util.*;
public class extra_paranthesis {
    public static boolean isExtra(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    count++;
                    s.pop();
                }
                if(count<=0){
                    return true; // duplicates exists
                }
                else{
                    s.pop(); // remove the above the undeleted bracket
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)";
        String str2="((a+b))";
        System.out.println(isExtra(str2));
        System.out.println(isExtra(str));
    }
}
