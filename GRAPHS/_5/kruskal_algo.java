package GRAPHS._5;
import java.util.*;
public class kruskal_algo {
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override

        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    public static void making(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 0, 10));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 0, 15));
        graph.add(new Edge(2, 3, 50));
        graph.add(new Edge(3, 0, 30));
        graph.add(new Edge(3, 1, 40));
        graph.add(new Edge(3, 2, 50));
    }

    static int num = 4;
    static int parent[] = new int[num];
    static int rank[] = new int[num];

    public static void intiating() {
        for (int i = 0; i < num; i++) {
            parent[i] = i;
        }
    }
    public static int find(int num){
        if(num==parent[num]){
            return num;
        }
        return parent[num]=find(parent[num]);
    }
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            parent[parA]=parB;
            rank[parB]++;
        }
        else if(rank[parA]<rank[parB]){
            parent[parA]=parB;
        }
        else{
            parent[parB]=parA;
        }
    }
    public static void findingCost(ArrayList<Edge> graph,int vertices){
        intiating();

        Collections.sort(graph);
        int totalCost=0;
        int count=0;
        for(int i=0;count<vertices-1;i++){
            Edge e=graph.get(i);
            // src=e.src   dest=e.dest   cost=e.weight;
            int parA=find(e.src);
            int parB=find(e.dest);
            if(parA!=parB){
                union(parA, parB);
                totalCost+=e.weight;
                count++;
            }
        }
        System.out.println(totalCost);
    }
    public static void main(String[] args) {
        int vertices=4;
        ArrayList<Edge> graph = new ArrayList<>();
        making(graph);
        findingCost(graph, vertices);
    }
}

