package DIVIDE_CONQUER.ASSIGNMENT;

import java.util.*;

public class _1 {
    public static void mergeSort(String arr[], int start, int end) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid-1 );
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(String arr[], int start, int mid, int end) {
        String temp[] = new String[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            String str1 = arr[i];
            String str2 = arr[j];
            if (str1.compareTo(str2) < 0) {
                temp[k] = str1;
                i++;
            } 
            else {
                temp[k] = str2;
                j++;
            }
            k++;
        }
        while (i <= mid) {
            String str1 = arr[i];
            temp[k] = str1;
            i++;
            k++;
        }
        while (j <= end) {
            String str2 = arr[j];
            temp[k] = str2;
            j++;
            k++;
        }

        for (i = start, k = 0; k < temp.length; k++, i++) {
            arr[start] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
