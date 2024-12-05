package BINARY_TREE._3;

import java.util.ArrayList;

public class common_ancestor {
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

        if(node.data==node1){ // if during searching the data is found then it will return true else go for left or right .
            return true;
        }

        boolean foundLeft=getPath(node.left, node1, path);
        boolean foundright=getPath(node.right, node1, path);

        if(foundLeft|| foundright){
            return true;
        }
        path.remove(path.size()-1); // this is to remove the undesirable node present in path for finding the number 

        return false;

    }
    public static void commonAncestor(Node node,int node1,int node2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(node,node1,path1);
        getPath(node,node2,path2);

        for(int i=0;i<path2.size();i++){
            System.out.print(path2.get(i).data+" ");
        }
        int i=0;
        for( ;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        System.out.println();
        System.out.println(path1.get(i-1).data);
    }

    public static Node lowestCommonAncestor2(Node node,int node1,int node2){
        if(node==null){
            return null;
        }
        if(node.data==node1 || node.data==node2){
            return node;
        }
        Node left=lowestCommonAncestor2(node.left, node1, node2);
        Node right=lowestCommonAncestor2(node.right, node1, node2);

        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return  node; // means from both side valid values are there so return the node itself as common .
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        commonAncestor(root, 2, 7);
        //System.out.println(lowestCommonAncestor2(root, 2, 7).data);
        
    }
}
