package Assignment6.Q5;

public class DeleteBST {
    static class Node {
        int info;
        Node left,right;

        public Node(int info) {
            this.info = info;
        }
    }

    public static Node delete(Node root,int val){
        if(root == null){
            return null;
        }
        if(root.info > val){
            root.left = delete(root.left,val);
        }
        else if (root.info < val){
            root.right = delete(root.right,val);
        }else {
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            Node minNode = findMin(root.right);
            root.info = minNode.info;
            root.right = delete(root.right,minNode.info);
        }
        return root;
    }
    public static Node findMin(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder (root.left);
            System.out.print(root.info + " ");
            inorder (root.right) ;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        System.out.print("Inorder before deletion: ");
        inorder(root);
        System.out.println();
        delete(root,15);
        System.out.print("Inorder after deletion: ");
        inorder(root);
    }
}
