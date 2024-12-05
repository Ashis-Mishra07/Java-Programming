package BINARY_TREE._3;

import java.util.ArrayList;
import java.util.HashSet;

public class Kth_ancestor {
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
    public static boolean getPath(Node node,int node1,ArrayList<Node> path){
        if(node==null){
            return false;
        }
        path.add(node);
        if(node.data==node1){
            return true;
        }
        boolean left=getPath(node.left, node1, path);
        boolean right=getPath(node.right, node1, path);

        if(left|| right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static void lca(Node node,int node1,int k){
        ArrayList<Node> path=new ArrayList<>();
        getPath(node,node1,path);

        

        for(int i=0;i<path.size();i++){
            System.out.println(path.get(i).data);
        }

        System.out.println(path.get(path.size()-k-1).data);
    }

    public static int Kth_ancester(Node node,int node1,int k){
        if(node==null){
            return -1;
        }
        if(node.data==node1){
            return 0;
        }

        int left=Kth_ancester(node.left, node1, k);
        int right=Kth_ancester(node.right, node1, k);

        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left, right);
        if(max+1==k){
            System.out.println(node.data);
        }
        return max+1;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        lca(root, 4, 0);
        // Kth_ancester(root, 4, 0);
    }
}
