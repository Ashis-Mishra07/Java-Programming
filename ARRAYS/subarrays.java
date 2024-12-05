package ARRAYS;

public class subarrays {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("total subarrys are "+count);// this count includes the single element also .
    }
}
