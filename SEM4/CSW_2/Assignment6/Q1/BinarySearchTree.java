package Assignment6.Q1;


class BSTNode{
    private int info;
    BSTNode left;
    BSTNode right;

    public BSTNode(int info) {
        this.info = info;
    }
    public int getInfo() {
        return info;
    }
}
public class BinarySearchTree {
    BSTNode root;

    public void insert(int val){
        root = insertRec(val,root);
    }
    private BSTNode insertRec(int val,BSTNode root){
        if(root == null){
            return new BSTNode(val);
        }
        if(val < root.getInfo()){
            root.left = insertRec(val,root.left);
        }else {
            root.right = insertRec(val,root.right);
        }
        return root;
    }

    public void preorder(BSTNode root){
        if(root != null){
            System.out.print(root.getInfo() + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(BSTNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.getInfo() + " ");
            inorder(root.right);
        }
    }

    public void postorder(BSTNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.getInfo() + " ");
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {20,50,10,30,80,60,100,45,76};
        for(int v : values){
            bst.insert(v);
        }
        System.out.print("Preorder: ");
        bst.preorder(bst.root);
        System.out.println();
        System.out.print("Inorder: ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.print("Postorder: ");
        bst.postorder(bst.root);
        System.out.println();
    }
}
