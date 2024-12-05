package GRAPHS._5;

public class flood_fill_algo {
    public static void coloring(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(j<arr.length){
                if(arr[i][j]==1){
                    arr[i][j]=2;
                    j++;
                }
                else{
                    j=arr.length;
                }
            }
            while(j<6){
                if(arr[j-3][i]==1){
                    arr[j-3][i]=2;
                    j++;
                }
                else{
                    j=2*arr.length;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={ {1,1,1},{1,1,0},{1,0,1} };
        coloring(arr);
    }
}
