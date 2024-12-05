package DIVIDE_CONQUER.ASSIGNMENT;

public class _3 {
    static int count=0;
    public static void countInversion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,9,1,2,7,8};
        countInversion(arr);
        System.out.println(count);
    }
}
