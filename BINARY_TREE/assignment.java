package BINARY_TREE;

import java.util.*;
public class assignment {
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
    public static void levelOrder(Node node){
        Queue<Node> q=new LinkedList<>();
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
    public static void invert(Node node){
        if(node==null){
            return;
        }
        Node data1=node.left;
        node.left=node.right;
        node.right=data1;

        invert(node.left);
        invert(node.right);

    }
    public static Node deleteLeaf(Node node,int k){
        if(node==null){
            return null;
        }
        node.left=deleteLeaf(node.left, k);
        node.right=deleteLeaf(node.right, k);

        if(node.data==k && node.left==null && node.right==null){
            return null;
        }
        return node;
    }

    static ArrayList<Integer> arr=new ArrayList<>();

    public static int maxSum(Node node){
        if(node==null){
            return 0;
        }
        int leftsum=maxSum(node.left);
        int rightsum=maxSum(node.right);

        int max_single=Math.max(Math.max(leftsum, rightsum)+node.data, node.data);
        int max_top=Math.max(max_single, leftsum+rightsum+node.data);

        return max_top;
    }

    static HashMap<String,Integer>m;

    public static String duplicate(Node node){
        if(node==null){
            return "";
        }
        String str="( ";
        str+=duplicate(node.left);
        str+=Integer.valueOf(node.data);
        str+=duplicate(node.right);
        str+=" )";

        if (m.get(str) != null && m.get(str) == 1){
            System.out.print(node.data + " ");
        }
            
        if (m.containsKey(str)){
             m.put(str, m.get(str) + 1);
        }
        else{
            m.put(str, 1);
        }
            
        return str;
    }
    public static void print(Node node){
        m=new HashMap<>();
        duplicate(node);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(8);
        root.left.right=new Node(5);
        root.right.left=new Node(8);
        root.right.right=new Node(7); 

        Node root2=new Node(-10);
        root2.left=new Node(9);
        root2.right=new Node(20);
        root2.right.left=new Node(15);
        root2.right.right=new Node(7);

        Node root3=new Node(1);
        root3.left=new Node(4);
        root3.right=new Node(3);
        root3.left.left=new Node(3);
        root3.right.left=new Node(4);
        root3.right.right=new Node(3);
        root3.right.left.left=new Node(3);

        // invert(root);
        //levelOrder(root);

        //deleteLeaf(root, 8);
        //levelOrder(root);

        // System.out.println( maxSum(root2));;
        // System.out.println(arr);

        print(root);
    }
}
