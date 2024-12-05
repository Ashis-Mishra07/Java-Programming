package BINARY_TREES;

import java.util.ArrayList;

public class _9_lowest_common_ancestor {
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
    public static boolean getPath(Node node,int n,ArrayList<Node> path){
        if(node==null){
            return false;
        }
        path.add(node);
        if(node.data==n){
            return true;
        }
        boolean foundleft=getPath(node.left, n, path);
        boolean foundright=getPath(node.right, n, path);

        if(foundleft || foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node node, int n1, int n2) {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(node,n1,path1);
        getPath(node,n2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca= path1.get(i-1);
        return lca;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        System.out.println(lca(node, 4, 1).data);
    }
}
