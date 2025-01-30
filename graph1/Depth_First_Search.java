package graph1;
import java.util.*;

public class Depth_First_Search {
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
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        s.push(0);
    
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!visited[curr]){
                System.out.println(curr);
                visited[curr] = true;
                for(int i = 0 ; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    if(!visited[e.dest]){
                        s.push(e.dest);
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
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 4));

        DFS(graph);
    }
    
}
