package BINARY_TREE._2;

import java.util.*;

public class top_view {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info{
        int h_dist;
        Node node;
        public info(Node node,int h_dist){
            this.node=node;
            this.h_dist=h_dist;
        }
    }
    public static void top_view(Node node){
        Queue<info>q=new LinkedList<>();
        HashMap<Integer,Node> map =new HashMap<>();

        int min=0;
        int max=0;

        q.add(new info(node, 0));
        q.add(null);

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.h_dist)){
                    map.put(curr.h_dist, curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left, curr.h_dist - 1));
                    min=Math.min(min,curr.h_dist-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right, curr.h_dist+1));
                    
                    max=Math.max(max, curr.h_dist+1);
                }
            }
        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        top_view(root);
    }
}
