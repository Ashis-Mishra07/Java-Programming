package BINARY_TREES;

public class _11_kth_ancestor {
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
    
    public static int  Kth_ancester(Node node,int n,int k){
        if(node==null){
            return -1;
        }
        if(n==node.data){
            return 0;
        }
        int leftDistance=Kth_ancester(node.left, n, k);
        int rightDistance=Kth_ancester(node.right, n, k);

        if(leftDistance==-1 && rightDistance==-1){
            return -1;
        }
        int max=Math.max(leftDistance, rightDistance);
        if(max+1==k){
            System.out.println(node.data);
        }
        return max+1;

    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

     Kth_ancester(node, 5, 1);
    }
}
