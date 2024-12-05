package HASHING;

import java.util.HashSet;

public class _5_union_intersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();

        // UNION O(n + m)

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("The total union elements are " + set.size());

        // INTERSECTION



        /*
         * O(N^2)
         * 
         * HashSet<Integer> set2=new HashSet<>();
         *  for(int i=0;i<arr1.length;i++){
         *     for(int j=0;j<arr2.length;j++){
         *        if(arr1[i]==arr2[j]){
         *            set2.add(arr1[i]);
         *        }
         *     }
         * }
         * System.out.println("The total intersection elements are "+set2.size());
         * 
         * 
         */

         //O(n)
         
         HashSet<Integer> set2=new HashSet<>();
         for(int i=0;i<arr1.length;i++){
            set2.add(arr1[i]);
         }

         int count=0;

         for(int i=0;i<arr2.length;i++){
            if(set2.contains(arr2[i])){
                count+=1;
                set2.remove(arr2[i]);
            }
         }

         System.out.println("The total intersection elements are "+count);
         


    }
}
