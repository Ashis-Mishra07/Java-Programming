package HASHING;


import java.util.*;

public class _3_hashSet_implementation {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);

        System.out.println(set); // [ 1, 2, 3, 4 ]
        
    }
}
