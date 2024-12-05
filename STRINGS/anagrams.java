package STRINGS;

import java.util.Arrays;

public class anagrams {
    public static boolean compare(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char [] store1=new char[str1.length()];
        char [] store2=new char[str2.length()];
        for(int i=0;i<str1.length();i++){
            store1[i]=str1.charAt(i);
            store2[i]=str2.charAt(i);
        }
        Arrays.sort(store1);
        Arrays.sort(store2);
        for(int i=0;i<store1.length;i++){
            if(store1[i]!=store2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="care";
        String str2="race";
        System.out.println(compare(str1, str2));
    }
}
