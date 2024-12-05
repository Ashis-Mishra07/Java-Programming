package BINARY_SEARCH_TREES.ASSIGNMENT;

import java.util.ArrayList;

public class _1 {
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
    public static void findingSum(ArrayList<Integer> arr,int min,int max){
        int sum=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>min && arr.get(i)<max){
                sum=sum+arr.get(i);
            }
        }
        System.out.println("sum is "+sum);
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
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        findingSum(arr, 7, 15);

    }
}
