package SAGMENT_TREE;

import java.util.*;

public class query_update {
    static int tree[];
    public static void init(int arr[]){
        tree=new int[4 * arr.length];
    }
    public static void printTree(){
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
    public static int making(int arr[],int i,int start,int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        making(arr, 2*i+1 , start, mid);
        making(arr, 2*i+2 , mid+1, end);

        tree[i]=tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }
    public static int query_util(int qi,int qj,int si,int sj,int i){
        if(qj<=si || sj<=qi){
            return 0;
        }
        else if(qi<=si && qj>=sj){
            return tree[i];
        }
        else{
            int mid=(si+sj)/2;
            int left=query_util(qi, qj, si, mid, 2*i+1);
            int right=query_util(qi, qj, mid+1, sj,  2*i+2);
            return left+right;
        }
    }
    public static int query(int arr[],int qi,int qj){
        return query_util(qi, qj, 0, arr.length-1, 0);
    }


    public static void updateUtil(int i,int si,int sj,int index,int diff){
        if(index<si || index>sj){
            return;
        }
        tree[i]=tree[i]+diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i + 1, si, mid, index, diff);
            updateUtil(2*i +2 , mid+1, sj, index, diff);
        }
    }
    public static void update(int arr[],int index,int newValue){
        int diff=newValue-arr[index];
        arr[index]=newValue;
        updateUtil(0, 0, arr.length-1, index, diff);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        init(arr);
        making(arr,0, 0, arr.length-1);

        //printTree();

        System.out.println(query(arr, 1, 4));
        // update(arr, 2, 2);
        // printTree();

    }
}
