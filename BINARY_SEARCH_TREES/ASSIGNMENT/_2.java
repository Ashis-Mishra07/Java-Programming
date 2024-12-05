package BINARY_SEARCH_TREES.ASSIGNMENT;

import java.util.ArrayList;

public class _2 {
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
    public static void min_differ_with_value(ArrayList<Integer> arr,ArrayList<Integer> differ,int key){

        int i=0;
        while(i!=arr.size()){
            differ.add(Math.abs(arr.get(i)-key));
            i++;
        }

        int min=differ.get(0);
        int value=arr.get(0);
        for(int j=1;j<differ.size();j++){
            if(differ.get(j)<min){
                min=differ.get(j);
                value=arr.get(j);
            }
        }

        System.out.println("the closest value is "+value);
        System.out.println("the difference is "+min);
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
         ArrayList<Integer> differ=new ArrayList<>();
         
        min_differ_with_value(arr, differ, 19);
       
    }
}
