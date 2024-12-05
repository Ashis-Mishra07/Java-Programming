package BINARY_TREE._1;

public class sum_nodes {
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
    static int sum=0;
    public static int sum_of_nodes(Node node){
        if(node==null){
            return 0;
        }
        
        int leftSum=sum_of_nodes(node.left);
        int rightSum=sum_of_nodes(node.right);
        
        return leftSum+rightSum+node.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sum_of_nodes(root));
    }
}
