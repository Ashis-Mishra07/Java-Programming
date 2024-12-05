package BINARY_TREES.ASSIGNMENT;

public class _2_mirror_tree {
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
    public static boolean isIdentical(Node node,Node node1){
        if(node==null && node1==null){
            return true;
        }
        if( node==null || node1==null || node.data!=node1.data){
            return false;
        }
        // if(node.left!=node1.right){
        //     return false;
        // }
        // if(node.right!=node1.left){
        //     return false;
        // }
        if(!isIdentical(node.left, node1.right)){
            return false;
        }
        if(!isIdentical(node.right, node1.left)){
            return false;
        }
        return true;
    }
    public static boolean isMirror(Node node,Node node1){
        if(node==null){
            return false;
        }
        if(node.data==node1.data){
            if(isIdentical(node, node1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        Node node1 = new Node(1);
        node1.left = new Node(3);
        node1.right = new Node(2);
        node1.left.left = new Node(7);
        node1.left.right = new Node(6);
        node1.right.left = new Node(5);
        node1.right.right = new Node(4);

        System.out.println(isMirror(node, node1));
    }
}
