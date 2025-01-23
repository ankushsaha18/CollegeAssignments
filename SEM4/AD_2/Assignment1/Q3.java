package Assignment1;

import java.util.LinkedList;
import java.util.Queue;

import static Assignment1.Q2.createList;

public class Q3 {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1,5}, {1, 2},{1,4},{5,3},{2,4},{2,3}};
        LinkedList<Integer>[] list = createList(edges,V);
        bfs(list,V);
    }
    public static void bfs(LinkedList<Integer>[] list, int V){
        boolean[] visited = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for (int i : list[u]) {
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
