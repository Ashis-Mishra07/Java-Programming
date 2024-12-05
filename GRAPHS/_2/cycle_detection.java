package GRAPHS._2;

import java.util.ArrayList;

public class cycle_detection {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void making(ArrayList<Edge> [] graphs ){
        for(int i=0;i<graphs.length;i++){
            graphs[i]=new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));

        graphs[1].add(new Edge(1, 0, 1));

        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 3, 1));
        graphs[1].add(new Edge(1, 4, 1));

        graphs[3].add(new Edge(3, 2, 1));

        graphs[4].add(new Edge(4, 2, 1));       
    }

    public static boolean isCycle(ArrayList<Edge> [] graphs){ // O ( V + E )
        boolean visited[]=new boolean[graphs.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        /* 
           might be question why we are traversing for all the elements , this is becoz for discrete graphs or 
         * not joined graphs if for 0 1 2 3 it is not found to have any cycle then it goes for the next element
         * which is not in 1st part . So traversing all the elements are necessary .
         
         */

        for(int i=0;i<graphs.length;i++){
            if(visited[i]==false){
                if(isCycleUtil(graphs,visited,i,-1)==true){
                    return true;
                } // -1 because we are starting so initaaly so parent so giving its value as -1
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge> [] graphs,boolean visited[],int curr,int parent){

        visited[curr]=true; // making the visited for that element to be  true first .

        for(int i=0;i<graphs[curr].size();i++){

            Edge e=graphs[curr].get(i);// getting all its child

            //case 3
            // when it is not visited  so normal calling it .
            if(visited[e.dest]==false ){
                if(isCycleUtil(graphs, visited, e.dest, curr)){
                     return true;
                }
               
            }

            // case 1
            // when it is visited and it is not its parent then definite true  
            else if(visited[e.dest]==true && e.dest!=parent){
                return true;
            }
            // case 2 --> do nothing 
        }
        return false;
    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<Edge> [] graphs=new ArrayList[vertices];
        making(graphs);
        System.out.println(isCycle(graphs));
    }
}
