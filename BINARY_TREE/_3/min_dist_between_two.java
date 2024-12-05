package BINARY_TREE._3;

public class min_dist_between_two {
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
    
    public static Node lca(Node node,int node1,int node2){
        if(node==null){
            return null;
        }
        if(node.data==node1 || node.data==node2){
            return node;
        }
        Node left=lca(node.left, node1, node2);
        Node right=lca(node.right, node1, node2);

        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return node;
    }
    public static int distance(Node node,int node1){
        if(node==null){
            return -1;
        }
        if(node.data==node1){
            return 0;
        }
        int left_dist=distance(node.left, node1);
        int right_dist=distance(node.right, node1);

        if(left_dist==-1 && right_dist==-1){
            return -1;
        }
        else if(left_dist==-1){
            return right_dist+1;
        }
        else{
            return left_dist+1;
        }
    }
    public static int minDist(Node node,int node1,int node2){
        Node common=lca(node, node1, node2);
        int dist1=distance(common, node1);
        int dist2=distance(common, node2);

        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(47);
        root.left = new Node(43);
        root.right = new Node(69);
        root.left.left = new Node(4);
        root.left.right = new Node(44);
        root.right.right = new Node(86);
        root.right.left = new Node(49);


        System.out.println(minDist(root, 44, 86));
    }
}
