package GREEDY_ALGORITHM;

import java.util.ArrayList;

public class coin_making {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;
        int count = 0;
        int counter = arr.length - 1;
        ArrayList<Integer>coins=new ArrayList<>();
        while (amount != 0 && counter != 0) {
            if (amount - arr[counter] >= 0) {
                while (amount - arr[counter] >= 0) {
                    count++;
                    amount -= arr[counter];
                    coins.add(arr[counter]);
                }
            }
            counter--;
        }
        System.out.println(count);
        System.out.println(coins);
    }
}
