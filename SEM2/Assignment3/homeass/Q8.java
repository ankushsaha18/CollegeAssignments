package homeass;

public class Q8 {
    public static void main(String[] args) {
        Toh(3,"A","B","C");
    }
    public static void Toh(int n,String src,String help,String dest){
        if(n == 1){
            System.out.println("Transferred disk " + n + " from " + src + " to " + dest);
            return;
        }
        Toh(n-1,src,dest,help);
        System.out.println("Transferred disk " + n + " from " + src + " to " + dest);
        Toh(n-1,help,src,dest);
    }
}
