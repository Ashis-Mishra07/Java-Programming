package ARRAYLIST;

public class pair_sum1 {
    public static void pair(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==key){
                    System.out.print("at i="+i+",j="+j);
                }
            }
            System.out.println();
        }
    }
    public static void pair_optimised(int arr[],int key){
        int point1=0;
        int point2=arr.length-1;
        while(point1<=point2){
            if(arr[point1]+arr[point2]==key){
                System.out.println("at i="+point1+",j="+point2);
                point2--;
                point1++;
            }
            else if(arr[point1]+arr[point2]<key){
                point1++;
            }
            else{
                point2--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        pair(arr, 5);
        pair_optimised(arr, 5);
    }
}
