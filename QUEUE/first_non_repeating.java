package QUEUE;

import java.util.*;

public class first_non_repeating {
    static int freq[] = new int[26];

    public static void first_character(String str) {
        // Queue<Character> q = new LinkedList<>();

        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     freq[ch-'a']++;
        //     q.add(ch);
        //     while(!q.isEmpty() && freq[q.peek()-'a']>1){
        //         q.remove();
        //     }
        //     if(q.isEmpty()){
        //         System.out.println("-1");
        //     }
        //     else{
        //         System.out.println(q.peek());
        //     }
        // }

        String newStr = "";
        newStr += str.charAt(0);
        int arr[] = new int[26];
        arr[str.charAt(0) - 'a']++;

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
            for (int j = 0; j <= i; j++) {
                if (arr[str.charAt(j) - 'a'] == 1) {
                    newStr += str.charAt(j);
                    break;
                }
            }
            if (newStr.length() != i + 1) {
                newStr += '#';
            }
        }

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "";
        first_character(str);
        
    }
}
