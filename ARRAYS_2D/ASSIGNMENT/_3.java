package ARRAYS_2D.ASSIGNMENT;

public class _3 {
    public static void transpose (String arr[][]){
        String temp[][]=new String[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temp[j][i]=arr[i][j];
            }
        }
        print(temp);
    }
    public static void print(String arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String arr[][]={ {"a1","a2","a3"},{"a4","a5","a6"} };
        print(arr);
        System.out.println();
        transpose(arr);
    }
}
