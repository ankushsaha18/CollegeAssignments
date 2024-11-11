public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,7,5,751,69,889};
        int element = 751;
        System.out.println(linearsearch(arr,element));
    }
    public static int linearsearch(int[] arr,int element){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
