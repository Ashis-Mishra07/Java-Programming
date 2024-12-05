package BINARY_TREE._3;

import java.util.*;

public class sum_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
    public static int sumTree(Node node){
        if(node==null){
            return 0;
        }
        int leftSum=sumTree(node.left);
        int rightSum=sumTree(node.right);

        int data=node.data;
        node.data=leftSum+rightSum;
        return data;
    }
    public static void level_order(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        sumTree(node);
        level_order(node);
    }
}
