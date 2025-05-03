package Assignment6.Q3;

public class CheckBST {
    static class Node{
        int info;
        Node left,right;

        public Node(int info) {
            this.info = info;
        }
    }

    public static boolean isBST(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if((root.info < min) || (root.info > max)){
            return false;
        }
        return isBST(root.left,min,root.info) && isBST(root.right,root.info,max);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(30);
        root.right = new Node(20);
        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
