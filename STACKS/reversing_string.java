package STACKS;

import java.util.*;

public class reversing_string {
    static String newStr="";
    public static void reverse(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while(index!=str.length()){
            
            s.push(str.charAt(index));
            index++;
        }
        String  newStr=new String();
        while(!s.isEmpty()){
            newStr=newStr+s.pop();
        }
        System.out.println(newStr);
   }
    public static void main(String[] args) {
        String str="ashis";
       reverse(str);
        
    }
}
