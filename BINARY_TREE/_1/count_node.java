package BINARY_TREE._1;

public class count_node {
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
    public static int totalNode(Node node){
        if(node==null){
            return 0;
        }
        int left=totalNode(node.left);
        int right=totalNode(node.right);

        return left+right+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(totalNode(root));

    }
}
