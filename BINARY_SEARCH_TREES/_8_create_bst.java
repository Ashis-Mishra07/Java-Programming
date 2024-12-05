package BINARY_SEARCH_TREES;

public class _8_create_bst {
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

    public static Node createBST(int start,int end,int arr[]){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node node=new Node(arr[mid]);

        node.left=createBST( start, mid-1, arr);
        node.right=createBST( mid+1, end, arr);

        return node;
    }
    public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        
        preorder(node.right);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node node=createBST( 0, arr.length-1,arr);
        preorder(node);
    }
}
