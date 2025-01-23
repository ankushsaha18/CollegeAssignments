package Assignment1;

public class Q1 {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1,5}, {1, 2},{1,4},{5,3},{2,4},{2,3}};
        int[][] M = createMatrix(edges,V);
        display(M,V);
    }
    public static int[][] createMatrix(int[][] edges,int V){
        int[][] M = new int[V+1][V+1];
        for(int[] e : edges){
            int start = e[0];
            int end = e[1];
            M[start][end] = 1;
            M[end][start] = 1;
        }
        return M;
    }
    public static void display(int[][] M,int V){
        for(int i = 1 ; i <= V ; i++){
            for(int j = 1 ; j <= V ; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}

