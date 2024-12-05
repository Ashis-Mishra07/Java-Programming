package TRIE;

import java.util.*;

public class _6_uniqueSubstr {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void finding_suffix(String str,ArrayList<String> arr){
        
        for(int i=0;i<=str.length();i++){
            arr.add(str.substring(i));
        }
    }
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }

            curr=curr.children[index];
        }

        curr.eow=true;
    }

    public static int countNode(Node root){
        //the total no of unique prefixes is the sum of total no of nodes count.
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count=count+countNode(root.children[i]);
            }
        }

        return count+1;// counting the self so plus1 .
    }
    public static void main(String[] args) {
        String str="ababa";

        //suffix
        ArrayList<String> arr=new ArrayList<>();
        finding_suffix(str, arr);
    
        //making the trie .
        for(int i=0;i<arr.size();i++){
            insert(arr.get(i));
        }

        // find the total no of nodes an it will be equal to total unique substrings .
        System.out.println(countNode(root));
    }

}
