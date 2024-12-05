package GRAPHS._2;

import java.util.*;

public class bipartite {
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
        graphs[0].add(new Edge(0, 2, 1));
        graphs[0].add(new Edge(0, 3, 1));

        // graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 3, 1));

        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 3, 1));

        // graphs[3].add(new Edge(3, 1, 1));
        // graphs[3].add(new Edge(0, 4, 1));

        // graphs[4].add(new Edge(4, 2, 1));
        // graphs[4].add(new Edge(4, 3, 1));
    }

    public static boolean isBiPartite(ArrayList<Edge>[] graphs) {
        int color[] = new int[graphs.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graphs.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graphs[curr].size();j++){
                        Edge e=graphs[curr].get(j);
                        if(color[e.dest]==-1){
                            q.add(e.dest);
                            if(color[curr]==1){
                                color[e.dest]=0;
                            }
                            else{
                                color[e.dest]=1;
                            }
                        }
                        else if(color[e.dest]==color[curr]){
                            return false;
                        }
                    }
                }
            }

        }
        return true;   
     }

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        making(graphs);
        System.out.println(isBiPartite(graphs));
    }
}
