package Assignment6.Q7;

import java.util.LinkedList;

public class GraphDFS {
    int V;
    LinkedList<Integer>[] adj;
    GraphDFS(int v) {
        V = v;
        adj= new LinkedList[v];
        for ( int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    public void DFSHelper(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]){
            if(!visited[n]){
                DFSHelper(n,visited);
            }
        }
    }
    public void DFS(int v){
        boolean[] visited = new boolean[V];
        DFSHelper(v,visited);
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.print("DFS from vertex 2: ");
        g.DFS (2);
    }
}
