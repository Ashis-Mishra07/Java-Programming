package BINARY_SEARCH_TREES;

import java.util.ArrayList;

public class _6_validate_bst {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            Node left=null;
            Node right=null;
        } 
    }
    public static boolean validate_bst(Node root ,Node min ,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }

        return validate_bst(root.left, min, root) && validate_bst(root.right, root, max);
    }
    public static void main(String[] args) {
        Node node=new Node(8);
        node.left=new Node(5);
        node.right=new Node(10);
        node.left.left=new Node(3);
        node.left.right=new Node(6);
        node.left.left.left=new Node(1);
        node.left.left.right=new Node(4);
        node.right.right=new Node(11);
        node.right.right.right=new Node(14);


        if(validate_bst(node, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
       
    }
}
