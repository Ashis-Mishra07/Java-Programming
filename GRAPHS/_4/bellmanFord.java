package GRAPHS._4;

import java.util.*;

public class bellmanFord {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int det, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void making(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellman(ArrayList<Edge> graph[], int src) {
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int verti=graph.length;

        // so averally the time complexity is O(E*V);

        //outer --O(V)
        for(int i=0;i<verti-1;i++){
            //inner --O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int wt=e.weight;
                    int v=e.dest;
                    if(dist[u]!=Integer.MAX_VALUE && (dist[u]+wt<dist[v])){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        making(graph);
        bellman(graph, 0);
    }
}