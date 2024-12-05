package GREEDY_ALGORITHM.ASSIGNMENT;

import java.util.ArrayList;

public class _4 {
    public static boolean isDecreasing(int prices[]){
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isIncreasing(int prices[]){
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]>prices[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int maxProfit(int prices[]){
        if(isDecreasing(prices)){
            return 0;
        }
        if(isIncreasing(prices)){
            return prices[prices.length-1]-prices[0];
        }

        
        int Profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                Profit=Math.max(Profit, prices[i]-prices[j]);
            }
        }
        return Profit;
    }
    public static void main(String[] args) {
        int prices[]={7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
