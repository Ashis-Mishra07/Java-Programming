package STACKS;

import java.util.*;
public class valid_paranthesis {
    public static boolean valid(String str){
        Stack<Character> s=new Stack<>();

        if(str.isEmpty()){
            return true;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{' ||ch=='['||ch=='('){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                //for successful pair formation
                if((ch=='}' && s.peek()=='{')||(ch==']' && s.peek()=='[')||(ch==')' && s.peek()=='(')){
                    s.pop();
                }
                // if not form
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="{({[{]})}";
        System.out.println(valid(str));
    }
}
