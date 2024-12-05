package TRIE;

public class _7_longest_word_with_prefix {
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
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.eow = true;
    }
    public static String ans="";
    public static void longestWord(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');// if at index i it is found then fetching the character by plus a .
                temp=temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);// delete the last character while back tracking --> after deleting the one a then move to b so similarly

            }
        }
    }
    public static void main(String[] args) {
        String words[]={"a","banana","ap","app","appl","apple","apply"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);// apple
         // so as to get the larger one  male the for loop to run   for(int i=25;i>=0;i--) --> in the longest word function
         // if remove the length operation --> print the last observeed i.e. apply here
    }
}
