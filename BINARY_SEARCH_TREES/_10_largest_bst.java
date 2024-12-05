package BINARY_SEARCH_TREES;

public class _10_largest_bst {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
    static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        public info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    static int maxBST=0;
    public static info largestBST(Node node){
        if(node==null){
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftinfo=largestBST(node.left);
        info rightinfo=largestBST(node.right);

        int size=leftinfo.size+rightinfo.size+1;
        int min=Math.min(node.data, Math.min(leftinfo.min, rightinfo.min));
        int max=Math.max(node.data, Math.max(leftinfo.max, rightinfo.max));

        if(node.data<=leftinfo.max || node.data>=rightinfo.min){
            return new info(false, size, min, max);
        }
        if(leftinfo.isBST && rightinfo.isBST){
            maxBST=Math.max(size, maxBST);
            return new info(true, size, min, max);
        }

        return new info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node node=new Node(50);
        node.left=new Node(30);
        node.right=new Node(60);
        node.left.left=new Node(5);
        node.left.right=new Node(20);
        node.right.right=new Node(70);
        node.right.left=new Node(45);
        node.right.right.right=new Node(80);
        node.right.right.left=new Node(65);

        info infor=largestBST(node);
        System.out.println(maxBST);
    }
}
