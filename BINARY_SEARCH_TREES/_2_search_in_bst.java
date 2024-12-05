package BINARY_SEARCH_TREES;

public class _2_search_in_bst {
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
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data> key){
             return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static boolean search2(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        boolean left=search2(root.left, key);
        boolean right=search2(root.right, key);
        return left||right;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        System.out.println(search(root, 24));
        System.out.println(search2(root, 2));
        

    }
}
