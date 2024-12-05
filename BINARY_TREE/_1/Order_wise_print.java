package BINARY_TREE._1;

import java.util.*;

public class Order_wise_print {
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
    public static void preOrder(Node node){
        if(node==null){
            //System.out.print(-1+" ");
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);

    }
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    static int level=0;
    public static void levelOrder(Node node){
        if(node==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    System.out.println();
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
    public static void rightView(Node node,int level,HashMap<Integer,Integer> map){
        if(node==null){
            return;
        }
        if(!map.containsKey(level)){
            map.put(level, node.data);
        }
        
        
        rightView(node.right, level+1, map);
        rightView(node.left, level + 1, map);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        root.left.right=new Node(5);
        
        root.right.right=new Node(4);

        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
         //levelOrder(root);

        HashMap<Integer,Integer> map=new HashMap<>();
        int level=1;
        rightView(root, level, map);
        for(Integer key:map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
