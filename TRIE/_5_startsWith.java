package TRIE;

public class _5_startsWith {
    static class Node {
        Node children[] = new Node[26];
        int freq;
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }

            freq = 1;
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
    public static boolean search(String prefix){
        Node curr=root;
        //boolean b=true;
        for(int level=0;level<prefix.length();level++){
            int index=prefix.charAt(level)-'a';
            if(curr.children[index]==null){
                // b=false;
                // break;

                return false;
            }
            curr=curr.children[index];
        }


        //System.out.println(b);
        return true;
    }

    public static void main(String[] args) {
        String arr[]={"apple","app","mango","man","woman"};
        String prefix="ap";

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        System.out.println(search(prefix));
    }
}
