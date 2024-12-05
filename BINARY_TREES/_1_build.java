package BINARY_TREES;

public class _1_build {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
            Node left=null;
            Node right=null;
        }
    }
    static class binaryTree{
        static int i=-1;
        public static Node buildtree(int noded[]){
            i++;
            if(noded[i]==-1){
                return null;
            }
            Node newNode=new Node(noded[i]);
            newNode.left=buildtree(noded);
            newNode.right=buildtree(noded);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int noded[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildtree(noded);
        System.out.println(root.data);
    }
}
