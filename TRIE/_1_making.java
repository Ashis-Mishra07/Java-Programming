package TRIE;
public class _1_making {
    static class Node{
        Node children[]=new Node[26]; // length is assigned as 26
        boolean EOW=false;

        public Node(){ // here in tries there is no need for initialising with this keyword
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();// this is to be made null by default.
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
    }
}
