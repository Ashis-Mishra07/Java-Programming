package ARRAYS;

public class stocks {
    public static void buying_stocks(int arr[]) {
        int maxProfit = 0;
            for (int i = 0; i < arr.length; i++) {
                int profit = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    profit = arr[j] - arr[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }

            System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 6,4,3,1 };
        buying_stocks(arr);
    }
}
