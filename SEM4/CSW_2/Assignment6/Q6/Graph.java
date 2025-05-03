package Assignment6.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    private int V;
    private int[][] adj_matrix;
    private List<Integer>[] adj_list;

    public Graph(int v){
        this.V = v;
        adj_matrix = new int[v+1][v+1];
        adj_list = new ArrayList[v];
        for(int i = 0 ;  i < v ; i++){
            adj_list[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u,int v){
        adj_matrix[u][v] = 1;
        adj_matrix[v][u] = 1;
        adj_list[u-1].add(v);
        adj_list[v-1].add(u);
    }

    public void display(){
        System.out.println("Adjacency Matrix ---");
        for(int i = 1 ; i <= V ; i++){
            for(int j = 1 ; j < V ; j++){
                System.out.print(adj_matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacency List ---");
        System.out.println(Arrays.toString(adj_list));
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1,4);
        g.addEdge(1,5);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.display();
    }
}
