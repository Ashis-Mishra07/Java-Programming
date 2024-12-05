package SORTING;

public class counting_sort {
    public static void  counting(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //System.out.println(max);
        int countarr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            countarr[curr]=countarr[curr]+1;
        }
        for(int i=0;i<countarr.length;i++){
            if(countarr[i]!=0){
                while(countarr[i]!=0){
                    System.out.print(i+" ");
                    countarr[i]--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,4,1,3,2,4,3,7};
        counting(arr);
    }
}
