package GRAPHS._2;

import java.util.*;

public class modified_dfs {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void making(ArrayList<Edge> [] graphs ){
        for(int i=0;i<graphs.length;i++){
            graphs[i]=new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));

        graphs[1].add(new Edge(1, 0, 1));

        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 3, 1));
        graphs[2].add(new Edge(2, 4, 1));

        graphs[3].add(new Edge(3, 2, 1));

        graphs[4].add(new Edge(4, 2, 1));

        graphs[5].add(new Edge(5, 6, 1));
        graphs[5].add(new Edge(5, 7, 1));

        graphs[6].add(new Edge(6, 5, 1));
        graphs[6].add(new Edge(6, 7, 1));

        graphs[7].add(new Edge(7, 5, 1));
        graphs[7].add(new Edge(7, 6, 1));
        graphs[7].add(new Edge(7, 8, 1));
        graphs[7].add(new Edge(7, 9, 1));

        graphs[8].add(new Edge(8, 7, 1));

        graphs[9].add(new Edge(9, 7, 1));

        graphs[10].add(new Edge(10, 11, 1));

        graphs[11].add(new Edge(11, 10, 1));
        
    }
    public static void dfs(ArrayList<Edge> [] graphs){
       boolean b[]=new boolean[graphs.length];
        for(int i=0;i<b.length;i++){
            b[i]=false;
        }
        for(int i=0;i<graphs.length;i++){
            dfs_util(graphs,b,i);
        }
        
    }
    public static void dfs_util(ArrayList<Edge> [] graphs,boolean b[],int ele){
         System.out.print(ele+" ");
         b[ele]=true;

         for(int i=0;i<graphs[ele].size();i++){
            Edge e=graphs[ele].get(i);
            if(b[e.dest]==false){
                
                dfs_util(graphs, b, e.dest);
            }
         }
    }
    public static void main(String[] args) {
        int vertices=12;
        ArrayList<Edge> [] graphs=new ArrayList[vertices];
        making(graphs);
        dfs(graphs);
    }
}
