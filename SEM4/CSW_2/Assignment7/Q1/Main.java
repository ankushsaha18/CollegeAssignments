package Assignment7.Q1;

interface StringProcessor {
    int process(String input);
}
public class Main {
    public static void main(String[] args) {
        StringProcessor lengthCalc = input -> input.length();
        String str1 = "Hello World";
        int length = lengthCalc.process(str1);
        System.out.println("The length of the string \"" + str1 + "\" is: " + length);
    }
}