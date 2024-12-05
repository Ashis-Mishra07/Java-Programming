package ARRAYS;

public class _2_maxSubArray {
    public static void main(String[] args) {
        // making a prefix array with same length of array
        int arr[] = { 1, -2, 6, -1, 3 };
        int prefix[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            prefix[i]=sum;
        }

        
        int maxSum=0;
        for(int i=0;i<prefix.length;i++){
            int currsum=0;
            for(int j=i;j<prefix.length;j++){
                currsum= i==0?prefix[j]: prefix[j]-prefix[i-1];
                
            }
            maxSum=Math.max(maxSum, currsum);
            
        }
        System.out.println(maxSum);
    }
}
