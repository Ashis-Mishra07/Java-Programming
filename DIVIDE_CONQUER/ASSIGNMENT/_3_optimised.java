package DIVIDE_CONQUER.ASSIGNMENT;

public class _3_optimised {
    public static int mergeSort(int arr[],int start,int end){
        int count=0;
        if(start<end){
            int mid=start+(end-start)/2;
            count=count+mergeSort(arr, start, mid);
            count=count+mergeSort(arr, mid+1, end);
            count=count+merge(arr,start,mid,end);
        }
        return count;
    }
    public static int merge(int arr[],int start,int mid,int end){
        int count=0;
        int temp[]=new int [end-start+1];
        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                count=count+(mid-i);
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(i=start,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 9, 1, 2, 7, 8 };
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }
}
