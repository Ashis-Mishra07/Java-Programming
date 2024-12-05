package BINARY_TREE._2;

public class diameter {
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
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);

        return Math.max(left, right)+1;
    }
    public static int diameter(Node node){ // O( n^2 )
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);

        int self_dia=lh+rh+1;

        int ld=diameter(node.left);
        int rd=diameter(node.right);

        return Math.max(self_dia, Math.max(ld, rd));
    }


    static class info{
        int diameter;
        int height;

        public info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public static info diameter2(Node node){
        if(node==null){
            return new info(0, 0);
        }

        info left=diameter2(node.left);
        info right=diameter2(node.right);

        int diam= Math.max(left.height+right.height+1, Math.max(left.diameter, right.diameter));
        int height=Math.max(left.height, right.height)+1;
        return new info(diam, height);

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(diameter(root));

        System.out.println(diameter2(root).diameter);

    }
}
