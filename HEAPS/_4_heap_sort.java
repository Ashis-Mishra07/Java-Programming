package HEAPS;

public class _4_heap_sort {
    public static void heapify(int arr[],int i,int size){
        int maxIndex=i;
        int left=2*maxIndex+1;
        int right=2*maxIndex+2;

        if( left<size && arr[left]>arr[maxIndex] ){
            maxIndex=left;
        }
        if( right<size && arr[right]>arr[maxIndex] ){
            maxIndex=right;
        }

        if( maxIndex!=i){
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;

            heapify(arr, maxIndex, size);
        }
    }
    public static void heapSort(int arr[]){   
        /*heap_sort taken O(n logn) time complexity becoz heapify takes O(logn) TC 
         so calling it n/2 times  , will take about O(n/2 * log n)=O(n logn)


         for both the calling it is 2*O(n logn)=O(n logn)
         */

        // building the max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // push largest at the end
        for(int i=n-1;i>=0;i--){
            //swap  --the first with last element
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;


            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={9,1,2,4,5,3};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }   


        heapSort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
