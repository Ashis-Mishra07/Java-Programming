package BINARY_SEARCH_TREES;

import java.util.ArrayList;

public class _9_unbalaced_to_balanced_bst {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
    public static void storing(Node node,ArrayList<Integer> arr){ // inorder of the original bst  O(n)
        if(node==null){
            return;
        }
        storing(node.left, arr);
        arr.add(node.data);
        storing(node.right, arr);
    }
    public static Node createBst(int start,int end,ArrayList<Integer> arr){  // O(n)
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBst(start, mid-1, arr);
        root.right=createBst(mid+1, end, arr);

        return root;
    }
    public static void preOrder(Node root){  //O(n)
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node node=new Node(8);
        node.left=new Node(6);
        node.left.left=new Node(5);
        node.left.left.left=new Node(3);
        node.right=new Node(10);
        node.right.right=new Node(11);
        node.right.right.right=new Node(12);

        ArrayList<Integer> arr=new ArrayList<>();
        storing(node, arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        Node root=createBst(0,arr.size()-1,arr);
        preOrder(root);
    }
}
