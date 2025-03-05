package Assignment1;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                {1, 5, 2}, {1, 2, 5}, {1, 4, 2}, {5, 3, 7}, {2, 4, 2}, {2, 3, 1}
        };

        List<List<List<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(Arrays.asList(v, wt));
            adj.get(v).add(Arrays.asList(u, wt));
        }

        System.out.println("Minimum Weight = " + spanningTree(V, adj));
    }
    public static int spanningTree(int V, List<List<List<Integer>>> adj) {
        int sum = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[] visited = new boolean[V+1];

        pq.add(new int[]{0,1}); // first node format {weight,node}

        while (!pq.isEmpty()){
            int[] a = pq.poll();
            int wt = a[0];
            int node = a[1];

            if(visited[node]) continue;

            sum += wt;
            visited[node] = true;
            for(List<Integer> lst : adj.get(node)){
                int adj_node = lst.get(0);  // adj list given in format {node,weight}
                int adj_wt = lst.get(1);
                if(!visited[adj_node]){
                    pq.add(new int[]{adj_wt,adj_node});
                }
            }
        }
        return sum;
    }
}