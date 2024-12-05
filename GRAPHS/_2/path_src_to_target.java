package GRAPHS._2;

import java.util.ArrayList;

public class path_src_to_target {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void making(ArrayList<Edge> [] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }
    public static void allPaths(ArrayList<Edge>[] graph,int curr,int dest,String path){ //O(v^v)--> inefficient
        if(curr==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            allPaths(graph, e.dest, dest, path+curr+" -> ");
        }
    }
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        making(graph);
        allPaths(graph, 5, 0, "");
    }
}
