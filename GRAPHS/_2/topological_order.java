package GRAPHS._2;

import java.util.*;

public class topological_order {
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
        graphs[2].add(new Edge(2, 3, 1));

        graphs[3].add(new Edge(3, 1, 1));

        graphs[4].add(new Edge(4, 1, 1));
        graphs[4].add(new Edge(4, 0, 1));

        graphs[5].add(new Edge(5, 0, 1));
        graphs[5].add(new Edge(5, 2, 1));

        // graphs[0].add(new Edge(0, 1, 1));
        // graphs[1].add(new Edge(1, 0, 1));

    }
    public static void top_sort( ArrayList<Edge>[] graphs){
        boolean visited[]=new boolean[graphs.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graphs.length;i++){
            if(!visited[i]){
                top_sort_util(graphs,i,visited,s);
            }
        }

        // when it is done printing the values inside the stack
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void top_sort_util(ArrayList<Edge> [] graphs,int curr,boolean visited[],Stack<Integer> s){
        visited[curr]=true;

        for(int i=0;i<graphs[curr].size();i++){
            Edge e=graphs[curr].get(i);
            // if the neighbour is visited --> not to do anything
            // if it is not visted then visit it

            if(visited[e.dest]==false){
                top_sort_util(graphs, e.dest, visited, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int vertices = 2;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        making(graphs);

        top_sort(graphs); // 5 4 2 3 1 0 
    }
}
