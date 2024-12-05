package STACKS.ASSIGNMENT;

import java.util.*;
public class _3 {
    public static String print(String str){
        Stack<Integer> number=new Stack<>();
        Stack<Character> character =new Stack<>();
        String result="";
        String temp="";
        for(int i=0;i<str.length();i++){
            // for couting the numbers
            int count=0;
            if(Character.isDigit(str.charAt(i))){
                while(Character.isDigit(str.charAt(i))){
                    count=count*10 + (str.charAt(i)-'0');
                    i++;
                }
                i--;
                number.push(count);
            }
            else if(str.charAt(i)=='['){
                if(Character.isDigit(str.charAt(i-1))){
                    character.push(str.charAt(i));
                }
                else{
                    character.push(str.charAt(i));
                    number.push(1);
                }
            }
            else if(str.charAt(i)==']'){
                count=0;
                if(!number.empty()){
                    count=number.peek();
                    number.pop();
                }

                while(!character.isEmpty() && character.peek()!='['){
                    temp=temp+character.peek();
                    character.pop();
                }
                if(!character.isEmpty() && character.peek()=='['){ // if in case while popping the left bracket is left
                    character.pop();
                }
                for(int j=0;j<count;j++){
                    result+=temp;
                }
                // if it is presnt inside by another bracket
                for(int j=0;j<result.length();j++){
                    character.push(str.charAt(j));
                }
                result="";
            }
            else{
                character.push(str.charAt(i));
            }
        }
        while(!character.isEmpty()){
            result=result+character.peek();
            character.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String str="3[b2[v]]";
        System.out.println(print(str));
    }
}
