package BINARY_SEARCH_TREES.ASSIGNMENT;

import java.util.ArrayList;

public class _3 {
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
    public static void storing(Node node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        storing(node.left, arr);
        arr.add(node.data);
        storing(node.right, arr);
    }
    public static void finding_the_Kth_value(ArrayList<Integer> arr,int k){
        System.out.println(arr.get(k-1));
    }
    public static void main(String[] args) {
        Node node=new Node(8);
        node.left=new Node(5);
        node.right=new Node(11);
        node.left.left=new Node(3);
        node.left.right=new Node(6);
        node.right.right=new Node(20);
        
        ArrayList<Integer> arr=new ArrayList<>();
        storing(node, arr);
        finding_the_Kth_value(arr, 5);
    }
}
