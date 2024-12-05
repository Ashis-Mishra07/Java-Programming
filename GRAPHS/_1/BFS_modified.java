package GRAPHS._1;

import java.util.*;

public class BFS_modified {
    static class Edge {
        int source;
        int destination;
        int width;

        public Edge(int s, int d, int w) {
            this.width = w;
            this.source = s;
            this.destination = d;
        }
    }
    public static void making(ArrayList<Edge> [] graph){
       
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }
    public static void BFS(ArrayList<Edge> [] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];

        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }

        q.add(0);
        while(!q.isEmpty()){
            int curr=q.peek();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.destination);
                }
                q.remove(curr);
            }
            else{
                q.remove(curr);
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        making(graph);
        BFS(graph);
    }
}
