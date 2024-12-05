package DP._1;

import java.util.*;
public class fractional_knapsac {
    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };
        int value[] = { 60, 100, 120 };
        int capacity=50;

        int ratio[][]=new int[weight.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][1]=value[i]/weight[i];
            ratio[i][0]=i;
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//ascending order
        int cost=0;
        for(int i=ratio.length-1;i>=0;i--){
            int index=ratio[i][0];
            if(capacity>weight[index]){
                capacity=capacity-weight[index];
                cost=cost+value[index];
            }
            else{
                
                cost=cost+ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.println(cost);
    }
}
