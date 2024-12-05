package BINARY_SEARCH_TREES;

import java.util.*;

public class _4_print_in_range {
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
    public static void printInRange(Node node,int k1,int k2){
        ArrayList<Integer> arr=new ArrayList<>();
        if(node==null){
            return;
        }
        printInRange(node.left,k1,k2);
        arr.add(node.data);
        printInRange(node.right,k1,k2);

        // Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=k1 && arr.get(i)<=k2){
                System.out.print(arr.get(i)+" ");
            }
        }
    }

    public static void printInRange2(Node node,int k1,int k2){
        if(node==null){
            return;
        }
        if(node.data<=k2 && node.data>=k1){
            printInRange(node.left, k1, k2);
            System.out.print(node.data+" ");
            printInRange(node.right, k1, k2);
        }
        else if(node.data<k1){
            printInRange(node.left, k1, k2);
        }
        else if(node.data>k2){
            printInRange(node.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node node=new Node(8);
        node.left=new Node(5);
        node.right=new Node(10);
        node.left.left=new Node(3);
        node.left.right=new Node(6);
        node.left.left.left=new Node(1);
        node.left.left.right=new Node(4);
        node.right.right=new Node(11);
        node.right.right.right=new Node(14);

        printInRange(node, 1, 9);
        System.out.println();
        printInRange2(node, 1, 9);
    }
}
