package DIVIDE_CONQUER;

public class merge_sort {
    public static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=(end+start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
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
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            k++;
            j++;
        }

        for(i=start,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,5,4,7,5,6,1,6,4};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
