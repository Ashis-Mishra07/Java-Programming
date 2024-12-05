package TRIE;

public class _3_word_breaking {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {  // O(L).

        if(key.length()==0){ // that means all  are now accesing by search , there is no word left for recursive calling so 
                             // if it occurs making it to return true by default .
            return true;
        }


        for (int i = 1; i <= key.length(); i++) {
            // 1 to length becoz substr's last index is exclusive
            // from substr(0,i)--> this will return error instead


            // for the 1st part calling the search and if return true then calling recursively the second part.
            if (  search(key.substring(0, i))   &&   wordBreak(key.substring(i))  )// i is the begining index ;
            {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        String arr[] = { "apple", "pen", "sam", "samsung", "mobile", "ice" };
        String key = "applepenapple";

        // 1st is to insert the words and make an trie .
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }


        System.out.println(wordBreak(key));
    }
}
