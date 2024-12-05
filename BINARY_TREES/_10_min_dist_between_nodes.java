package BINARY_TREES;

public class _10_min_dist_between_nodes {
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
    public static Node lca(Node node,int n1,int n2){
        if(node==null){
            return null;
        }
        if(node.data==n1 || node.data==n2){
            return node;
        }
        Node left=lca(node.left, n1, n2);
        Node right=lca(node.right, n1, n2);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }

        return node;
    } 

    public static int distance(Node node,int n){
        if(node==null){
            return -1;
        }
        if(node.data==n){
            return 0;  // overlapping condition
        }
        int left_dist=distance(node.left, n);
        int right_dist=distance(node.right, n);
        
        if(left_dist==-1 && right_dist==-1){
            return -1;
        }
        else if(left_dist==-1){
            return right_dist+1;
        }
        else {
            return left_dist+1;
        }
    }
    public static int minDist(Node node,int n1,int n2){
        Node lca=lca(node, n1, n2);
        int dist1=distance(lca,n1);
        int dist2=distance(lca,n2);

         return dist1+dist2;
    }   
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        System.out.println(minDist(node, 4, 6));
    }
}
