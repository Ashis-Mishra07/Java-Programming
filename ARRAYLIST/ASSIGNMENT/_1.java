package ARRAYLIST.ASSIGNMENT;

public class _1 {
    
    public static boolean increasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean decreasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean monotonic(int arr[]){
        return increasing(arr) || decreasing(arr);
    }
    public static void main(String[] args) {
        int arr[]={1,3,2};
        System.out.println(monotonic(arr));
    }
}
