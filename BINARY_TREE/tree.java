package BINARY_TREE;
import java.util.*;

public class tree {
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
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static void levelOrder(Node node){
        Queue<Node> q= new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);

        return Math.max(lh, rh)+1;
    }
    public static int diameter(Node node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        int ld=diameter(node.left);
        int rd=diameter(node.right);

        return Math.max(lh+rh+1, Math.max(ld, rd));
    }
    static class info{
        int height;
        int diameter;
        public info(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public static info height_diameter(Node node){
        if(node==null){
            return new info(0, 0);
        }
        info left=height_diameter(node.left);
        info right=height_diameter(node.right);

        int diameter=Math.max(Math.max(left.diameter, right.diameter),left.height+right.height+1 );
        int height=Math.max(left.height, right.height)+1;

        return new info(height, diameter);
    }
    public static boolean isIdentical(Node node1,Node node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        if(node1.data!=node2.data){
            return false;
        }
        if(!isIdentical(node1.left, node2.left)){
            return false;
        }
        if(!isIdentical(node1.right, node2.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node node1,Node node2){
        if(node1==null){
            return false;
        }
        if(node1.data==node2.data){
            if(isIdentical(node1,node2)){
                return true;
            }
        }
        return isSubtree(node1.left, node2) || isSubtree(node1.right, node2);
    }
    static class info2{
        int hori_dia;
        Node node;
        public info2(int hori_dia,Node node){
            this.hori_dia=hori_dia;
            this.node=node;
        }
    }
    public static void topView(Node node){
        int min=0;
        int max=0;
        Queue<info2> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new info2(0,node));
        q.add(null);

        while(!q.isEmpty()){
            info2 curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hori_dia)){
                    map.put(curr.hori_dia,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info2(curr.hori_dia-1,curr.node.left));
                    min=Math.min(min, curr.hori_dia-1);
                }
                if(curr.node.right!=null){
                    q.add(new info2(curr.hori_dia+1,curr.node.right));
                    max=Math.max(max, curr.hori_dia+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
     public static void bottomView(Node node){
        int min=0;
        int max=0;
        Queue<info2> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new info2(0,node));
        q.add(null);

        while(!q.isEmpty()){
            info2 curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                map.put(curr.hori_dia,curr.node);
                if(curr.node.left!=null){
                    q.add(new info2(curr.hori_dia-1,curr.node.left));
                    min=Math.min(min, curr.hori_dia-1);
                }
                if(curr.node.right!=null){
                    q.add(new info2(curr.hori_dia+1,curr.node.right));
                    max=Math.max(max, curr.hori_dia+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void Kth_level(Node node,int level,int K){
        if(node==null){
            return ; 
        }
        if(level==K){
            System.out.print(node.data+" ");
        }
        Kth_level(node.left, level+1, K);
        Kth_level(node.right, level+1, K);

    }
    public static boolean getPath(Node node,int node1,ArrayList<Node> path){
        if(node==null){
            return false;
        }
        path.add(node);

        if(node.data==node1){
            return true;
        }
        boolean left= getPath(node.left, node1, path);
        boolean right=getPath(node.right, node1, path);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static void lca(Node node,int node1,int node2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(node,node1,path1);
        getPath(node,node2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        System.out.println(path2.get(i-1).data);
    }
    public static void Kth_ancestor(Node node,int node1,int k){
        ArrayList<Node> path=new ArrayList<>();
        getPath(node, node1, path);

        int i=0;
        if(k>path.size()){
            System.out.println("element not available");
        }
        else{
            System.out.println(path.get(path.size()-k-1).data);
        }
    }
    public static int sumTree(Node node){
        if(node==null){
            return 0;
        }
        int leftChild=sumTree(node.left);
        int rightChild=sumTree(node.right);

        int left=node.left==null?0:node.left.data;
        int right=node.right==null?0:node.right.data;

        int data=node.data;
        node.data=leftChild+rightChild+left+right;
        return data;
    }
    public static boolean univalued(Node node){
        if(node==null){
            return true;
        }
        if( node.left !=null && node.left.data!=node.data){
            return false;
        }
        if(node.right!=null && node.right.data!=node.data){
            return false;
        }

        if(univalued(node.left) && univalued(node.right)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //root.right.right.left=new Node(8);

        Node root2=new Node(3);
        root2.left=new Node(6);
        root2.right=new Node(7);
        root2.right.left=new Node(8);

        Node root3=new Node(2);
        root3.left=new Node(2);
        root3.right=new Node(2);
        root3.right.left=new Node(2);
        root3.left.left=new Node(2);


        // preOrder(root);

        // inOrder(root);

        // postOrder(root);

        // levelOrder(root);

        //System.out.println(height(root));

        //System.out.println(diameter(root));

        //System.out.println(height_diameter(root).diameter);

        //System.out.println(isSubtree(root, root2));

        // topView(root);

        // bottomView(root);

        //Kth_level(root, 1, 3);

        //lca(root, 3, 7);
 
        //Kth_ancestor(root, 7, 9);

        // sumTree(root);

        // levelOrder(root);

        //System.out.println(univalued(root3));
    }
}
