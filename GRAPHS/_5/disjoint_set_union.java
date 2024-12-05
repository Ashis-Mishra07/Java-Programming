package GRAPHS._5;

public class disjoint_set_union {
    static int vertices = 7;
    static int parent[]=new int[vertices];
    static int rank[]=new int[vertices];

    public static void intiating(){
        for(int i=0;i<vertices;i++){
            parent[i]=i;
        }
    }
    // public static int find(int num){ // finding the final leader
    //     if(num==parent[num]){
    //         return num;
    //     }
    //     return find(parent[num]);
    // }
    public static int find(int num){
        if(num==parent[num]){
            return num;
        }
        return parent[num]=find(parent[num]); // ones the leader is found by its child it will store the data itself with. 
                                              //this will reduce the iteration of the next calling of same element
    }
    public static void union(int a ,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            parent[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            parent[parA]=parB;
        }
        else{
            parent[parB]=parA;
        }
    }
    public static void main(String[] args) {
        intiating();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        union(1, 5);
        System.out.println(find(1));
    }
}
