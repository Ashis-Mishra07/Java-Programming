package HASHING;

import java.util.*;

public class _3_hashSet_iterators {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("bbsr");
        cities.add("ctk");
        cities.add("balesore");
        cities.add("jajpur");
        cities.add("jharsuguda");
        cities.add("keunjhar");

        // Iterartion operation

        Iterator i=cities.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("............................");


        for(String city :cities){
            System.out.println(city);
        }


    

    }
}
