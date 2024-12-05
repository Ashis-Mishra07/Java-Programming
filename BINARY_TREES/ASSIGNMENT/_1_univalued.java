package BINARY_TREES.ASSIGNMENT;

import org.w3c.dom.Node;

public class _1_univalued {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
    public static boolean valid(Node node){
        if(node==null){
            return true;
        }
        if(node.left!=null && node.data!=node.left.data){
            return false;
        }
        if(node.right !=null && node.data!=node.right.data){
            return false;
        }

        return valid(node.left) && valid(node.right);
    }
    

    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(2);
        node.right = new Node(2);
        node.left.left = new Node(2);
        node.left.right = new Node(2);
        node.right.left = new Node(23);
        node.right.right = new Node(2);

        if(valid(node)){
            System.out.println("univalued");
        }
        else{
            System.out.println("non-univaled");
        }
    }
}
