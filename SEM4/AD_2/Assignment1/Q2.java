package Assignment1;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1,5}, {1, 2},{1,4},{5,3},{2,4},{2,3}};
        LinkedList<Integer>[] list = createList(edges,V);
        display(list,V);
    }
    public static LinkedList<Integer>[] createList(int[][] edges,int V){
        LinkedList<Integer>[] list = new LinkedList[V+1];
        for (int i = 0; i <= V ; i++) {
            list[i] = new LinkedList<>();
        }
        for (int[] e : edges) {
            int start = e[0];
            int end = e[1];
            list[start].addLast(end);
            list[end].addLast(start);
        }
        return list;
    }
    public static void display(LinkedList<Integer>[] list,int V){
        for (int i = 1; i <= V ; i++) {
            System.out.println(list[i]);
        }
    }
}
