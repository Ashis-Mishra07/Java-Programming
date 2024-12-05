package ARRAYLIST;

public class pair2_sum {
    public static void pair2(int arr[], int key) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(minIndex+","+maxIndex);

        while (minIndex != maxIndex) {
            if (arr[minIndex] + arr[maxIndex] == key) {
                int i=minIndex;
                int j=maxIndex;
                if(i<j){
                    System.out.println("present at i=" + i + " j=" + j);
                }

                
                if (minIndex == arr.length - 1) {
                    minIndex = 0;
                }
                else if(minIndex!=arr.length-1){
                    minIndex++;
                }
                if (maxIndex == 0) {
                    maxIndex = arr.length - 1;
                }
                else if(maxIndex!=0){
                    maxIndex--;
                 }

                // minIndex=minIndex==arr.length-1?minIndex=0:minIndex++;
                // maxIndex=maxIndex==0?arr.length-1:maxIndex--;

            
            } 
            else if (arr[minIndex] + arr[maxIndex] < key) {
                if (minIndex == arr.length - 1) {
                    minIndex = 0;
                } else {
                    minIndex++;
                }
            } 
            else {
                if (maxIndex == 0) {
                    maxIndex = arr.length - 1;
                } else {
                    maxIndex--;
                }
            }
        }
       
    }
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        pair2(arr, 17);
    }
}
