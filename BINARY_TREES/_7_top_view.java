package BINARY_TREES;
import java.util.*;
public class _7_top_view {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            Node left=null;
            Node right=null;
        } 
    }
    static class info{
        Node node;
        int hori_dis;
        public info(Node node,int hori_dis){
            this.node=node;
            this.hori_dis=hori_dis;
        }
    }
    public static void top_view(Node node){
        Queue<info> q=new LinkedList<>();
        HashMap<Integer,Node> hash=new HashMap<>();

        int min=0;
        int max=0;

        q.add(new info(node,0));
        q.add(null);

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }          
            }
            else{
                if(!hash.containsKey(curr)){
                    hash.put(curr.hori_dis,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info(curr.node.left,curr.hori_dis-1));
                    min=Math.min(min,curr.hori_dis-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right,curr.hori_dis+1));
                    max=Math.max(max,curr.hori_dis+1);
                }
            }
        } 
        for(int i=min;i<=max;i++){
            System.out.print(hash.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);

        top_view(node);
    }
}
