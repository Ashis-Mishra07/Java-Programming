package ARRAYS_2D.ASSIGNMENT;

public class _1 {
    public static int count(int arr[][],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count=count+1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]= { {4,7,8}, {8,8,7} };
        System.out.println(count(arr,7));
    }
}
