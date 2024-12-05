package GRAPHS._1;

import java.util.ArrayList;

public class making {
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
    public static void main(String[] args) {
        int vertices=5;
        // array is to be created with length equal to the no of vertices .
        ArrayList<Edge> [] graph=new ArrayList[vertices];  //    int arr[] =new int[vertices]; 
        //since array is created so at each position null value is stored .

        
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();// make it all empty value first
        }


        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));



        //2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
