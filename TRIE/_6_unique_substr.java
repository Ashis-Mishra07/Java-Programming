package TRIE;

import java.util.HashSet;

public class _6_unique_substr {

    public static void main(String[] args) {
        String str = "ababa";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set);
        System.out.println("Total unique substring possible are " + set.size());
    }
}
