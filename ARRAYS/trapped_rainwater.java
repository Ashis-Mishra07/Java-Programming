package ARRAYS;

public class trapped_rainwater {
    public static void waterTrapped(int arr[]){
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];

        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }



        int waterTrapped=0;
        for(int i=0;i<arr.length;i++){
             waterTrapped = waterTrapped + Math.min(leftMax[i], rightMax[i])-arr[i];
        }
        System.out.println(waterTrapped);
    }
    public static void main(String[] args) {
        int arr[]={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        waterTrapped(arr);
    }
}
