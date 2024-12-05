package BINARY_TREES;

public class _5_diameter {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int diameter(Node root){  //O(n^2)
        if(root==null){
            return 0;
        }
        int leftDia=diameter(root.left);
        int rightDia=diameter(root.right);
        int leftHei=height(root.left);
        int rightHei=height(root.right);

        int selfDia=leftHei+rightHei+1;
        return Math.max(selfDia,Math.max(leftDia, rightDia));
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        
        System.out.println(diameter(node));

    }
}
