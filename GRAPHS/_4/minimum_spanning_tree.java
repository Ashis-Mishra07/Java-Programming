package GRAPHS._4;

import java.util.*;

public class minimum_spanning_tree {
    static class Edge{
        int src;
        int weight;
        int dest;
        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void making(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int weight;

        public Pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }

        @Override
        public int compareTo(Pair p1){
            return this.weight-p1.weight;
        }
    }
    public static void printMST(ArrayList<Edge> graph[],int src){
        boolean visited[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        pq.add(new Pair(src, 0));
        int totalWeight=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(visited[curr.node]==false){
                visited[curr.node]=true;
                totalWeight=totalWeight+curr.weight;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }
        System.out.println(" total weight is "+totalWeight);
    }
    public static void main(String[] args) {
        int vertices=4;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        making(graph);
        printMST(graph, 0);
        
    }
}
