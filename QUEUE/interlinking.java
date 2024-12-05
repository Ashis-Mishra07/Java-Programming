package QUEUE;

import java.util.*;
public class interlinking {
    static Queue<Integer> q=new LinkedList<>();
    public static void interlink(int arr[]){
        int mid=arr.length/2;
        int start=0;
        while(mid!=arr.length){
            q.add(arr[start]);
            q.add(arr[mid]);
            start++;
            mid++;
        }
    }
    public static void interlink2(){
        Queue<Integer> temp=new LinkedList<>();
        int mid=q.size()/2;
        while(mid!=0){
            temp.add(q.remove());
            mid--;
        }

        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        // interlink(arr);
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interlink2();
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
