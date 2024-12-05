package DIVIDE_CONQUER;

public class quick_sort {
    public static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int index=partition(arr,start,end);
        quickSort(arr, start, index-1); // at which the partition is done that is correct so index-1
        quickSort(arr, index+1, end);
    }
    public static int partition(int arr[],int start,int end){
        int pivot=arr[end]; // arrays last element
        int i=start-1; //taking the pounter ast -1 index;

        //analysing the elements which are shorter than the pivot element
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //now placing the pivot element;
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;

        return i;
    } 
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
    }
}
