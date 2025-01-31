package graph1;                          
import java.util.*;

public class Has_Path {
    static class Edge{
        int src;
        int dest;                        
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;              
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static boolean haspath(ArrayList<Edge>[] graph, int curr, int dest, boolean visited[]){
        if(curr == dest){
            return true;
        }
        visited[curr] = true;
        for(int i = 0 ; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
               return haspath(graph, e.dest, dest, visited);

            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 0----------1
        //            /\
        //           /  \
        //          /    \
        //         /      \
        //        /        \
        //       /          \
        //      2------------3
        //       |   
        //       | 
        //       | 
        //       |
        //       4
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 2));
        graph[2].add(new Edge(2, 3, 1));

        boolean visited[] = new boolean[v];
        System.out.println(haspath(graph, 0, 3, visited));
    }
    
}
