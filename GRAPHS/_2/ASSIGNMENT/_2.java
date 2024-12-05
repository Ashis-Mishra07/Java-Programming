package GRAPHS._2.ASSIGNMENT;

import RECURSION.remove_duplicated;

public class _2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);

       return Math.max(lh, rh)+1;
    }
    public static void main(String[] args) {
        Node node=new Node(0);
        node.left=new Node(1);
        node .right=new Node(2);
        node.left.left=new Node(3);
        node.left.right=new Node(4);
        node.right.right=new Node(5);

        System.out.println(height(node));
    }
}
