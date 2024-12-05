package RECURSION;

import java.util.*;

public class remove_duplicated {
    public static void removeDuplicate(String str, String newStr) {
        Character arr[] = new Character[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        int j = 0;
        while (j < str.length()) {
            int currIndex = str.charAt(j) - 'a';
            if (arr[currIndex] == 0) {
                arr[currIndex] = str.charAt(j);
            }
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            newStr = newStr + arr[i];
        }
        System.out.println(newStr);
    }

    public static void removeDuplicates2(String str, int index, StringBuilder newStr, boolean arr[]) {

        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(index);
        if (arr[curr - 'a'] == true) {
            removeDuplicates2(str, index + 1, newStr, arr);
        } else {
            arr[curr - 'a'] = true;
            removeDuplicates2(str, index + 1, newStr.append(curr), arr);
        }

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,""); // not in order;

        boolean[] arr = new boolean[26];
        removeDuplicates2(str, 0, new StringBuilder(""), arr);
    }
}
