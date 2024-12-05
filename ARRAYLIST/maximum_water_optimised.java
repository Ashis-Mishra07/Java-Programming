package ARRAYLIST;

public class maximum_water_optimised {
    public static void main(String[] args) {
        int arr[]= { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int point1=0;
        int point2=arr.length-1;
        int max=0;
        while(point1<point2){
            if(arr[point1]<arr[point2]){
                //max = Math.max(Math.abs(point1 - point2) * Math.min(arr[point1], arr[point2]), max);
                point1++;
            }
            else{
                //max = Math.max(Math.abs(point1 - point2) * Math.min(arr[point1], arr[point2]), max);
                point2--;
            }
            max = Math.max(Math.abs(point1 - point2) * Math.min(arr[point1], arr[point2]), max);
        }
        System.out.println(max);
    }
}
