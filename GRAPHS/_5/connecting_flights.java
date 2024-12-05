package GRAPHS._5;

import java.util.*;
public class connecting_flights {
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
    public static void making(ArrayList<Edge> graph[],int arr[][]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int src=arr[i][0];
            int dest=arr[i][1];
            int weight=arr[i][2];

            Edge e=new Edge(src, dest, weight);
            graph[src].add(e);
        }
    }
    static class info implements Comparable<info>{
        int node;
        int stops;
        int price;

        public info(int node,int stops,int price){
            this.node=node;
            this.stops=stops;
            this.price=price;
        }

        @Override
        public int compareTo(info i){
            return this.stops-i.stops;
        }
    }
    public static int findingRoute(int vertices,int src,int dest,int stops,int arr[][]){
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        making(graph, arr);
        
        int dist[]=new int[vertices];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(src, 0, 0));
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr.stops>stops){
                break;
            }
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);

                int u=e.src;
                int wt=e.weight;
                int v=e.dest;
                if(curr.price+wt<dist[v] && curr.stops<=stops){
                    dist[v]=curr.price+wt;
                    q.add(new info(v, curr.stops+1, dist[v]));
                }
            }
        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }
        return dist[dest]; // returning the distance of the destination from source .
    }
    public static void main(String[] args) {
        int vertices=4;
        int arr[][]={ {0,1,100} , {1,2,100} , {2,0,100} , {1,3,600} , {2,3,200} };
        
        int src=0;
        int dest=3;
        int stops=1;
        System.out.println(findingRoute(vertices, src, dest, stops, arr));
        
    }
}
