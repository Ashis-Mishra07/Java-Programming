package BINARY_TREES.ASSIGNMENT;

public class _3_delete_leaf_nodes {
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

    public static Node delete_leaf_nodes(Node node,int value){
        if(node==null){
            return null;
        }
        node.left=delete_leaf_nodes(node.left, value);
        node.right=delete_leaf_nodes(node.right, value);
        if(node.data==value && node.left==null && node.right==null ){
            return null;
        }
        return node;
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        inOrder(node.left);
        inOrder(node.right);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        delete_leaf_nodes(node, 4);
        inOrder(node);
    }
}
