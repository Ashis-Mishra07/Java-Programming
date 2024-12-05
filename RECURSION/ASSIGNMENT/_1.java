package RECURSION.ASSIGNMENT;

public class _1 {
    public static void search(int arr[],int index,int key){
        if(index==arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index+" ");
        }
        search(arr, index+1, key);
    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        search(arr, 0, 2);
    }
}
