package DIVIDE_CONQUER;

public class index_finder {
    public static int index(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // mid on line 1
        if (arr[start] <= arr[mid]) {

            // on left
            if (arr[start] <= target && target <= arr[mid]) {
                return index(arr, start, mid, target);
            }

            // on right
            else {
                return index(arr, mid + 1, end, target);
            }
        }

        // mid on line 2
        else {
            // on right
            if (arr[mid] <= target && target <= arr[end]) {
                return index(arr, mid + 1, end, target);
            }
            // on left
            else {
                return index(arr, start, mid - 1, target);
            }
        }
    }

    public static int finding(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        //int mid = (start + end) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(index(arr, 0, arr.length - 1, 6));
        System.out.println(finding(arr, 6));

    }
}
