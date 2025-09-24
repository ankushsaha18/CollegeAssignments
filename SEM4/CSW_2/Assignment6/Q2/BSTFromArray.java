package Assignment6.Q2;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int info;
    Node left;
    Node right;

    public Node(int info) {
        this.info = info;
    }
}
public class BSTFromArray {
    public static Node createTree(int[] values,int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node node = new Node(values[mid]);
        node.left = createTree(values,start,mid-1);
        node.right = createTree(values,mid+1,end);
        return node;
    }
    public static void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.info + " ");

            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        int[] values = {0, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Node root = createTree(values,0,values.length-1);
        levelOrderTraversal(root);
    }
}
