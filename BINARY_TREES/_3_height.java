package BINARY_TREES;
import java.util.*;

public class _3_height {
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
    public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            

            return Math.max(lh, rh)+1;
        }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.left.left=new Node(8);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        
        System.out.println(height(node));
        
    }
}
