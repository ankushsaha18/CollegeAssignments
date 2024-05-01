package classass;

public class Q6 {
    public static void main(String[] args) {
        String[] arr = {"Anc","bv","Anc","opi"};
        System.out.println(count(arr,"Anc"));
        Integer[] arr2 = {1,2,8,96,8,964,8};
        System.out.println(count(arr2,8));
    }
    public static <T> int count(T[] array,T item){
        int ans = 0;
        for(T obj : array){
            if(obj.equals(item)){
                ans++;
            }
        }
        return ans;
    }
}
