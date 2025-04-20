package Assignment3.Q8;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            checkValue(15);
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " +
                    e.getMessage());
        }
    }
    public static void checkValue(int value) throws CustomCheckedException {
        if (value > 10) {
            throw new CustomCheckedException("The value " + value + " exceeds the allowed limit of 10.");
        }
        System.out.println("Value " + value + " is within the allowed limit.");
    }
}
