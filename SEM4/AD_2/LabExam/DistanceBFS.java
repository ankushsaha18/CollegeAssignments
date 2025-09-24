package LabExam;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceBFS {
    public static void main(String[] args) {
        int V = 8;
        char[][] edges = {{'a','b'},{'b','c'},{'a','c'},{'c','f'},{'f','a'},{'d','e'},{'e','h'},{'f','g'},{'g','d'}};
        LinkedList<Character>[] adj = adj_list(V,edges);
        for(int i = 0 ; i < V ; i++){
            System.out.print((char)('a' + i));
            for(char j : adj[i]){
                System.out.print(" -> " + j);
            }
            System.out.println();
        }
        int[] distance = bfsDistance(V,adj,'a');
        System.out.println("Distance between a and h is: " + distance['h' - 'a']);
    }
    public static LinkedList<Character>[] adj_list(int V, char[][] edges){
        LinkedList<Character>[] ans = new LinkedList[V];
        for (int i = 0 ; i < V ; i++){
            ans[i] = new LinkedList<>();
        }
        for(char[] edge : edges){
            char start = edge[0];
            char end = edge[1];
            ans[start-97].add(end);
            ans[end-97].add(start);
        }
        return ans;
    }
    public static int[] bfsDistance(int V,LinkedList<Character>[] adj,char u){
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];
        Queue<Character> q = new LinkedList<>();
        q.add(u);
        visited[u-'a'] = true;
        distance[u-'a'] = 0;
        while (!q.isEmpty()){
            char node = q.poll();
            for (char neighbor : adj[node - 'a']) {
                if (!visited[neighbor - 'a']) {
                    visited[neighbor - 'a'] = true;
                    distance[neighbor - 'a'] = distance[node - 'a'] + 1;
                    q.add(neighbor);
                }
            }
        }
        return distance;
    }
}
