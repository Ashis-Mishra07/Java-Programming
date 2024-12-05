package BINARY_SEARCH_TREES;

import java.util.LinkedList;
import java.util.Queue;

public class _3_delete_node {
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
    public static Node findInorderSucessor(Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    public static Node delete(Node node,int val){
        if(val>node.data){
            delete(node.right, val);
        }
        else if(val<node.data){
            delete(node.left, val);
        }
        else{
            // node.data == val 

            //case 1 -> leaf-node
            if(node.left==null && node.right==null){
                return null;
            }

            // case 2 -> one-child
            if(node.left==null){
                return node.right;
            }
            else if(node.right==null){
                return node.left;
            }


            // case 3 -> double-child
            Node IS=findInorderSucessor(node.right);
            node.data=IS.data;
            node.right=delete(node.right, IS.data);
        }
        return node;
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
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

        levelOrder(node);
        delete(node, 8);
        System.out.println();
        levelOrder(node);
    }
}
