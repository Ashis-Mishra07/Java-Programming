package BINARY_TREES;

import javax.sound.sampled.ReverbType;

public class _5_diameter_optimised {
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
    static class info{
        int diameter;
        int height;
        public info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public static info diameter(Node node){
        if(node==null){
            return new info(0, 0);
        }
        info leftinfo=diameter(node.left);
        info rightinfo=diameter(node.right);

        int diameter=Math.max(Math.max(leftinfo.diameter,rightinfo.diameter ), leftinfo.height+rightinfo.height+1);
        int height=Math.max(leftinfo.height, rightinfo.height)+1;

        return new info(diameter, height);
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);

        System.out.println(diameter(node).diameter);
        System.out.println(diameter(node).height);
        
    }
}
