package BINARY_SEARCH_TREES.ASSIGNMENT;

import java.util.ArrayList;

public class _4 {
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
    public static void pairMaking( ArrayList<Integer> arr1, ArrayList<Integer> arr2,int x){
        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                if(arr1.get(i)+arr2.get(j)==x){
                    System.out.println(arr1.get(i)+","+arr2.get(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);
        
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);


        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        storing(root1, arr1);
        storing(root2, arr2);

        int x=16;
        pairMaking(arr1, arr2, x);
    }
}
