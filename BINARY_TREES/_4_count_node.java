package BINARY_TREES;

public class _4_count_node {
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
    public static int count_nodes(Node root){
        if(root==null){
            return 0;
        }
        return count_nodes(root.left)+count_nodes(root.right)+1;
    }
    public static int sum_of_nodes(Node root){
        if(root==null){
            return 0;
        }
        int left_sum=sum_of_nodes(root.left);
        int right_sum=sum_of_nodes(root.right);
        return left_sum+right_sum +root.data;
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
        System.out.println("total nodes are "+count_nodes(node));
        System.out.println("sum is "+sum_of_nodes(node));
    }
}
