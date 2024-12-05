package GRAPHS._5;

import java.util.*;

public class connecting_cities {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    // public static void making(ArrayList<Edge> graph[],int arr[][]){
    //     for(int i=0;i<arr.length;i++){
    //         graph[i]=new ArrayList<>();
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[0].length;j++){
    //             int src=i;
    //             int dest=j;
    //             int cost=arr[i][j];

    //             Edge e=new Edge(src, dest, cost);
    //             graph[src].add(e);
    //         }
    //     }
    // }
     public static void making(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 2));
        graph[0].add(new Edge(0, 3, 3));
        graph[0].add(new Edge(0, 4, 4));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 4, 7));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 6));

        graph[3].add(new Edge(3, 0, 3));
        graph[3].add(new Edge(3, 2, 6));

        graph[4].add(new Edge(4, 0, 4));
        graph[4].add(new Edge(4, 1, 7));

        
     }
    static class info implements Comparable<info>{
        int node;
        int cost;

        public info(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        @Override
        public int compareTo(info i){
            return this.cost-i.cost;
        }
    }
    public static void connecting_cities_cost(int src,ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        
        PriorityQueue<info> pq=new PriorityQueue<>();
        
        pq.add(new info(src, 0));

        int totalCost=0;
        
        while(!pq.isEmpty()){
            info curr=pq.remove();
            if(visited[curr.node]==false){
                visited[curr.node]=true;
                totalCost=totalCost+curr.cost;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    pq.add(new info(e.dest, e.weight));
                }
            }
        }

        System.out.println(totalCost);

    }
    public static void main(String[] args) {
        int arr[][]={ {0,1,2,3,4} , {1,0,5,0,7} , {2,5,0,6,0} , {3,0,6,0,0} , {4,7,0,0,0} };
        int vertices=5;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        //making(graph,arr);
        making(graph);
        connecting_cities_cost(0,graph);
    }
}
