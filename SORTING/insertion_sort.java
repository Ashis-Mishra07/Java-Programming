package SORTING;
public class insertion_sort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding the correct position to enter the elements
            while(prev>=0 && arr[prev]>=curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 8, 5, 1 };
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
