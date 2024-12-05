package RECURSION;

public class tiling {
    public static int count(int length){
        if(length==1 || length==0){
            return 1;
        }
        // if horizontally placed
        int hori=count(length-2);
        // if vertically placed 
        int verti=count(length-1);

        return hori+verti;
    }
    public static int counting(int length){
        if(length==1 || length==0){
            return 1;
        }

        int hori= counting(length-2);
        int verti= counting(length-1);

        return hori+verti;
    }
    public static void main(String[] args) {
        int length=4;
        // int breadth=2; --this is fix
        System.out.println(count(length));
    }
}
