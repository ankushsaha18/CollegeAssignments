package classass;

public class Q5 {
    public static void main(String[] args) {
        String[] stringArray = {"Ankush","Rahul","Kunal","hardik"};
        Integer[] intArray = {2,5,6,7,9};
        Character[] charArray = {'c','e','o','r'};
        printArray(stringArray);
        printArray(intArray);
        printArray(charArray);
    }
    public static < E > void printArray( E[] inputArray){
        System.out.print("[ ");
        for(int i = 0; i<inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
        System.out.println("]");
    }
}
