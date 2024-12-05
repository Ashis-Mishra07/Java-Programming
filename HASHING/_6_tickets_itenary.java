package HASHING;

import java.util.*;

public class _6_tickets_itenary {
    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> map2 = new HashMap<>();
        // creting a new map and adding the the opposite key value pair
        for (String key : map.keySet()) {
            map2.put(map.get(key), key);
        }

        // now checking the keys
        for (String key : map.keySet()) {
            if (!map2.containsKey(key)) {
                return key; // ----> starting point .
            }
        }
        return null;
    }

    public static void main(String[] args) {   // O(n)
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Benguluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print("-->"+map.get(start));
            start=map.get(start);
        }
        System.out.println("-->Destination");
    }
}
