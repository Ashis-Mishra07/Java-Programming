package BINARY_TREE._1;

public class build_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int index=-1;
    public static Node making(int arr[]){
        index++;
        if(arr[index]==-1){
            return null;
        }
        Node newNode=new Node(arr[index]);
        newNode.left=making(arr);
        newNode.right=making(arr);

        return newNode;
    }
    public static void main(String[] args) {
        int arr[]={ 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        Node root=making(arr);
        System.out.println(root.data+" ");
        
    }
}
