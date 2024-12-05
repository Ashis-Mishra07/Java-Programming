package STACKS.ASSIGNMENT;

import java.util.*;
public class _1 {
    public static boolean isPali(LinkedList<Integer> ll){
        LinkedList<Integer> newll=new LinkedList<>();
        for(int i=ll.size()-1;i>=0;i--){
            newll.add(ll.get(i));
        } 
        //now checking
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)!=newll.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(4);
        System.out.println(isPali(ll));
    }
}
