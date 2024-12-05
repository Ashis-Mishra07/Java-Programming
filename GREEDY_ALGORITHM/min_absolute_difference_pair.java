package GREEDY_ALGORITHM;

import java.util.Arrays;

public class min_absolute_difference_pair {
    public static void main(String[] args) {
        // int A[]={4,1,8,7};
        // int B[]={2,3,6,5};
        
        int A[]={1,2,3};
        int B[]={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int differ=0;
        for(int i=0;i<A.length;i++){
            differ=differ+(Math.abs(A[i]-B[i]));
        }
        System.out.println(differ);
    }
}
