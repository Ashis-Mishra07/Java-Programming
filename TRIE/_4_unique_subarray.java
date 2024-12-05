package TRIE;

public class _4_unique_subarray {
    static class Node{
        Node children[]=new Node[26];
        int freq;
        boolean eow=false;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }

            freq=1;
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int index=word.charAt(level)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            else{
                curr.children[index].freq++;
                
            }
            curr=curr.children[index];
        }

        curr.eow=true;
    }

    public static void findPrefix(Node root,String ans){

        //O(L)--> no of levels in tries == longest word's length .
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        /*
          The below that is made will search for the root node , since it has an array of character . If while searching the 
          first index is fount to be not null that means any valid value is presant there ,  ut before it , it checks if 
          the freq is other than 1 or not or elese it will print the ans that is stored.
          The recursive function that is made will add the characters into the ans until the freq is not equal to 1.

         */
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }


        root.freq=-1;
        // the above is made so because we have built the freq by default for every num is 
        // 1 . so function is to made in sauch a way that if the freq is 1 then we need to stop
        // the function .So that function would not stop at the root point we have made it -1.


        findPrefix(root, " ");


    }
}