package QUEUE.ASSIGNMENT;

public class _5 {
    public static void maxThree(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int max=0;
            for(int j=i;j<i+3;j++){
                max=Math.max(max, arr[j]);
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6 };
        maxThree(arr);
    }
}
