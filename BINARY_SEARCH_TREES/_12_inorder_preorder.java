package BINARY_SEARCH_TREES;

public class _12_inorder_preorder {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
       
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    
    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    public static  int position(int inOrder[],int start,int end,int curr){
        for(int i=start;i<=end;i++){
            if(inOrder[i]==curr){
                return i;
            }
        }
        return -1;
    }
    
    static int index = 4;
    public static  Node build(int postOrder[],int inOrder[],int start,int end){
        

        if (start > end) {
            return null;
        }
        int curr = postOrder[index];
        Node temp = new Node(curr);
        index--;
        if (start == end) {
            return temp;
        }
        int posi = position(inOrder, start, end, curr);
        temp.right = build(inOrder, postOrder, posi + 1, end);
        temp.left = build(inOrder, postOrder, start, posi - 1);

        return temp;

    }
    static int num=6;
    public static void main(String[] args) {
        
        int postOrder[]={ 9, 15, 7, 20, 3 };
        int inOrder[]={ 9, 3, 15, 20, 7 };

        Node node=build(postOrder,inOrder,0,inOrder.length-1);




        postOrder(node);
        System.out.println();
        inOrder(node);
    }
}
