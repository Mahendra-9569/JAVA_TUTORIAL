package graph1;
import java.util.*;

public class Breadth_First_Search {
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

    public static void DFS(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.println(curr);
                visited[curr] = true;
                for(int i = 0 ; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    if(!visited[e.dest]){
                        q.add(e.dest);
                    }
                }
            }
        }

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
        graph[2].add(new Edge(2, 4, 4));
        graph[2].add(new Edge(2, 1, 4));
        graph[3].add(new Edge(3, 1, 4));
        graph[3].add(new Edge(3, 2, 3));
        graph[4].add(new Edge(4, 2, 2));
        
        // int size = graph[2].size();
        // for(int i=0; i<size; i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.src + " " + e.dest + " " + e.weight);
        // }


        DFS(graph);
    }
    
}
