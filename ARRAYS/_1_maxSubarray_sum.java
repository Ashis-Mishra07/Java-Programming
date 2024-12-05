package ARRAYS;

public class _1_maxSubarray_sum {  // O (n^3)
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int sumMax=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.print(sum+" ");
                sumMax=Math.max(sum, sumMax);
            }
        }
        System.out.println();
        System.out.println(sumMax);
    }
}
