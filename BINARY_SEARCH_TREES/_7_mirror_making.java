package BINARY_SEARCH_TREES;

public class _7_mirror_making {
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
    public static Node mirror(Node node){
        if(node==null){
            return null;
        }
        Node left=mirror(node.left);
        Node right=mirror(node.right);

        node.right=left;
        node.left=right;
        
        return node;
    }
    public static void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        Node node=new Node(8);
        node.left=new Node(5);
        node.right=new Node(10);
        node.left.left=new Node(3);
        node.left.right=new Node(6);
        node.left.left.left=new Node(1);
        node.left.left.right=new Node(4);
        node.right.right=new Node(11);
        node.right.right.right=new Node(14);

        Node node2=null;
        mirror(node);
        inorder(node);
    }
}
