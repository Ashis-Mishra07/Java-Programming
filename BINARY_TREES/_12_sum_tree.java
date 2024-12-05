package BINARY_TREES;

public class _12_sum_tree {
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
    public static int sum_tree(Node node){
        if(node==null){
            return 0;
        }
        int leftchild=sum_tree(node.left);
        int rightchild=sum_tree(node.right);

        int left=node.left ==null? 0: node.left.data;
        int right=node.right==null? 0: node.right.data;

        int data=node.data;
        node.data=leftchild+rightchild+ left +right;

        return data;
    }
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        sum_tree(node);
        preOrder(node);
    }
}
