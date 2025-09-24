package LabExam;

import java.util.Arrays;
import java.util.LinkedList;

public class CycleDeetectDFS {
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{0,1},{1,2},{2,0},{2,3}};
        System.out.println(Arrays.toString(adj_list(V, edges)));
        System.out.println(isCycle(V,adj_list(V,edges)));
    }
    public static LinkedList<Integer>[] adj_list(int V,int[][] edges){
        LinkedList<Integer>[] ans = new LinkedList[V];
        for (int i = 0 ; i < V ; i++){
            ans[i] = new LinkedList<>();
        }
        for(int[] edge : edges){
            int start = edge[0];
            int end = edge[1];
            ans[start].add(end);
            ans[end].add(start);
        }
        return ans;
    }
    public static boolean isCycle(int V,LinkedList<Integer>[] adj){
        boolean[] visited = new boolean[V];
        for (int i = 0 ; i < V ; i++){
            if(!visited[i]){
                if(dfs(visited,adj,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(boolean[] visited,LinkedList<Integer>[] adj,int current,int prev){
        visited[current] = true;
        for(int node : adj[current]){
            if(!visited[node]){
                return dfs(visited,adj,node,current);
            }
            if(node != prev){
                return true;
            }
        }
        return false;
    }
}
