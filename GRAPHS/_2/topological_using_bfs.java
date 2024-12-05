package GRAPHS._2;

import java.util.*;

public class topological_using_bfs {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.wt=wt;
            this.dest=dest;
        }
    }
    public static void making(ArrayList<Edge> []graphs){
        for(int i=0;i<graphs.length;i++){
            graphs[i]=new ArrayList<>();
        }
        // graphs[2].add(new Edge(2, 3, 1));

        // graphs[3].add(new Edge(3, 1, 1));

        // graphs[4].add(new Edge(4, 1, 1));
        // graphs[4].add(new Edge(4, 0, 1));

        // graphs[5].add(new Edge(5, 0, 1));
        // graphs[5].add(new Edge(5, 2, 1));

        graphs[0].add(new Edge(0, 1, 1));
        graphs[1].add(new Edge(1, 0, 1));

    }
    public static void inDeg(ArrayList<Edge> [] graph,int arr[]){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                arr[e.dest]++;
            }
        }
       
    }
    public static void topological_order(ArrayList<Edge> [] graph){
        int arr[]=new int[graph.length];
        inDeg(graph, arr);
        Queue<Integer> q=new LinkedList<>();

        // now adding the nodes whose inDeg is 0
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.println(curr);
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                arr[e.dest]--;
                if(arr[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String[] args) {
        int vertices = 2;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        making(graphs);


        topological_order(graphs);
        
    }
}
