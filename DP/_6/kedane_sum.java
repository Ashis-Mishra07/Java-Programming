package DP._6;

public class kedane_sum {
    public static void kedane_sum(int arr[]){
        int curr_sum=0;
        int max_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum=curr_sum+arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            else{
                max_sum=Math.max(max_sum, curr_sum);
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -1 };
        kedane_sum(arr);
    }
}
