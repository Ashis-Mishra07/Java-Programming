package GRAPHS._2.ASSIGNMENT;

import java.util.*;

import STACKS.stocks_stays;

public class _1 {
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

    public static void making(ArrayList<Edge>[] graphs) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));

        graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 2, 1));

        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 1, 1));
        graphs[2].add(new Edge(2, 3, 1));

        graphs[3].add(new Edge(3, 2, 1));
        graphs[3].add(new Edge(3, 4, 1));

        graphs[4].add(new Edge(4, 3, 1));
    }
    public static boolean isCycle(ArrayList<Edge>[] graphs){
        boolean visited[]=new boolean[graphs.length];

        for(int i=0;i<graphs.length;i++){
            if(visited[i]==false){
                if(isCycleUtil(graphs,i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graphs,int curr,boolean visited[],int parent){
        visited[curr]=true;

        for(int i=0;i<graphs[curr].size();i++){
            Edge e=graphs[curr].get(i);
            if(visited[e.dest]==false){
                isCycleUtil(graphs, e.dest, visited, curr);
            }
            else if(visited[e.dest]==true && e.dest!=parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        making(graphs);
        System.out.println(isCycle(graphs));
    }
}
