package ARRAYS_2D;

public class diogonal_sum {
    public static void sum(int arr[][]){
        
        if(arr.length==arr[0].length){
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(i==j || ((i+j)==arr.length-1)){
                           count=count+arr[i][j];
                    }
                }
            }
            System.out.println(count);
        }
        else{
            System.out.println("cant find the main diogonal");
        }
    }

    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4 }, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
        int arr2[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },{ 21, 22, 23, 24, 25 } };
        sum(arr);
        sum(arr2);

    }
}
