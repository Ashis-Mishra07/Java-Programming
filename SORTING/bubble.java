package SORTING;

public class bubble {
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,8,5,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        bubble_sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
