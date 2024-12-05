package ARRAYS_2D;

public class search {
    public static boolean bruteSearch(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    // here the main catch is to select a correct position to start traversing i.e off diogonal corner points.
    public static boolean trickSearch(int arr[][], int key) {  // O(row +col) -->which oje greater decides the complexity
        int startRow = arr.length-1;
        int startCol = 0;
        while (startRow >=0 && startCol < arr.length) { // here while is necessary or else the row may be become out of the range and certainly it will give false everytime
            if (arr[startRow][startCol] == key) {
                return true;
            } else if (key > arr[startRow][startCol]) {
                startCol++;
            } else {
                
                startRow--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 100;
        System.out.println(bruteSearch(arr, key));
        System.out.println(trickSearch(arr, key));
    }
}
