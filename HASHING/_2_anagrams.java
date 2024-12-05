package HASHING;

import java.util.*;
public class _2_anagrams {
    public static void main(String[] args) {
        
        
        
        /*
         
        
        String str1="race";
        String str2="race";

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean b=true;
        if(ch1.length != ch2.length){
            b=false;
        }
        else{
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    b=false;
                    break;
                }
            }
        }

        if(b){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }

        */

        String str1="racet";
        String str2="cares";

 
        LinkedHashMap<Character,Integer> map1=new LinkedHashMap<>();
    
        boolean b=true;

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);

            if(map1.get(ch)!=null){
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }
                else{
                    map1.put(ch, map1.get(ch)-1);
                }
            }
            else{
                b=false;
                break;
            }
        }


        if(map1.isEmpty()){
            b=true;
        }
        else{
            b=false;
        }


        if(b){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }

    }
}
