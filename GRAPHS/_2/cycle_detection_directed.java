package GRAPHS._2;

import java.util.ArrayList;

public class cycle_detection_directed {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void making(ArrayList<Edge> [] graphs ){
        for(int i=0;i<graphs.length;i++){
            graphs[i]=new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 2, 1));
        

        graphs[1].add(new Edge(1, 0, 1));
        

        graphs[2].add(new Edge(2, 3, 1));
        

        graphs[3].add(new Edge(3, 0, 1));
    }
    public static boolean iscycle(ArrayList<Edge> []graphs ){  // T.C -->  O( V + E )
        boolean vis[]=new boolean[graphs.length];
        boolean stack[]=new boolean[graphs.length];

        for(int i=0;i<graphs.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graphs,i,vis,stack)){ // if this will return true then function will retun true
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graphs ,int ele , boolean vis[],boolean stack[]){
        vis[ele]=true;
        stack[ele]=true;
        for(int i=0;i<graphs[ele].size();i++){
            Edge e=graphs[ele].get(i);
            if(stack[e.dest]){  // means in the recursion cycle  the neighbour is presnt in the stack 
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graphs, e.dest, vis, stack)){
                return true;
            }
        }
        stack[ele]=false;
        return false;
    }
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        making(graphs);
        System.out.println(iscycle(graphs));
    }
}
