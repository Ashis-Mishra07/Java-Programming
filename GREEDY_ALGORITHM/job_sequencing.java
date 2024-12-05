package GREEDY_ALGORITHM;

import java.util.*;

public class job_sequencing {
    public static void main(String[] args) {
        int job[][]={ {1,2,100},{2,1,19},{3,2,27},{4,1,25},{5,1,15} };
        Arrays.sort(job,Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> arr=new ArrayList<>();
        int time=0;
        for(int i=job.length-1;i>=0;i--){
            if(time<=job[i][1]){
                arr.add(job[i][0]);
                time=job[i][1];
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println("work"+arr.get(i));
        }
    }
}
