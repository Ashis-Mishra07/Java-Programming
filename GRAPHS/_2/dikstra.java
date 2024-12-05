package GRAPHS._2;

import java.util.*;
public class dikstra {
    static class Edge{
        int weight;
        int src;
        int dest;
        public Edge(int weight,int src,int dest){
            this.weight=weight;
            this.src=src;
            this.dest=dest;
        }
    }
    public static void making(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(2, 0, 1));
        graph[0].add(new Edge(4, 0, 2));

        graph[1].add(new Edge(7, 1, 3));
        graph[1].add(new Edge(1, 1, 2));
        
        graph[2].add(new Edge(3, 2, 4));

        graph[3].add(new Edge(1, 3, 5));

        graph[4].add(new Edge(2, 4, 3));
        graph[4].add(new Edge(5, 4, 5));

    }
    static class pair implements Comparable<pair>{
        int node;
        int path;
        public pair(int node,int path){
            this.node=node;
            this.path=path;
        }

        @Override
        public int compareTo(pair p2){
            return this.path-p2.path;
        }
    }
    public static void dikstra(ArrayList<Edge> graph[],int src){
        int dist[]=new int [graph.length]; // dist[i] = dist from source to i .
        // initialising the node value as infinity
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src, 0)); // src to src path is 0;
         
        boolean visited[]=new boolean[graph.length];

        while(!pq.isEmpty()){
            pair curr=pq.remove(); // --> property of pq that is removes the smallest initially
            if(visited[curr.node]==false){
                visited[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.weight;
                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.println(dist[i]);
        }
    }
    public static void main(String[] args) {
        int vertices=6;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        making(graph);
        dikstra(graph, 0);
    }
}
