package HASHING;

import java.util.*;

public class _1_hash_implementation {
    static class HashMap<K, V> { // inside the angular brackets are called generic
        // since we can't decide whether to make the key as of which type so used
        // angular brackets
        // just to generalise the type of key and it's value .
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n --> total no of nodes
        private LinkedList<Node> buckets[]; // N --> total size of array of linked list

        @SuppressWarnings("unchecked")   //  this will supress the warnings and to make it unchecked
        public HashMap() { // constructer
            this.size = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
                // the above will create empty linked liost and each empty arrays.
                // if we not write it, it will simply make array spaces empty , but here we made
                // empty linkedlist and each empty array
            }

        }

        public void put(K key,V value){
            
        }
    }

    public static void main(String[] args) {

    }
}
