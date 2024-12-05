package HASHING;


import java.util.*;
public class _1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 100);
        map.put("Sri-Lanka", 100);
        map.put("USA", 100);
        map.put("Porutgal", 100);
        map.put("France", 100);

        // System.out.println(map);
        // map.remove("France");
        // System.out.println(map);

        // System.out.println(map.get("India"));


        // Iterate

        Set<String> keys=map.keySet();
        for(String key:map.keySet()){
            System.out.println("key = "+key+" , value = "+map.get(key));
        }
        
    }
}
