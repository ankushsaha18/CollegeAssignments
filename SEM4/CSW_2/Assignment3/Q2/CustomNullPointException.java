package Assignment3.Q2;

class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String msg) {
        super(msg);
    }
}
public class CustomNullPointException {
    public static void main(String[] args) {
        try {
            String str = null;
            if (str == null) {
                throw new CustomNullPointerException("Custom NullPointerException: The value is null!");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
    Custom NullPointerException: The value is null!
 */
