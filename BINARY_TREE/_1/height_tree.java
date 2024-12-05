package BINARY_TREE._1;

public class height_tree {
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
    public static int countHeight(Node node){
        if(node==null){
            return 0;
        }
        int lh=countHeight(node.left);
        int rh=countHeight(node.right);

        return Math.max(lh, rh)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(countHeight(root));
    }
}
