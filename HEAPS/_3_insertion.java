package HEAPS;

import java.util.*;

public class _3_insertion {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {  // O(log n)

            // adding at the end
            arr.add(data);  // O(1)

            // finding the child's index which is at the end of the array
            int childIndex = arr.size() - 1; // O(1)

            // from the child's index trying to get the parents's index
            int parentIndex = (childIndex - 1) / 2;  // O(1)


            //checking the condition if comes true then swapping the condtions.
            while (arr.get(childIndex) < arr.get(parentIndex)) {  // > for logic change
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            } 
            //time complexity of traversing is O(log n) because everytime we are going near to the parents node
            // if n node then log n levels are there, so each step we are going to next level so log n time comp.
        }



        public int peek(){
            // for a minimum heap the starting index is the min element in the heap 
            return arr.get(0);
        }




        private void heapify(int i){  //O(log n)

            int left=2*i +1;  //it is the left node
            int right=2*i +2;  //it is the right node
            int minIndex=i;    // taking the min Node initially as the root node for comparision

            if(left<arr.size()-1 && arr.get(minIndex)>arr.get(left)){  // > for logic change
                minIndex=left;

                // initailly it is checked whether the left value is samller than the arr'th index or not
                // if it is then initiating the operations. 
            }
            if(right<arr.size()-1 && arr.get(minIndex)>arr.get(right)){   // > for logic change
                minIndex=right;
            }


            // if the min value is changed then only do the swapping process
            // if the ith index is still the same the no need of doing the swapping
            if(minIndex!=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);


                // calling the heapify function recursively for the next level of odes it is not 
                // adjust
                heapify(minIndex);
            }
        }
        public int remove(){  //O(log n)

            // data that is to be deleted
            int data=arr.get(0);

            // swapping the first and last index value
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, arr.get(0));


            //delete the last index
            arr.remove(arr.size()-1);


            //heapify
            // first calling is for the root node
            heapify(0);

            // here written to send the deleted node
            return data;
        }


        public boolean isEmpty(){
            return arr.size()==0;
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


        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
