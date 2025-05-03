package Assignment6.Q4;

class Country{
    private String name;
    private long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return name + " " + population;
    }
}

class BNode{
    Country country;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.country = country;
    }
}

public class BSTCountry {
    BNode root;
    public BSTCountry() {}

    public void insert(Country c){
        root = insertRec(root,c);
    }
    private BNode insertRec(BNode root,Country c){
        if(root == null){
            return new BNode(c);
        }
        if(c.getPopulation() < root.country.getPopulation()){
            root.left = insertRec(root.left,c);
        }else {
            root.right = insertRec(root.right,c);
        }
        return root;
    }

    public void inorder(BNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.country.getName());
            inorder(root.right);
        }
    }

    public Country findMax(BNode root){
        while (root.right != null){
            root = root.right;
        }
        return root.country;
    }
    public Country findMin(BNode root){
        while (root.left != null){
            root = root.left;
        }
        return root.country;
    }

    public static void main(String[] args) {
        BSTCountry tree = new BSTCountry();
        tree.insert(new Country("India",14000000));
        tree.insert(new Country("China",17000000));
        tree.insert(new Country("USA",8800000));
        tree.insert(new Country("UK",5900000));
        System.out.println("Inorder traversal ---");
        tree.inorder(tree.root);
        System.out.println("Max Population = " + tree.findMax(tree.root));
        System.out.println("Min Population = " + tree.findMin(tree.root));
    }
}
