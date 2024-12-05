package ARRAYS_2D;

public class spiral_matrix {
    public static void spiral(int arr[][]){
        int sR=0;
        int sC=0;
        int eR=arr.length-1;
        int eC=arr[0].length-1;

        while(sR<=eR && sC<=eC){
            if(sR<=eR){
                for (int i = sC; i <= eC; i++) {
                    System.out.print(arr[sR][i]+" ");
                }
            }
            sR++;
            if(sC<=eC){
                for (int i = sR; i <= eR; i++) {
                    System.out.print(arr[i][eC]+" ");
                }
            }
            eC--;
            if(sR<=eR){
                for (int i = eC; i >= sC; i--) {
                    System.out.print(arr[eR][i]+" ");
                }
            }
            eR--;
            if(sC<=eC){
                for(int i=eR;i>=sR;i--){
                    System.out.print(arr[i][sC]+" ");
                }
            }
            sC++;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr);
    }
}
