package Assignment2.Assignment2_2.Q11;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr = {1,8,4,55,96,47,15,26};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }
        System.out.println("Elements after dequeuing from Priority Queue:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}