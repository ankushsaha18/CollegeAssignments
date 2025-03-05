package Assignment1;

import java.util.*;

class DisjointSet {
    private int[] parent;
    private int[] size;

    public DisjointSet(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];
        Arrays.fill(size, 1);
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int findSet(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = findSet(parent[node]);
    }

    public void union(int u, int v) {
        int u_ulp = findSet(u);
        int v_ulp = findSet(v);
        if (u_ulp == v_ulp) {
            return;
        }
        if (size[u_ulp] < size[v_ulp]) {
            parent[u_ulp] = v_ulp;
            size[v_ulp] += size[u_ulp];
        } else {
            parent[v_ulp] = u_ulp;
            size[u_ulp] += size[v_ulp];
        }
    }
}

public class Q5 {
    public static int spanningTree(int V, List<List<List<Integer>>> adj) {
        List<int[]> edges = new ArrayList<>();
        int sum = 0;
        DisjointSet d = new DisjointSet(V);

        for (int u = 1; u <= V; u++) {
            for (List<Integer> neighbor : adj.get(u)) {
                int v = neighbor.get(0);
                int wt = neighbor.get(1);
                if (u < v) {
                    edges.add(new int[]{wt, u, v});
                }
            }
        }

        edges.sort(Comparator.comparingInt(o -> o[0]));

        for (int[] edge : edges) {
            int wt = edge[0];
            int u = edge[1];
            int v = edge[2];

            if (d.findSet(u) != d.findSet(v)) {
                sum += wt;
                d.union(u, v);
            }
        }
        return sum;
    }

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
}
