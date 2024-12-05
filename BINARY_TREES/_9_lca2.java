package BINARY_TREES;

public class _9_lca2 {
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
    public static Node lca2(Node node,int n1,int n2){
        if(node==null){
            return null;
        }
        if(node.data==n1 || node.data==n2){
            return node;
        }
        Node left=lca2(node.left, n1, n2);
        Node right=lca2(node.right, n1, n2);
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }

        return node; // here it means that from the both end the value returned is not null that means the node itself is the desired node.
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        System.out.println(lca2(node, 5, 5).data);
    }
}
