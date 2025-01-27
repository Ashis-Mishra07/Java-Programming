package STRINGS;

import java.util.*;

public class string_compression {
    public static void string_compress(String str) {
        
        StringBuilder sb=new StringBuilder(" ");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count.toString());
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "aabbbccccd";
        string_compress(str);
    }
}
