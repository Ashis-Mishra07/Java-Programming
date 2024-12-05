package GREEDY_ALGORITHM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity_selection {
    static int count=1;// selecting the first work
    public static int maxWork(int activities[][],ArrayList<Integer> arr){
        int lastwork=activities[0][2];
       
        for(int i=1;i<activities.length;i++){
            if(activities[i][1]>=lastwork){
                count=count+1;
                lastwork=activities[i][2];
                arr.add(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting if it is not sorted
        int activities[][]=new int[end.length][3];
        for(int i=0;i<activities.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));


        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(activities[0][0]);

        maxWork(activities,arr);
        for(int i=0;i<arr.size();i++){
            System.out.print("A"+arr.get(i)+" ");
        }
        System.out.println();
    }
}
