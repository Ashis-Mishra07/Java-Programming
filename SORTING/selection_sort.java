// remove out the samllest elements everytime and push it at the front .
package SORTING;

public class selection_sort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){// outer loop to run
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){ // acsending order 
                    minpos=j;
                }
            }
            //swaping
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 8, 5, 1 }; 
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
