package BINARY_TREE._3;

import java.util.*;
public class Kth_level {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void print(Node node,int level,int k){ // O(n)
        if(node==null){
            return ;
        }
        if(level==k){
            System.out.print(node.data+" ");
        }
        print(node.left, level+1, k);
        print(node.right, level+1, k);
    }
    public static void print(Node node){  // O(n)
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);
        
        int k=1;

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                k++;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(k==3){
                    System.out.print(node.data+" ");
                }
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        print(root,1,3);
    }
}
