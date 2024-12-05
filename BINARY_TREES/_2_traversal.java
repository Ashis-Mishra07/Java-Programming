package BINARY_TREES;

import java.util.*;

public class _2_traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            Node left=null;
            Node right=null;
        }
        //.....................................................
        public void pre_order(Node node){
            if(node == null){
                return;
            }
            System.out.print(node.data+" ");
            pre_order(node.left);
            pre_order(node.right);
        }
        //.....................................................
        public void in_order(Node node){
            if(node == null){
                return;
            }
            
            in_order(node.left);
            System.out.print(node.data+" ");
            in_order(node.right);
            
        }
        //.....................................................
        public void post_order(Node node){
            if(node == null){
                return;
            }
            
            post_order(node.left);
            post_order(node.right);
            System.out.print(node.data+" ");
        }
        //.....................................................
        public  void level_order(Node node){
            if(node==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(node);
            q.add(null);
            while(!q.isEmpty()){
                Node newNode=q.remove();
                if(newNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(newNode.data+" ");
                    if(newNode.left!=null){
                        q.add(newNode.left);
                    }
                    if(newNode.right!=null){
                        q.add(newNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.left.left=new Node(8);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        
        // node.pre_order(node);
        // System.out.println();
        // node.in_order(node);
        // System.out.println();
        // node.post_order(node);
        // System.out.println();
        node.level_order(node);
    }
}
