package HEAPS;

import java.util.ArrayList;

public class _3_revision {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int child = arr.size() - 1;
            int parents = (child - 1) / 2;
            while (arr.get(parents) < arr.get(child)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(parents));
                arr.set(parents, temp);

                child = parents;
                parents = (child - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean empty() {
            return arr.size() == 0;
        }

        public  void heapify(int i) {
            int maxIndex = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left<arr.size()-1 && arr.get(left)>arr.get(maxIndex)){
                maxIndex=left;
            }
            if(right<arr.size()-1 && arr.get(right)>arr.get(maxIndex)){
                maxIndex=right;
            }


            if(maxIndex!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(maxIndex));
                arr.set(maxIndex, temp);

                heapify(maxIndex);
            }
        }

        public int remove() {
            int data = arr.get(0);

            int temp = arr.get(arr.size() - 1);
            arr.set(arr.size() - 1, arr.get(0));
            arr.set(0, temp);

            arr.remove(arr.size() - 1);

            heapify(0);

            return data;
        }
    }

    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(6);
        h.add(4);
        h.add(7);
        h.add(2);
        h.add(1);
        h.add(3);
        h.add(5);
        h.add(8);
        while(!h.empty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
