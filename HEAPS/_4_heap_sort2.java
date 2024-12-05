package HEAPS;

public class _4_heap_sort2 {
    public static void heapify(int arr[],int i,int size){
        int minIndex=i;
        int left =2*i+1;
        int right=2*i+2;

        if(left<size && arr[left]<arr[minIndex]){
            minIndex=left;
        }
        if(right<size && arr[right]<arr[minIndex]){
            minIndex=right;
        }


        if(minIndex!=i){
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            heapify(arr, minIndex, size);
        }
    }
    public static void heap_sort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
         int arr[]={1,2,4,5,3};

          heap_sort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
