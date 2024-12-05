package STRINGS;

public class shortest_path {
    public static void path(String str){
        int i=0;
        int j=0;
        for(int k=0;k<str.length();k++){
            if(str.charAt(k)=='W'){
                i=i-1;
            }
            else if(str.charAt(k)=='E'){
                i=i+1;
            }
            else if(str.charAt(k)=='N'){
                j=j+1;
            }
            else if(str.charAt(k)=='S'){
                j=j-1;
            }
            else{
                System.out.println("incorrect character");
            }
        }
        // now calculating path distance
        System.out.println( (int)Math.sqrt(i*i + j*j) );
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        path(str);
    }
}
