package SORTING;

public class rough {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int start, int end, int arr[]) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);
        merge(start, mid, end, arr);
    }
    public static void merge(int start,int mid,int  end, int arr[]){
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid ){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for( int l=start,m=0;m<temp.length;l++,m++){
            arr[l]=temp[m];
        }
    }


    public static void main(String[] args) {
        int arr[] = { 7,5,2,98,3,1 };
        printArr(arr);
        mergeSort(0, arr.length-1, arr);
        printArr(arr);
    }
}
