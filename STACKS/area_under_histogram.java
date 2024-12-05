package STACKS;

import java.util.*;
import java.util.Stack;

public class area_under_histogram {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int area(int arr[]){
        int arrL[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!s.isEmpty() && curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arrL[i]=-1;
            }
            else{
                arrL[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        int arrR[]=new int[arr.length];
        
        
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arrR[i]=arr.length;
            }
            else{
                arrR[i]=s.peek();
            }
            s.push(i);
        }
        
        int max=0;
        for(int i=0;i<arrL.length;i++){
            max=Math.max(max, (arrR[i]-arrL[i]-1)*arr[i]);
        }
        return max;
    }
    public static void maxArea(int arr[]){
        int arrLeft[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        arrLeft[0]=-1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                arrLeft[i]=-1;
            }
            else{
                arrLeft[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        int arrRight[]=new int[arr.length];
        arrRight[arrRight.length-1]=arrRight.length;
        s.push(arrRight.length-1);
        for (int i = arr.length-2; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                arrRight[i] = arrRight.length;
            } else {
                arrRight[i] = s.peek();
            }
            s.push(i);
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,(arrRight[i]-arrLeft[i]-1)*arr[i]);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        // int arr[]={1,0,1,1,1};
        // System.out.println(area(arr));
        // maxArea(arr);
        
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);

        Node curr=head;
        Node prev=null;
        Node next;
        while(curr.next!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        System.out.println(curr.data);
        System.out.println(prev.data);
        
    }
}
