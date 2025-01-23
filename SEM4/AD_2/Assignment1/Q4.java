package Assignment1;

import java.util.LinkedList;
import java.util.Stack;

import static Assignment1.Q2.createList;

public class Q4 {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1,5}, {1, 2},{1,4},{5,3},{2,4},{2,3}};
        LinkedList<Integer>[] list = createList(edges,V);
        dfs(list,V);
    }
    public static void dfs(LinkedList<Integer>[] list, int V){
        boolean[] visited = new boolean[V+1];
        Stack<Integer> s = new Stack<>();
        s.add(1);
        visited[1] = true;
        while (!s.isEmpty()){
            int u = s.pop();
            System.out.print(u + " ");
            for (int i : list[u]) {
                if(!visited[i]){
                    s.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
