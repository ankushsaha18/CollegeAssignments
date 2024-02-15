import java.util.Scanner;

public class Q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter todays day:");
        int day = sc.nextInt();
        System.out.print("Enter the future day after today you want:");
        int n = sc.nextInt();
        System.out.println("Todays is " + dayOfThatNumber(day));
        System.out.println("Future day is " + dayOfThatNumber(day + n));

    }

    public static String dayOfThatNumber(int day) {
        day %= 7;
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "";
        }
    }
}
