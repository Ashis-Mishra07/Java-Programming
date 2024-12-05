package QUEUE.ASSIGNMENT;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class _3 {
    static class info implements Comparable<info>{
        int deadline;
        int cost;
        int id;
        public info(int deadline,int cost,int id){
            this.deadline=deadline;
            this.cost=cost;
            this.id=id;
        }
        @Override
        public int compareTo(info i){
            return i.cost-this.cost;
        }
    }
    static ArrayList<String> seqarr=new ArrayList<>();
    public static void seq(int arr[][]){
        PriorityQueue<info> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new info(arr[i][0], arr[i][1], arr[i][2]));
        }

        int time=0;
        while(!pq.isEmpty()){
            info curr=pq.remove();
            if(curr.deadline>time){
                seqarr.add("job-"+curr.id);
            }
            time++;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{4,20,0},{1,10,1},{1,40,2},{1,30,3}};
        seq(arr);
        System.out.println(seqarr);
    }
}
