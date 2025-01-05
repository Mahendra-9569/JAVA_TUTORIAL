package graph1;
import java.util.ArrayList;
public class adjacency_list {
    static class edge{
        int src;
        int dest;
        int weight;
        edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(1, 2, 0));

        graph[1].add(new edge(2,1,0));
        graph[1].add(new edge(2,3,1));
        graph[1].add(new edge(2,5,2));

        graph[2].add(new edge(3,2,1));
        graph[2].add(new edge(3,4,4));

        graph[3].add(new edge(4,3,4));
        graph[3].add(new edge(4,5,3));

        graph[4].add(new edge(5,2,2));
        graph[4].add(new edge(5,4,3));

        int size  = graph[2].size();
        for(int i=0; i<size; i++){
            edge e = graph[2].get(i);
            System.out.println(e.src + " " + e.dest + " " + e.weight);
        }


    }
    
}
