package GREEDY_ALGORITHM;

import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsac {
    public static void main(String[] args) {
        int weight[]={ 10 , 20 , 30 };
        int value[]={ 60 , 100 , 120 };

        int ratio[][]=new int[weight.length][2];
        for(int i=0;i<weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1])) ;

        int bagCapacity=50;
        int price=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=ratio[i][0];
            if(bagCapacity>weight[idx]){
                bagCapacity=bagCapacity-weight[idx];
                price=price+value[idx];
            }
            else{
                price+=bagCapacity*ratio[i][1];
                bagCapacity=0;
                break;
            }
        }

        System.out.println(price);
    }
}
