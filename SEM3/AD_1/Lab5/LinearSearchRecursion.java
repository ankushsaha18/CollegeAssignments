public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,7,5,751,69,889};
        int element = 751;
        System.out.println(linearsearch(arr,element,0));
    }
    public static int linearsearch(int[] arr,int element,int i){
        if(i >= arr.length){
            return -1;
        }
        if(arr[i] == element){
            return i;
        }
        return linearsearch(arr,element,i+1);
    }
}
