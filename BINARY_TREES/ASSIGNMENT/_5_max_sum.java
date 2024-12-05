package BINARY_TREES.ASSIGNMENT;

import java.util.*;

public class _5_max_sum {
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
    
    public static int findMaxSum(Node node,ArrayList<Integer> arr){
        if(node==null){
            return 0;
        }
        int left=findMaxSum(node.left,arr);
        int right=findMaxSum(node.right,arr);
        int newNode=Math.max(Math.max(left, right)+node.data, node.data);
        arr.add(newNode);
        
        return 0;
    }
    
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);


        ArrayList<Integer> arr=new ArrayList<>();
        findMaxSum(node,arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
