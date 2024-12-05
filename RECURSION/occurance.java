package RECURSION;

public class occurance {
    public static int firstOcuurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcuurance(arr, key, i+1);
        
    }
    public static int lastOccurance(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1); 
    }
    public static void main(String[] args) {
        int arr[]={1,23,4,3,6,3,9,5,7,5,4,2,2,4,67,8,2};
        System.out.println(firstOcuurance(arr, 2, 0));
        System.out.println(lastOccurance(arr, 2, arr.length-1));
        
    }
}
