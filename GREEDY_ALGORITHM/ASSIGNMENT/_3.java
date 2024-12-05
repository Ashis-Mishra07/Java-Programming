package GREEDY_ALGORITHM.ASSIGNMENT;

import java.util.*;
public class _3 {
    static ArrayList<Character> arr=new ArrayList<>();
    public static void word(char alpha[],int word_weight){
        for(char i='z';i>='a';i--){
            if(word_weight>(i-'a')){
                while(word_weight>(i-'a')){
                    arr.add(alpha[i-'a']);
                    word_weight=word_weight-(i-'a');
                }
            }
        }
    }
    public static void main(String[] args) {
        char alpha[]=new char[26];
        for(char i='a';i<='z';i++){
            alpha[i-'a']=i;
        }
        int word_weight=42;
        word(alpha, word_weight);
        System.out.println(arr);
    }
}
