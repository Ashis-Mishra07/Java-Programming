package SORTING;

public class merge {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int start,int end,int arr[]){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(start, mid, arr);
        mergeSort(mid+1, end, arr);
        merge( start,end,mid,arr );
    }
    public static void merge(int start,int end,int mid,int arr[]){
        //left [0 to 2]--> 3 elements  right[3 to 5]--> 3 elements
        // length can be written as 5 - 0 + 1  elements 
        int temp[]=new int[end-start+1];

        int i=0; // for first arr
        int j=mid+1; // for second arr
        int k=0; // for temp
        
        // traversing between two arrays
        while(i<mid && j<end){
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
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        //copying temp elements to arr elements
        for(int l=0;l<temp.length;l++){
            arr[l]=temp[l];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,2,5,8};
        mergeSort(0, arr.length-1, arr);
        printArr(arr);

    }
}
