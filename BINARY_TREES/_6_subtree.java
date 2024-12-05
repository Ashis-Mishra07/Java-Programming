package BINARY_TREES;

public class _6_subtree {
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
    public static boolean isIdentical(Node node, Node subNode){
        if(node== null && subNode==null){
            return true;
        }
        else if(node==null || subNode==null|| node.data!=subNode.data){
            return false;
        }
        if(!isIdentical(node.left, subNode.left)){
            return false;
        }
        if(!isIdentical(node.right, subNode.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node node,Node subnode){
        if(node==null){
            return false;
        }
        if(node.data==subnode.data){
            if(isIdentical(node,subnode)){
                return true;
            }
            
        }    
        return isSubtree(node.left, subnode)||isSubtree(node.right, subnode);
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);

        Node subnode=new Node(2);
        subnode.left=new Node(4);
        subnode.right=new Node(5);

        System.out.println(isSubtree(node, subnode));
    }
}
