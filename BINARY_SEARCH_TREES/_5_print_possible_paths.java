package BINARY_SEARCH_TREES;

import java.util.ArrayList;

public class _5_print_possible_paths {
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
    public static void printpath(Node node,ArrayList<Integer> path){
        if(node==null){
            return ;
        }
        path.add(node.data);
        if(node.left==null && node.right==null){
            System.out.println(path);
        }

        printpath(node.left, path);
        printpath(node.right, path);
        path.remove(path.size()-1);
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

        ArrayList<Integer> arr=new ArrayList<>();
        printpath(node, arr);
    }
}
