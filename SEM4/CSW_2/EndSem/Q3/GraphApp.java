package EndSem.Q3;

import java.util.*;

class Graph{
    private int n;
    private int[][] adj;

    public Graph(int n, int[][] adj) {
        this.n = n;
        this.adj = adj;
    }

    public int getN() {
        return n;
    }
    public int[][] getAdj() {
        return adj;
    }
}
public class GraphApp {
    public static void BFS(Graph g,int s){
        int n = g.getN();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(int i = 0 ; i < n ; i++){
                if(g.getAdj()[u][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
    public static void DFS(Graph g){
        int n = g.getN();
        boolean[] visited = new boolean[n];
        for (int i = 0 ; i < n ; i++){
            if(!visited[i]){
                DFSHelper(g,visited,i);
            }
        }
        System.out.println();
    }
    public static void DFSHelper(Graph g,boolean[] visited,int u){
        visited[u] = true;
        System.out.print(u + " ");
        for (int i = 0 ; i < g.getN() ; i++){
            if(g.getAdj()[u][i] == 1 && !visited[i]){
                DFSHelper(g,visited,i);
            }
        }
    }
    public static void path(Graph g,int s,int d){
        int n = g.getN();
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent,-1);
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            for(int i = 0 ; i < n ; i++){
                if(g.getAdj()[u][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    parent[i] = u;
                    if(u == d) break;
                }
            }
        }
        if(parent[d] == -1){
            System.out.println("No path from " + s + " to " + d);
        }else{
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = d ; parent[i] != -1 ; i = parent[i]){
                ans.add(i);
            }
            Collections.reverse(ans);
            System.out.println("Path from " + s + " to " + d + "---");
            for(int i : ans){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printAdj(Graph g,int node){
        System.out.println("Nodes adjacent to " + node + " are ---");
        for (int i = 0 ; i < g.getN() ; i++){
            if(g.getAdj()[node][i] == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] adj = {
                {0,0,0,1,1},
                {0,0,1,0,0},
                {0,1,0,1,0},
                {1,0,1,0,0},
                {1,0,0,0,0}
        };
        Graph g = new Graph(adj.length,adj);
        BFS(g,0);
        DFS(g);
        path(g,0,2);
        printAdj(g,1);
    }
}
